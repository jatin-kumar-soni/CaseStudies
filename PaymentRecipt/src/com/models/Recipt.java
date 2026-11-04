package com.models;

import com.interfaces.IReciptPrint;

public class Recipt implements IReciptPrint {
	
	private Payment pay;
	
	private  int reciptId;
	private static int reciptCount;
static{
	reciptCount=200;
	}
	
	public Recipt(Payment pay)
	{
		this.pay=pay;
		this.reciptId=reciptCount++;
	}

	@Override
	public void printRecipt() {
		System.out.println();
		StringBuilder text= new StringBuilder();
		text.append("=====RECIPT======\n")
		.append("Recipt ID: ").append(this.reciptId)
		.append("\n")
		.append(pay.getDetails());
		System.out.println(text);
		
		
	}

}
