package com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Orders;

public  interface  OrderDAO extends JpaRepository<Orders, Long> {

}
