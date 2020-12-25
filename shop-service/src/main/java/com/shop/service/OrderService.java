package com.shop.service;

import java.util.List;

import com.shop.dto.OrderDTO;
import com.shop.entity.Orders;

public interface OrderService {

	void addOrder(List<Orders> orderDTO);

	Orders getorderById(Long orderid);

	List<Orders> getAllOrder();

}
