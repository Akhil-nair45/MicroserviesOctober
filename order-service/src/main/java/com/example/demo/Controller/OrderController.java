package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Common.Payment;
import com.example.demo.Common.TransactionRequest;
import com.example.demo.Common.TransactionResponse;
import com.example.demo.Entity.Order;
import com.example.demo.Service.OrderService;

@RestController
@RequestMapping("/Order")
public class OrderController {

	@Autowired
	private OrderService os;
	
	
	@PostMapping("/createOrder")
	public TransactionResponse saveOrder(@RequestBody TransactionRequest request)
	{
		
		return null;
	}
	
	
}
