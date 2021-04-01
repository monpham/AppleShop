package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public UserEntity findByUsername(String username);

    public boolean existsByUsername(String var);


    public UserEntity findById(int id);
    /*    public List<UserEntity> findByIdDesc();*/
    public UserEntity deleteById(int id);
}
