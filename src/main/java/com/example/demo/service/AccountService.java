package com.example.demo.service;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.UserEntity;

import java.util.List;

public interface AccountService {
    public List<AccountEntity> getAccounts();
    public AccountEntity getAccountByUsername(String username);
    public void saveAccount(AccountEntity accountEntity);
    public void deleteAccount(AccountEntity accountEntity);
public void  newAccount(AccountEntity accountEntity);

    public List<AccountEntity> getUsersAlldest();
}
