package com.springBoot.REST.DAO;

import java.util.List;

import com.springBoot.REST.Entity.Customer;

public interface CustomerService {

	public List<Customer> findAll_Customers();

	public Customer getCustomer(int customerID);

	public void saveCustomer(Customer theCustomer);

	public void deleteCustomer(int customerID);
}
