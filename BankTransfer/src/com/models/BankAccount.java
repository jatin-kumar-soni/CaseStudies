package com.models;

import com.interfaces.IAccount;

public class BankAccount implements IAccount {
	private String name;
	private String accountNumber;
	private double balance;
	private String type;
	private static int accountCount;

	static{accountCount=10000;}
	{accountNumber = "ACN"+ accountCount++;}
	public BankAccount(String name,double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	public void creditBalance(double bal)
	{
		if(bal <0)
		{
			System.err.println("invalid amount");
			return;
		}
		this.balance+=bal;
		System.out.println(bal+ " is credited successfully from "+this.getName()+"'s account");
	}
	public double getBalance()
	{
		return this.balance;
	}
	public double currentBalance()
	{
		
		return getBalance();
	}
	@Override
	public void createAccount(String type)
	{
		this.type=type;
	}
	public String getName()
	{
		return this.name;
	}
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	public void deductBalance(double bal)
	{
		 if(bal>this.balance)
		 {
			 System.err.println("insufficient balance, try again");
			 return ;
		 }
		 this.balance-=bal;
		 System.out.println(bal+ " is deducted successfully from "+this.getName()+"'s account");
	}
	public void details()
	{
		System.out.println("====ACCOUNT DETAILS======");
		System.out.println("Account Holder Name: "+this.getName());
		System.out.println("Account Number: "+this.getAccountNumber());
		System.out.println("Account Balance: "+this.getBalance());
	}
	
	
	

}
