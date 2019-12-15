package com.springBoot.REST.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.REST.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	

}
