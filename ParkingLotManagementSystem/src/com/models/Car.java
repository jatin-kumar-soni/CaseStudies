package com.models;

import com.abstractClasses.Vehicle;

public class Car extends Vehicle {
	
	public Car(String registrationNumber)
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
		
		return "CAR";
	}

}
