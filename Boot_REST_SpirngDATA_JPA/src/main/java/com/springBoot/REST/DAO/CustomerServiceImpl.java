package com.springBoot.REST.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springBoot.REST.Entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	@Override	
	public List<Customer> findAll_Customers() {
			
		return customerRepo.findAll();
	}

	@Override	
	public Customer getCustomer(int customerID) {
	
		Optional<Customer> result = customerRepo.findById(customerID);
		
		Customer theCustomer = null;
		if(result.isPresent()) {
			theCustomer = result.get();
		}else {
			throw new RuntimeException("Customer not found "+customerID);
		}
		return theCustomer;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		customerRepo.save(theCustomer);
		
	}

	@Override
	public void deleteCustomer(int customerID) {
		
		customerRepo.deleteById(customerID);
		
	}

}
