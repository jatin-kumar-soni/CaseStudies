package com.models;

public class Rider {
	private String rideId;
	private static int rideCount;
	private String riderName;
	private boolean available;
	private String currentLocation;
	private Order order;
	
	static {
		rideCount=300;
		
	}
	{
		rideId="CAPTAIN"+rideCount++;
		this.available=true;
	}
	
	public Rider(String riderName, boolean available, String currentLocation, Order order) {
		super();
		
		this.riderName = riderName;
		this.available = available;
		this.currentLocation = currentLocation;
		this.order = order;
	}
	
	public void riderDetails()
	{
		System.out.println("========RIDER DETAILS=======");
		System.out.println("Rider ID: "+this.getRideId());
		System.out.println("Rider Name: "+this.getRiderName());
		System.out.println("Rider Location: "+this.getCurrentLocation());

	}
	
	public boolean isAvailable()
	{
		return this.available;
	}
	public String getRideId() {
		return rideId;
	}
	public String getRiderName() {
		return riderName;
	}
	public void setAvailable(boolean avail) {
		this.available=avail;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public Order getOrder() {
		return order;
	}
	
	
}
