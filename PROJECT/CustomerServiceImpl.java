package com.emusic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emusic.dao.CustomerDao;
import com.emusic.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao cdao;

	@Override
	public boolean addCustomer(Customer C) {
	
		return cdao.addCustomer(C);
	}

	@Override
	public boolean delCustomer(int id) {
		return cdao.delCustomer(id);
		
	}

	@Override
	public boolean updCustomer(Customer C) {
		
		return cdao.updCustomer(C);
	}

	@Override
	public Customer getCustomerByName(String Name) {
		
		return cdao.getCustomerByName(Name);
	}

	@Override
	public List<Customer> getAllCustomer() {
	
		return cdao.getAllCustomer();
	}

}
