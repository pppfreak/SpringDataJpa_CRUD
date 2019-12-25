package com.springBoot.REST.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.REST.Entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	

}
