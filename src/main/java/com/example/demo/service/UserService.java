package com.example.demo.service;

/*import com.example.demo.entity.StudentEntity;*/
import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.UserEntity;

import java.util.List;

public interface UserService {
    public List<UserEntity> getUsers();
    public UserEntity getAccountByUsername(String var);
    public List<UserEntity> getAccounts();
  public void getUserEntitybyAdd(UserEntity userEntity);

    public boolean isException(UserEntity userEntity);

    public void saveAccount(UserEntity userEntity);

    public void newAccount(UserEntity userEntity);

    public  void deleteUser(UserEntity userEntity);


    public  void deleteUserid(int id);
    public UserEntity getEditUser(int id);

  /*  public List<UserEntity> getUsersAlldest();*/
}
