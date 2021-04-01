package com.example.demo.controller;

import com.example.demo.entity.CartEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.ProductsEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "cart")
public class ControllerCart {
    @Autowired
    private ProductsService productsService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private ProductPortfolioService productPortfolioService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    AccountRepository accountRepository;


    @RequestMapping(value = "addcart/{id}", method = RequestMethod.GET)
    public String viewAdd(ModelMap mm, HttpSession session, @PathVariable("id") int id) {
        HashMap<Integer, CartEntity> cartItems = (HashMap<Integer, CartEntity>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        ProductsEntity productsEntity = productsService.getfindById(id);
        if (productsEntity != null) {
            if (cartItems.containsKey(id)) {
                CartEntity item = cartItems.get(id);
                item.setProductsEntity(productsEntity);
                item.setQuantity(item.getQuantity() + 1);
                cartItems.put(id, item);
            } else {
                CartEntity item = new CartEntity();
                item.setProductsEntity(productsEntity);
                item.setQuantity(1);
                cartItems.put(id, item);
            }
        }
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        session.setAttribute("myCartNum", cartItems.size());
        return "/cart";
    }

    public double totalPrice(HashMap<Integer, CartEntity> cartItems) {
        int count = 0;
        for (Map.Entry<Integer, CartEntity> list : cartItems.entrySet()) {
            count += list.getValue().getProductsEntity().getPrice() * list.getValue().getQuantity();
        }
        return count;
    }


    @RequestMapping(value = "sub/{id}", method = RequestMethod.GET)
    public String viewUpdate(ModelMap mm, HttpSession session, @PathVariable("id") Integer id) {
        HashMap<Integer, CartEntity> cartItems = (HashMap<Integer, CartEntity>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        session.setAttribute("myCartItems", cartItems);
        return "/cart";
    }


    @RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
    public String viewRemove(ModelMap mm, HttpSession session, @PathVariable("id") Integer id) {
        HashMap<Integer, CartEntity> cartItems = (HashMap<Integer, CartEntity>) session.getAttribute("myCartItems");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        if (cartItems.containsKey(id)) {
            cartItems.remove(id);
        }
        session.setAttribute("myCartItems", cartItems);
        session.setAttribute("myCartTotal", totalPrice(cartItems));
        session.setAttribute("myCartNum", cartItems.size());
        return "/cart";
    }

    @RequestMapping(value = "/checkoutforms", method = RequestMethod.GET)
    public String addProducts(Model model,HttpSession session,
                              @ModelAttribute("Orders") OrderEntity orderEntity ) {
        model.addAttribute("transactionEntity",new TransactionEntity());
        return "orders";
    }


    @RequestMapping(value = "/Transaction", method = RequestMethod.GET)
    public String viewCheckout(ModelMap mm, HttpSession session, @ModelAttribute("transactionEntity")
                                       TransactionEntity transactionEntity)  throws NoSuchAlgorithmException {
        HashMap<Integer, CartEntity> cartItems = (HashMap<Integer, CartEntity>) session.getAttribute("myCartItems");
        TransactionEntity transactionEntity1 = transactionService.newTransaction(transactionEntity);
        transactionEntity1.setTransactiondate(new Timestamp(new Date().getTime()));
        transactionEntity1.setTransactionstatus(true);
        transactionEntity1.setSecurity(getSHAHash(transactionEntity.getSecurity()));
        for (Map.Entry<Integer, CartEntity> entry : cartItems.entrySet()) {
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setTransactionEntity(transactionEntity1);
            orderEntity.setProductsEntity(entry.getValue().getProductsEntity());
            orderEntity.setTotal(entry.getValue().getProductsEntity().getPrice());
            orderEntity.setSale(entry.getValue().getProductsEntity().getSale());
            orderEntity.setQuantity(entry.getValue().getQuantity());
/*
            receiptItem.setReceiptItemStatus(true);
*/
            ordersService.newOrders(orderEntity);
        }
        session.removeAttribute("myCartNum");
       /* session.getAttribute("myCartNum");*/
        session.removeAttribute("myCartItems");
        return "shipping";
    }
    public static String getSHAHash(String input) throws NoSuchAlgorithmException {

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            return convertByteToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertByteToHex(byte[] data) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }


}


