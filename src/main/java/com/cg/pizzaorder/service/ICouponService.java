package com.cg.pizzaorder.service;

import java.util.List;

import com.cg.pizzaorder.model.Coupon;

public interface ICouponService {
public Coupon addCoupon(Coupon coupon);
public Coupon editCoupon(Coupon coupon);
public Coupon deleteCoupon(Coupon coupon);
public List<Coupon> viewCoupons();


}
