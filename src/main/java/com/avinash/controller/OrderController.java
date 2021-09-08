package com.avinash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.entity.Customer;
import com.avinash.repository.CustomerRepository;
import com.avinash.repository.ProductRepository;

@RestController
@RequestMapping("/test")
public class OrderController {
	
	@Autowired
	private CustomerRepository crepo;
	@Autowired
	private ProductRepository prepo;
	
	@PostMapping("/orderplace")
	public String placeOrder(@RequestBody Customer customer) {
		
	Customer cusobj	= crepo.save(customer);
	if(cusobj.getCname() == null) {
		return "Object not added to the DB";
	}
	else {
		return "Object added successfully";
	}
	
	}
	
	@GetMapping("/findAll")
	public List<Customer> getAllCustomers() throws Exception{
		
		List<Customer> findAll = crepo.findAll();
		if(findAll.isEmpty() || findAll == null) {
			throw new NoRecordFoundExecption("No record found");
		}
		return findAll;
	}

}
