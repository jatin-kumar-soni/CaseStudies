import java.util.Scanner;

public class Payment {
	private static int paymentCounter;
	private String transactionId;
	static {
		
		paymentCounter=1000;
		
	}
	{
		transactionId="TXN"+(++paymentCounter);
	}
	private double amount;
	private String paymentMethod;
	private boolean paymentStatus;
	public Payment(double amount) {
		super();
		this.amount = amount;
		
	}
	public boolean paymentProcess(Scanner sc)
	{
		 System.out.println("\n===== PAYMENT DETAILS =====");

	        System.out.println("Amount: Rs. " + amount);

	        System.out.println("1. UPI");

	        System.out.println("2. Credit Card");

	        System.out.println("3. Debit Card");

	        System.out.println("4. Cash");

	        System.out.print("Select payment method: ");

	        int choice = sc.nextInt();
	       
	        switch (choice)
	        {
	        case 1: this.paymentMethod="UPI";
	        break;
	        case 2: this.paymentMethod="Credit Card";
	        break;
	        case 3: this.paymentMethod="Debit Card";
	        break;
	        case 4: this.paymentMethod="Case";
	        break;
	        default:
	        	System.out.println("Invalid payment method");
	        	return false;
	        }
	        this.paymentStatus=true;
	        if(this.paymentStatus)
	        {
	        	System.out.println("\nPayment Successful!");

	            System.out.println("Transaction ID: " + transactionId);

	            System.out.println("Payment Method: " + paymentMethod);
	            return true;
	        }
		return false;
	}
	

}
