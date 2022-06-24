package com.cg.pizzaorder.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.pizzaorder.model.Pizza;


@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Integer> {
 
}
