package com.customer;
import com.CustomerPojo;
public interface Customer {

	CustomerPojo createCustomer(CustomerPojo customerPojo);
	boolean deleteCustomer(int customerId);
	CustomerPojo updateCustomer(int customerId);
	CustomerPojo searchCustomer(int customerId);
}
