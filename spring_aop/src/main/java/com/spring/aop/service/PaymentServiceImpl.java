package com.spring.aop.service;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {

		// Payment Code.......

		System.out.println(amount + "Amount Debited.........");

		//
		///
		//

		System.out.println(amount + "Amount Credited");
	}

}
