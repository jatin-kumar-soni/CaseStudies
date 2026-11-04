package com.main;

import java.util.Scanner;

import com.models.Payment;
import com.models.Recipt;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment payment1 = new Payment(1000);
        Payment payment2 = new Payment(2000);

        System.out.print("Enter amount for payment 1: ");
        double amount1 = sc.nextDouble();

        System.out.print("Enter amount for payment 2: ");
        double amount2 = sc.nextDouble();

        payment1.processPayment(amount1);
        payment2.processPayment(amount2);

        Recipt receipt1 = new Recipt(payment1);
        Recipt receipt2 = new Recipt(payment2);

        receipt1.printRecipt();
        receipt2.printRecipt();
		

	}

}
