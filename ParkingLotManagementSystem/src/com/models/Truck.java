package com.models;

import com.abstractClasses.Vehicle;

public class Truck extends Vehicle {
	
	public Truck(String registrationNumber)
	{
		super(registrationNumber);
		this.registrationNumber=registrationNumber;
	}

	@Override
	public String getRegistrationNumber() {

		return this.registrationNumber;
	}

	@Override
	public String getVehicleType() {
		
		return "TRUCK";
	}

}
