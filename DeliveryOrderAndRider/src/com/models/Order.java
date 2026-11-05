package com.models;

public class Order {
	private String orderId;
	private static int orderCount;
	private String restaurantName;
	private String orderName;
	private double price;
	private String status;
	private Rider rider;

	static {
		orderCount = 100;
	}
	{
		orderId = "ORD" + orderCount++;
	}

	public Order(String restaurantName, String orderName, double price) {
		super();
		this.restaurantName = restaurantName;
		this.orderName = orderName;
		this.price = price;

	}

	public boolean assignRider(Rider rider) {
	    if (rider == null || !rider.isAvailable()) {
	        return false;
	    }

	    this.rider = rider;
	    rider.setAvailable(false);
	    return true;
	}

	public void updateStatus(String status) {
		this.status = status;
		System.out.println("Status updated successfully");
	}

	private double calcPrice() {
		double gst = this.price * 0.18;
		double deliveryCharges = this.price * 0.1;
		return this.price + gst + deliveryCharges;
	}

	public void orderDetails() {
		System.out.println("====ORDER DETAILS=====");
		System.out.println("Order Id: " + this.getOrderId());
		System.out.println("Order Name: " + this.getOrderName());
		System.out.println("Restaurant Name: " + this.getRestaurantName());
		System.out.println("Order Price :" + this.getPrice());
		System.out.println("Bill: " + this.calcPrice());

	}

	public String getOrderId() {
		return orderId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public String getOrderName() {
		return orderName;
	}

	public double getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	public void placeOrder() {
		if (rider.isAvailable()) {
			System.out.println("Order placed Successfully");
			System.out.println("Rider " + rider.getRiderName() + " is ready to take your order");
			System.out.println("Rider is at " + this.getRestaurantName());

		} else {
			System.err.println("Sorry Riders is not available try after some time");
		}

	}

}
