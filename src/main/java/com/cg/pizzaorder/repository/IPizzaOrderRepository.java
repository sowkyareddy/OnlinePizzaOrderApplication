package com.cg.pizzaorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.pizzaorder.model.PizzaOrder;

@Repository
public interface IPizzaOrderRepository  extends JpaRepository<PizzaOrder, Integer> {

}
