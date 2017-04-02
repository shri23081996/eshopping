package com.emusic.service;

import java.util.List;

import com.emusic.model.Customer;

public interface CustomerService {
	boolean addCustomer(Customer C);
	boolean delCustomer(int id);
	boolean updCustomer(Customer C);
	Customer getCustomerByName(String Name);
	List<Customer>getAllCustomer();
	

}
