package com.customer;

import java.util.Random;

import com.CustomerPojo;

public class CustomerImpl implements Customer{

	private String generateCustomerId(CustomerPojo customerPojo) {
		
		Random rd = new Random();
		String customerId = "GL"+rd.nextInt(100000);
		return customerId;
	}
	public CustomerPojo createCustomer(CustomerPojo customerPojo) {
		
		String customerId = generateCustomerId(customerPojo);
		customerPojo.setCustomerId(customerId);
		return null;
	}
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public CustomerPojo updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public CustomerPojo searchCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
