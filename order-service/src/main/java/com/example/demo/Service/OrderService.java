package com.example.demo.Service;

import java.util.List;

import com.example.demo.Common.TransactionRequest;
import com.example.demo.Common.TransactionResponse;
import com.example.demo.Entity.Order;

public interface OrderService {

	public TransactionResponse saveOrder(TransactionRequest request);
	
	public Order getOrderById(Integer id);
	
	public List<Order> getAllOrder();
	
	public String deleteOrder(Integer id);
	
	public Order editOrder(Order order);
}
