package com.emusic.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emusic.model.Customer;
@Repository
public class CustomerDaoimpl implements CustomerDao {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean addCustomer(Customer C) { 
Session s=sf.openSession();
s.save(C);
		return true;
	}

	@Override
	public boolean delCustomer(int id) {
Session s=sf.openSession();
Customer c=s.get(Customer.class, id);
s.delete(c);
		return true;
	}

	@Override
	public boolean updCustomer(Customer C) {
	Session s=sf.openSession();
	s.update(C);
		return true;
	}

	@Override
	public Customer getCustomerByName(String Name) {
		Session s=sf.openSession();
Query q=s.createQuery("from Customer where cname="+Name); 
return (Customer)q.uniqueResult();

	}

	@Override
	public List<Customer> getAllCustomer() {
		Session s=sf.openSession();
		List<Customer> l=s.createQuery("from Customer").list();
	
		return l;
	}

}
