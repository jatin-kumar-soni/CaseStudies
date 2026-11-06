package com.main;

import com.models.BankAccount;
import com.models.TransferService;

public class Main {
	public static void main(String[] args) {
		BankAccount jatin= new BankAccount("Jatin", 2000);
		BankAccount aman= new BankAccount("Aman", 5000);
		
		jatin.details();
		aman.details();
		System.out.println("After Transfer");
		TransferService service= new TransferService();
		service.transfer(jatin, aman, 450);
		jatin.details();
		aman.details();
	}

}
