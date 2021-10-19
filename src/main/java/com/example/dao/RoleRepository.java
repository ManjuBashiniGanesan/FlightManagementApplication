package com.example.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Role;
import com.example.entities.Roles;
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
	Optional<Role> findByRoleName(Roles role);

}
