package com.cg.pizzaorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.pizzaorder.model.User;

@Repository
public interface IUserRepository  extends JpaRepository<User, Integer> {

}
