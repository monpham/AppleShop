package com.example.demo.service.impl;


import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.RoleRepository;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<UserEntity> getAccounts() {
        return (List<UserEntity>) userRepository.findAll();
    }


    @Override
    public List<UserEntity> getUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }
   /* @Override
    public List<UserEntity> getUsersAlldest() {
        return (List<UserEntity>) userRepository.findByIdDesc();
    }*/
    @Override
    public void getUserEntitybyAdd(UserEntity userEntity){
        userRepository.save(userEntity);
    }
    public boolean isException(UserEntity userEntity){
        boolean ex = false;
        if (userRepository.existsByUsername(userEntity.getUsername()))ex = true;
        System.out.println(ex);
        return ex;
    }

    @Override
    public void saveAccount(UserEntity userEntity){
        try {
            userRepository.save(userEntity);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public UserEntity getAccountByUsername(String var){
        return userRepository.findByUsername(var);
    }

    @Override
    public void newAccount(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(UserEntity userEntity){
        userRepository.delete(userEntity);
    }
    @Override
    public void deleteUserid(int id){
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getEditUser(int id) {
        return userRepository.findById(id);

    }


}