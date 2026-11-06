package com.models;

import com.interfaces.ITransferable;

public class TransferService implements ITransferable {
	private String txnId;
	private static int txnNumber;
	private BankAccount account;
	static{txnNumber=500;}
	{txnId="TXN"+txnNumber++;}
	
	public String getTransactionNumber()
	{
		return this.txnId;
	}
	
	@Override
	public void transfer(BankAccount from,BankAccount to,double bal) {
		
		to.creditBalance(bal);
		from.deductBalance(bal);
		System.out.println("Transferred sucessfully");
	
	}
	
	
	
}
