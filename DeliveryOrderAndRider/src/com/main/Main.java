package com.main;

import com.models.Order;
import com.models.Rider;

public class Main {
	public static void main(String[] args) {

//		Order od= new Order("Meghna Foods", "Mutton Briyani", 350);
//		Rider rider= new Rider("Jatin", true, "BTM", od);
//		od.placeOrder();
//		od.orderDetails();
//		//od.assignRider(rider);
//		od.updateStatus("RECIVED");
//		rider.riderDetails();
		 Order order1 = new Order("Burger Hub", "Veg Burger", 250.00);
	        Order order2 = new Order("Pizza Point", "Margherita Pizza", 500.00);
		Rider rider1 = new Rider("Aman", true, "Koramangala", order1);
        Rider rider2 = new Rider("Riya", false, "Indiranagar", order2);

       

        Rider[] riders = {rider1, rider2};
        Order[] orders = {order1, order2};

        for (int i = 0; i < orders.length; i++) {
            if (orders[i].assignRider(riders[i])) {
                orders[i].updateStatus("RIDER_ASSIGNED");
                riders[i].setAvailable(false);

                System.out.println(riders[i].getRiderName()
                        + " assigned to order " + orders[i].getOrderId());
            } else {
                orders[i].updateStatus("WAITING_FOR_RIDER");

                System.out.println(riders[i].getRiderName()
                        + " is unavailable for order " + orders[i].getOrderId());
            }

            orders[i].orderDetails();
            riders[i].riderDetails();
        }
		
		
	}
}
