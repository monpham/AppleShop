package com.example.demo.service.impl;


import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<AccountEntity> getAccounts() {
        return (List<AccountEntity>) accountRepository.findAll();
    }
    @Override
    public void newAccount(AccountEntity accountEntity){
        accountRepository.save(accountEntity);
    }

    @Override
    public void deleteAccount(AccountEntity accountEntity){
        accountRepository.delete(accountEntity);
    }

    @Override
    public List<AccountEntity> getUsersAlldest() {
        return (List<AccountEntity>) accountRepository.findAllByOrderByIdDesc();
    }


    @Override
    public AccountEntity getAccountByUsername(String username) {
        UserEntity user = userRepository.findByUsername(username);
        return accountRepository.findById(user.getAccountEntity().getId()).get().getUserEntity().getAccountEntity();
    }

    public void saveAccount(AccountEntity accountEntity){
        try{
            accountRepository.save(accountEntity);
        }catch (Exception e){
        }

    }

}


