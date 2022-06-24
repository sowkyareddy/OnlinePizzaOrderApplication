package com.cg.pizzaorder.service;

import java.util.List;

import com.cg.pizzaorder.model.Customer;

public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int customerId);
	public List<Customer> viewCustomer();
	public Customer viewCustomer(int customerId);
}
