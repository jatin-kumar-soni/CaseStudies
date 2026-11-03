package com.payment;

import com.abstractClasses.PaymentMethod;
import com.interfaces.IPayment;

public class CashPayment extends PaymentMethod implements IPayment {

	@Override
	public boolean processPayment(double amount) {
		
		return false;
	}



}
