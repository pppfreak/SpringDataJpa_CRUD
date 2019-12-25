package com.springBoot.REST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.REST.DAO.CustomerService;
import com.springBoot.REST.Entity.Customer;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> findCustomer() {
		System.out.println("Hi there");
		return customerService.findAll_Customers();

	}

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {

		Customer theCustomer = customerService.getCustomer(id);

		if (theCustomer == null) {
			throw new RuntimeException("Customer not found-" + id);
		}
		return theCustomer;
	}

	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) {

		customerService.saveCustomer(customer);
		return customer;
	}

	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {

		customerService.saveCustomer(customer);
		return customer;
	}

	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {

		Customer customer = customerService.getCustomer(id);

		if (customer == null) {
			throw new RuntimeException("Customer not found- " + id);
		}
		customerService.deleteCustomer(id);
		return "Delete the customer " + id;
	}

}
