package com.coursejava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
