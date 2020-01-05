package com.coursejava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursejava.webservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
