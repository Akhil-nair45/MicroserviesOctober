package com.example.demo.Service;

import com.example.demo.Entity.Payment;

public interface PaymentService {

	public Payment doPayment(Payment pt);
	
	public String paymentProcessing();
}
