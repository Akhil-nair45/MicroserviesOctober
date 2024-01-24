package com.example.demo.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Payment;
import com.example.demo.Service.PaymentService;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

	
	@Autowired
	private PaymentService ps;
	
	@PostMapping("/doPayment")
	public ResponseEntity<?> doPayment(@RequestBody Payment pt)
	{
		return new ResponseEntity<>(ps.doPayment(pt), HttpStatus.CREATED);
	}
}
