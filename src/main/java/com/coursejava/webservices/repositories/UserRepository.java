package com.coursejava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursejava.webservices.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
