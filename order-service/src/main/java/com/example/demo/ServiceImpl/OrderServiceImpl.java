package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Common.Payment;
import com.example.demo.Common.TransactionRequest;
import com.example.demo.Common.TransactionResponse;
import com.example.demo.Entity.Order;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private OrderRepository or;
	
	@Autowired
	private RestTemplate rt;
	
	
	@Override
	public TransactionResponse saveOrder(TransactionRequest request) {
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
//		callrest
		Payment paymentResponse = rt.postForObject("http://localhost:1010/Payment/doPayment", payment, Payment.class);
		 or.save(order);
		 return null;
	}

	@Override
	public Order getOrderById(Integer id) {
		return or.findById(id).get();
	}

	@Override
	public List<Order> getAllOrder() {
		return or.findAll();
	}

	@Override
	public String deleteOrder(Integer id) {
		Order order1 = or.findById(id).get();
		if(order1!=null)
		{
			or.delete(order1);
			return "Order deleted Successfully!!!!";
		}
		return "Some Error Occured!!!!";
	}

	@Override
	public Order editOrder(Order order) {
		return or.save(order);
	}

}
