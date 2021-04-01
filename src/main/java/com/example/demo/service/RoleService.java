package com.example.demo.service;

import com.example.demo.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    public List<RoleEntity> getListRolid(int id);

    public void deleteRole(RoleEntity roleEntity);
}
