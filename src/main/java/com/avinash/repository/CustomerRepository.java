package com.avinash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
