package test;

import com.CustomerPojo;
import com.customer.Customer;
import com.customer.CustomerImpl;

public class CustomerImplTestClient {

	public static void main(String args[]){
		
		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setFirstName("Anchal");
		customerPojo.setLastName("Chaudhary");
		customerPojo.setGender("Female");
		customerPojo.setMobNo("9582981642");
		
		Customer customer = new CustomerImpl();
		//CustomerImpl customerImpl = new CustomerImpl();
		customer.createCustomer(customerPojo);
		System.out.println("Customer created with ID: "+customerPojo.getCustomerId());
	}
}
