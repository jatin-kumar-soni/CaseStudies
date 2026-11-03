package com.payment;

import com.abstractClasses.PaymentMethod;
import com.interfaces.IParkingPayment;

public class CardPayment extends PaymentMethod implements IParkingPayment {

	@Override
	public boolean processPayment(double amount) {
		
		return false;
	}

	@Override
	public boolean refundPayment(double amount) {
		
		return false;
	}

	@Override
	public void generateReceipt() {
		
		
	}

}
