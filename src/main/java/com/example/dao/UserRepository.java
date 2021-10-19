package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Users;
@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
	public Users findByUserName(String userName);

	public boolean existsByUserName(String userName);

}
