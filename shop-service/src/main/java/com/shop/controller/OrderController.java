package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.core.BaseResponce;
import com.shop.entity.Orders;
import com.shop.service.OrderService;

@RestController()
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/add")
	public String addOrder(@RequestBody ArrayList<Orders> orderDTO) {
		BaseResponce baseResponce=new BaseResponce();

		orderService.addOrder(orderDTO);
		return "gbfednj";

	}

	@GetMapping("/{order_id}")
	public Orders getorderById(@PathVariable("order_id") Long orderId) {

		return orderService.getorderById(orderId);
	}

	@GetMapping("/orders")
	public List<Orders> getAllOrder() {
		// TODO Auto-generated method stub
		return orderService.getAllOrder();
	}

}
