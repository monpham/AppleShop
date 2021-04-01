package com.example.demo.repository;
import org.springframework.data.annotation.Id;
import com.example.demo.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
    public RoleEntity findById(int id);
}
