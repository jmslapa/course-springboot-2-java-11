package com.coursejava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursejava.webservices.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
