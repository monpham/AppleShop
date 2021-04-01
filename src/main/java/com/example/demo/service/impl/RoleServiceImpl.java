package com.example.demo.service.impl;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.RoleEntity;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.RoleRepository;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleEntity> getListRolid(int id) {
        return (List<RoleEntity>) roleRepository.findById(id);
    }

    @Override
    public void deleteRole(RoleEntity roleEntity){
        roleRepository.delete(roleEntity);
    }

}
