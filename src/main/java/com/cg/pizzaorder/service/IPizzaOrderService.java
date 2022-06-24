package com.cg.pizzaorder.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.pizzaorder.model.PizzaOrder;

public interface IPizzaOrderService {
	public PizzaOrder bookPizzaOrder(PizzaOrder order);
	public PizzaOrder updatePizzaOrder(PizzaOrder order);
	public PizzaOrder cancelPizzaOrder(int bookingOrderId);
	public PizzaOrder viewPizzaOrder(int bookingOrderId);
	public List<PizzaOrder> viewOrdersList();
	public List<PizzaOrder> viewOrdersList(LocalDate date);
	public List<PizzaOrder> calculateTotal(String size,int quantity);
}
