package com.avinash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.entity.Products;

public interface ProductRepository extends JpaRepository<Products,Integer>{

}
