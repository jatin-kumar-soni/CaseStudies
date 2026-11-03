package com.models;

import com.abstractClasses.Vehicle;

public class Bike extends Vehicle {
	
	
	public Bike(String registrationNumber)
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
		
		return "BIKE";
	}

}
