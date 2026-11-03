package com.abstractClasses;

public abstract class PaymentMethod {
	protected String transactionId;
	protected double amount;
	public abstract boolean processPayment(double amount);
}
