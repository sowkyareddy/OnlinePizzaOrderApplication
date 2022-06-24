package com.cg.pizzaorder.service;

import com.cg.pizzaorder.model.User;

public interface IUserService {
public User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
boolean forgetPassword(String oldPassword, String newPassword);
}
