package com.models;

import com.interfaces.IPayable;

public class Payment implements IPayable {
	
	private double balance;
	private static int transactionCount;
	private String status;
	private String txnId;
	static {transactionCount=1000;}
	
	{
		this.txnId="TXN"+transactionCount++;
		this.status="PENDING";
	}
	public String getDetails()
	{
		return "Transaction ID: "+this.txnId
		+ ", Status: "+ this.status
		+ ", Current Balance: "+ this.balance;
	}
	public String getTxnId()
	{
		return this.txnId;
	}
	
	
	public Payment(double bal)
	{
		this.balance=bal;
	}
	
	private void deductBalance(double bal)
	{
		this.balance-=bal;
	}
	public String getStatus()
	{
		return this.status;
	}
	public double getBalance()
	{
		return this.balance;
	}

	@Override
	public void processPayment(double bal) {
		if(bal>this.balance)
		{
			this.status="REJECTED";
			return ;
		}
		deductBalance(bal);
		this.status="APPROVED";
		System.out.println(bal+" Amount is deducted successfully");
		return ;
	}

}
