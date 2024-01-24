package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PAYMENT_TABLE")
public class Payment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentid;
	private String paymentstatus;
	private String transactionId;
	private int orderId;
	private int amount;
}
