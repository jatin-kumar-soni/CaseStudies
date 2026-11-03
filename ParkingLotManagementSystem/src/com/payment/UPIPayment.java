package com.payment;

import com.abstractClasses.PaymentMethod;
import com.interfaces.IParkingPayment;

public class UPIPayment extends PaymentMethod implements IParkingPayment  {

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
