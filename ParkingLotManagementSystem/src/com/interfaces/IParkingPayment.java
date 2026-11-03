package com.interfaces;

public interface IParkingPayment extends IPayment,IRefundable{
	void generateReceipt();

}
