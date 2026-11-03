package com.abstractClasses;

public abstract class Vehicle {
	public String registrationNumber;
	public Vehicle(String registrationNumber)
	{
		this.registrationNumber=registrationNumber;
	}
	public  String getRegistrationNumber() {
		return this.registrationNumber;
	}
	public  abstract String getVehicleType();

}
