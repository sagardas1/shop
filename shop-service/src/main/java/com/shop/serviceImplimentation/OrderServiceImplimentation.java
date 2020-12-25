package com.shop.serviceImplimentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.OrderDAO;
import com.shop.entity.Orders;
import com.shop.exception.OrderNotInsertedException;
import com.shop.service.OrderService;

@Service
public class OrderServiceImplimentation implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	public void addOrder(List<Orders> orderDTO) {
		try {
	for(Orders s:orderDTO) {
		
		orderDAO.save(s);
	}
		}catch (Exception e) {
			throw new OrderNotInsertedException(1001, e.getMessage(), e.getLocalizedMessage(), "900");
		}

	}

	@Override
	public Orders getorderById(Long orderid) {
		// TODO Auto-generated method stub
		return orderDAO.getOne(orderid);
	}

	@Override
	public List<Orders> getAllOrder() {
		
		List<Orders> orderList=orderDAO.findAll();
		
		
		return orderList;
	}

}
