package com.cg.pizzaorder.service;


import java.util.List;

import com.cg.pizzaorder.model.Pizza;

public interface IPizzaService {

	public Pizza addPizza(Pizza pizza);
	public Pizza updatePizza(Pizza pizza);
	public Pizza deletePizza(int pizzaId);
	public List<Pizza> viewPizzalist();
	public Pizza viewPizza(int pizzaId);
	public List<Pizza> viewPizzalist(double minCost , double maxCost);
	public List<Pizza> viewPizzalist(String pizzaType);
	

}
