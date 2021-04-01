package com.example.demo.controller;

import com.example.demo.entity.*;

import java.io.File;
import java.sql.Timestamp;
import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/*
import com.example.demo.model.AddtoCart;*/
import com.example.demo.repository.*;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@SessionAttributes("email")
public class WebController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private ProductsService productsService;

    @Autowired
    private ProductPortfolioService productPortfolioService;

@Autowired
private TransactionService transactionService;
@Autowired
private OrdersService ordersService;

    /*   @Autowired
       private ShoppingCartService shoppingCartService;
   */
    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    UserRepository userRepository;


    @Autowired
    AccountRepository accountRepository;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// HOME ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// HOME ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
 /*   @RequestMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("ProductList", productsService.getProductsEntities());
        List<ProductPortfolioEntity> productPortfolios = productPortfolioService.ProductPortfolioEntityAll();
        model.addAttribute("productPortfolios", productPortfolios);
        return "home";
    }*/
    @RequestMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("ProductList", productsService.getProductsEntities());
        List<ProductPortfolioEntity> productPortfolios = productPortfolioService.ProductPortfolioEntityAll();
        model.addAttribute("productPortfolios", productPortfolios);
        return "home";
    }

    @RequestMapping("/manager")
    public String getPlayProject(Model model) {
        return "index";
    }

    @RequestMapping("/design")
    public String getdesign(Model model) {
        return "desgin";
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// HOME ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    @RequestMapping("/ok")
    public String getAllProduct(Model model) {

        List<ProductPortfolioEntity> productPortfolio = productPortfolioService.ProductPortfolioEntityAll();
        Pageable secondPageWithFiveElements = PageRequest.of(1, 4);
        model.addAttribute("ProductList", productsService.getProductsEntities());
        model.addAttribute("ProductPortfolio", productPortfolio);
        return "demoweb";
    }*/

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/orders")
    public String getOrders(Model model) {
        model.addAttribute("orders", ordersService.getOrderEntities());
        model.addAttribute("transaction", transactionService.transactionEntities());
        return "ordertest";
    }


    @RequestMapping(value = {"/viewdetails/{id}/{transactionname}"})
    public String getViewdetails(ModelMap model, @PathVariable int id,
                                 @PathVariable String transactionname) {
        List<OrderEntity> ordersEntities = ordersService.getIDTransaction(id);
        List<TransactionEntity> transactionsEntities = transactionService.transactionEntities();
        model.addAttribute("transactionsEntities", transactionsEntities);
        model.addAttribute("transactionname", transactionname);
        model.addAttribute("ordersEntities", ordersEntities);
        return "viewdetails";
    }

    @RequestMapping(value = {"/invoices"})
    public String getinvoice(ModelMap model, @RequestParam("id") int id) {
        List<OrderEntity> ordersEntities = ordersService.getIDTransaction(id);
        TransactionEntity transactionEntity = transactionService.getfintbyTransaction(id);
        model.addAttribute("transactionEntity", transactionEntity);
        model.addAttribute("ordersEntities", ordersEntities);
        return "invoice";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// ID ID - PRODUCTS  ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = {"/detail/{id}"})
    public String getIdProducts(@PathVariable int id, ModelMap modelMap, HttpSession session) {
        ProductsEntity productsEntity = productsService.getfindById(id);
     /*          List<ProductPortfolioEntity> productPortfolioEntities = productPortfolioService.ProductPortfolioEntityAll();
        if( session.getAttribute("Cart" ) != null){
            List<Cart> carts = (List<Cart>) session.getAttribute("cart");
            modelMap.addAttribute("cart",carts.size());
        }*/
        modelMap.addAttribute("productsEntity", productsEntity);
        modelMap.addAttribute("ProductList1", productsService.getIdProductsPortfolio(1));
        modelMap.addAttribute("ProductList2", productsService.getIdProductsPortfolio(2));
        modelMap.addAttribute("ProductList3", productsService.getIdProductsPortfolio(3));
        modelMap.addAttribute("ProductList4", productsService.getIdProductsPortfolio(4));

        return "website";
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////  SEARCH -- PRODUCTS   ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/searchproducts")
    public String getAllProductssearch(Model model) {
        model.addAttribute("ProductList", productsService.getProductsEntities());
        List<ProductPortfolioEntity> productPortfolios = productPortfolioService.ProductPortfolioEntityAll();
        model.addAttribute("productPortfolios", productPortfolios);
        return "searchproducts";
    }

    @RequestMapping("/search")
    public String getsearch(Model model) {
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////MAKE COLOR//////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        return "searchbox";
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////  SEARCH - ID PRODUCTS - NAME PORTFOLIO   ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
/*    @RequestMapping(value = {"/products/{id}/{portfolio}"})
    public String defaul(ModelMap model, @PathVariable int id, @PathVariable String portfolio) {
        List<ProductsEntity> productsEntityList = productsService.getIdProductsPortfolio(id);
        List<ProductPortfolioEntity> productPortfolioEntities = productPortfolioService.ProductPortfolioEntityAll();
        model.addAttribute("productPortfolioEntities", productPortfolioEntities);
        model.addAttribute("portfolio", portfolio);
        model.addAttribute("productsEntityList", productsEntityList);
        return "demo";
    }*/
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////  CART -- END   ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/cart")
    public String getCart(Model model) {
      /*  model.addAttribute("ProductList", productsService.getAllProductsList());
        List<ProductPortfolioEntity> productPortfolio = productPortfolioService.ProductPortfolioEntityAll();
        model.addAttribute("ProductPortfolio", productPortfolio);*/
        return "cart";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// ADMIN ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// ADMIn ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping("/admin")
    public String getAllAccount(Model model) {
        model.addAttribute("accounts", accountService.getUsersAlldest());
        return "dashboard";
    }

/*

    @RequestMapping(value = "/admin/demo")
    public String getListBook(Model model) {
        List<UserEntity> userEntityList = userService.getUsers();
        model.addAttribute("users", userEntityList);
        return "demolistuser";
    }
*/


    @RequestMapping("/invoice")
    public String getInvoice() {

        // NEED MySQL -- HOA DON
        return "invoice";
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////TABLE ACCOUNT ADMIN////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping(value = "/tables")
    public String showTeacherPage(Model model) {
        model.addAttribute("accounts", accountService.getAccounts());
        return "tables";
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////NEW ACCOUNT ADMIN ADD////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/contacts")
    public String getContact(Model model) {
        model.addAttribute("accountlist", userService.getUsers());
        model.addAttribute("account", new UserEntity());
        model.addAttribute("accounts", accountService.getAccounts());

        return "contacts";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////NEW ACCOUNT USER ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "/AccountAdminAdd", method = RequestMethod.POST)
    public String registerAccountAdminAdd(UserEntity userEntity, Model model) {
        UserEntity newUserEntity = new UserEntity();
        newUserEntity.setUsername(userEntity.getUsername());
        newUserEntity.setPassword(new BCryptPasswordEncoder().encode(userEntity.getPassword()));
        List<RoleEntity> roleEntityList = new ArrayList<>();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName("MANAGER");
        roleEntityList.add(roleEntity);
        newUserEntity.setEnabled(1);
        newUserEntity.setUserRoleEntities(roleEntityList);
        if (userService.isException(newUserEntity)) {
            return "redirect:contacts";
        } else {
            userService.saveAccount(newUserEntity);
            userService.saveAccount(newUserEntity);
            AccountEntity accountEntity = new AccountEntity();
            accountEntity.setEmail(userEntity.getAccountEntity().getEmail());
            accountEntity.setDate(new Timestamp(new Date().getTime()));
            accountEntity.setPhonenumber(userEntity.getAccountEntity().getPhonenumber());
            accountEntity.setUserEntity(userService.getAccountByUsername(newUserEntity.getUsername()));
            accountService.saveAccount(accountEntity);
        }
        return "redirect:contacts";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////DELETE ACCOUNT USER ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id, Model model) {
        userRepository.deleteById(id);

        return "delete";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////EDIT USER ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value = "/editAccountUser")
    public String editAccount(@RequestParam("id") int id, Model model) {
        UserEntity userEntity =  userService.getEditUser(id);
        model.addAttribute("account", userEntity);
        model.addAttribute("accounts", userService.getAccounts());
        model.addAttribute("type", "update");
        return "editaccount";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////NEW EDIT ACCOUNT USER ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping(value = "/editAccount", method = RequestMethod.POST)
    public String editUserNewUser(UserEntity userEntity, AccountEntity accountEntity, RoleEntity roleEntity, Model model) {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(userEntity);
        userEntities.add(accountEntity.getUserEntity());
        ///////////////////////////////////////////////////////
        userEntity.setUsername(userEntity.getUsername());
        userEntity.setPassword(new BCryptPasswordEncoder().encode(userEntity.getPassword()));
        userEntity.setEnabled(1);
        accountEntity.setEmail(userEntity.getAccountEntity().getEmail());
        accountEntity.setPhonenumber(userEntity.getAccountEntity().getPhonenumber());
        userEntity.setAccountEntity(accountEntity);
        accountEntity.setUserEntity(userEntity);
        userRepository.save(userEntity);
        model.addAttribute("account", userEntities);
        return "redirect:contacts";
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////SEND MAIL  ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/sendmail")
    public String sendmail(AccountEntity accountEntity) throws MessagingException {
        sendFile(accountEntity);
        return "redirect:contacts";
    }

    public static void sendFile(AccountEntity accountEntity) throws AddressException, MessagingException {
        Properties mailServerProperties;
        Session getMailSession;
        MimeMessage mailMessage;


        // Step1: setup Mail Server
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");

        // Step2: get Mail Session
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        mailMessage = new MimeMessage(getMailSession);

        mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(accountEntity.getEmail()));
        //
        //Replace abc with the recipient's address

        // You can choose CC, BCC
//    generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("cc@gmail.com")); //Address cc gmail
        mailMessage.setSubject("A PRODUCT OF APPLE");

        //
        //Create a message sending section
        BodyPart messagePart = new MimeBodyPart();
        messagePart.setText("Hello Brother / Sister,\n" +
                "I am Quoc, from Apple Software Technology Company. My side is providing the market WEBSITE AUTOMATIC ADVERTISEMENT. I send information to you for reference.\n" +
                "Website: https://www.apple.com/\n" +
                "********************\n" +
                "Phone number: 07.6663.8883 (Mr. Quoc)\n" +
                "APQ SOFTWARE TECHNOLOGY CO., LTD\n" +
                "Address: No. K548 / 7 Dien Bien Phu, Ward Thanh Khe Dong, Thanh Khe District, Da Nang City");

        //Create file sending section

        BodyPart filePart = new MimeBodyPart();
        File file = new File("D:\\JetBrains\\TEST\\APPPPPPPPP\\application\\MailSendSale.html");
        DataSource source = new FileDataSource(file);
        filePart.setDataHandler(new DataHandler(source));
        filePart.setFileName(file.getName());


        //
        //Merge message and file to send
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messagePart);
        multipart.addBodyPart(filePart);
        mailMessage.setContent(multipart);


        // Step3: Send mail
        Transport transport = getMailSession.getTransport("smtp");

        //
        //Change your_gmail to your gmail, change your_password to your gmail password
        transport.connect("smtp.gmail.com", "mixermonz@gmail.com", "Matkhaula0151219940!!");
        transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
        transport.close();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////ADMIN NAVIGATOIN ///////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/calendar")
    public String getCalendar() {
        return "pages-calendar";
    }

    @RequestMapping("/sweet")
    public String getCombonensweet() {
        return "componentsweet";
    }

    @RequestMapping("/maps")
    public String GetMap() {
        return "map";
    }

    @RequestMapping("/factory")
    public String get(Model model) {

        return "factory";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

   /* @RequestMapping(value = "/admin/userlistadd")
    public String getUserListadd(Model model) {
        model.addAttribute("users", new UserEntity());
        model.addAttribute("accounts", new AccountEntity());
        model.addAttribute("role", new RoleEntity());
        return "productsadmin";
    }

    */

/*

    @RequestMapping(value = "/admin/newUser")
    public String newUser(Authentication authentication, UserEntity userEntity) {
        userService.getUserEntitybyAdd(userEntity);
        return "index";
    }
*/


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// MANAGER ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// USER ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////










    @RequestMapping("/user")
    public String showStudentPage(Authentication authentication, Model model) {
        String usernameLogined = authentication.getName();
        AccountEntity accountEntity = accountService.getAccountByUsername(usernameLogined);
        model.addAttribute("accounts", accountEntity);
        return "wellcome";
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// ////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////// LOG OUT LOG IN ////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/logout")
    public String getLogOut() {
        return "logout";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("account", new UserEntity());
        return "login";
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////UserRegisterAccount////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////PASSWORD////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping(value = "/UserRegisterAccount", method = RequestMethod.POST)
    public String registerAccount(UserEntity userEntity, Model model) throws NoSuchAlgorithmException {

        UserEntity newUserEntity = new UserEntity();
        newUserEntity.setUsername(userEntity.getUsername());

        newUserEntity.setPassword(new BCryptPasswordEncoder().encode(userEntity.getPassword()));


        List<RoleEntity> roleEntityList = new ArrayList<>();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName("USER");
        roleEntityList.add(roleEntity);
        newUserEntity.setEnabled(1);
        newUserEntity.setUserRoleEntities(roleEntityList);
        if (userService.isException(newUserEntity)) {
            return "redirect:/login";
        } else {
            userService.saveAccount(newUserEntity);
            userService.saveAccount(newUserEntity);
            Boolean isValidEmail = validate(userEntity.getAccountEntity().getEmail());
            if (isValidEmail) {
                AccountEntity accountEntity = new AccountEntity();
                accountEntity.setEmail(userEntity.getAccountEntity().getEmail());
                accountEntity.setPhonenumber(userEntity.getAccountEntity().getPhonenumber());
                accountEntity.setDate(new Timestamp(new Date().getTime()));
                accountEntity.setUserEntity(userService.getAccountByUsername(newUserEntity.getUsername()));
                accountService.saveAccount(accountEntity);
            }
            return "redirect:login";

        }
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();

    }


    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            return convertByteToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


    public String MD5() {
        String md5 = new String();
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException ignored) {
        }
        return null;
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


    public static String getON_MD5(String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        messageDigest.update(data.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(Integer.toHexString((int) (b & 0xff)));
        }
        return sb.toString();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////PASSWORD////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////PASSWORD////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/page")
    public ResponseEntity<Map<String, Object>> getAllTutorials(
            @RequestParam(required = false) String nameproduct,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {

        try {
            List<ProductsEntity> productsEntities = new ArrayList<ProductsEntity>();
            Pageable paging = PageRequest.of(page, size);

            Page<ProductsEntity> pageTuts;
            if (nameproduct == null)
                pageTuts = productsRepository.findAll(paging);
            else
                pageTuts = productsRepository.findByNameproduct(nameproduct, paging);

            productsEntities = pageTuts.getContent();

            Map<String, Object> response = new HashMap<>();
            response.put("ProductList", productsEntities);
            response.put("currentPage", pageTuts.getNumber());
            response.put("totalItems", pageTuts.getTotalElements());
            response.put("totalPages", pageTuts.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////PRODUCTS ADMIN////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/productsadmin")
    public String getAllProductAdmin(Model model) {
        model.addAttribute("ProductList", productsService.getProductsEntities());
        List<ProductPortfolioEntity> productPortfolios = productPortfolioService.ProductPortfolioEntityAll();
        model.addAttribute("productPortfolios", productPortfolios);
        return "productsadmin";
    }
    @RequestMapping(value = "/addProducts")
    public String addProducts(Model model) {
        model.addAttribute("product", new ProductsEntity());
        model.addAttribute("productPortfolios", getProductPoftfoliolist());
        return "newproducts";
    }
    @RequestMapping(value = "/editProducts")
    public String editProducts(@RequestParam("id") int id, Model model) {
        ProductsEntity productsEntity = productsService.editProducts(id);
        model.addAttribute("ProductList", productsService.getProductsEntities());
        model.addAttribute("product", productsEntity);
        model.addAttribute("productPortfolios", getProductPoftfoliolist());
        model.addAttribute("type", "update");
        return "newproducts";
    }
    @RequestMapping(value = "/newProducts")
    public String newProducts(ProductsEntity productsEntity) {
        productsService.newProducts(productsEntity);
        return "redirect:productsadmin";
    }
    @RequestMapping("/deleteproduct/{id}")
    public String deleteProducts(@PathVariable Integer id, Model model) {
        productsRepository.deleteById(id);
        return "deleteproducts";
    }

    private Map<Integer, String> getProductPoftfoliolist() {
        List<ProductPortfolioEntity> productPortfolioEntities = productPortfolioService.ProductPortfolioEntityAll();
        Map<Integer, String> productList = new HashMap<>();
        for (ProductPortfolioEntity p : productPortfolioEntities) {
            productList.put(p.getId(), p.getPortfolio());
        }
        return productList;
    }

}
