package com.example.demo.ServiceImpl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Payment;
import com.example.demo.Repository.PaymentRepository;
import com.example.demo.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	
	@Autowired
	private PaymentRepository pr;
	
	@Override
	public Payment doPayment(Payment pt) {
		pt.setPaymentstatus(paymentProcessing());
		pt.setTransactionId(UUID.randomUUID().toString());
		return pr.save(pt);
	}

	@Override
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"fail";
	}
	

}
