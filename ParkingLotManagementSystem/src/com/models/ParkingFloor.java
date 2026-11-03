package com.models;

import com.abstractClasses.Vehicle;

public class ParkingFloor {
	private ParkingSlot[] parkingSlot;
	private int floorNumber;
	private  int slotCount=0;


	public ParkingFloor(int floorNumber,int totalSlots)
	
	{
		this.floorNumber=floorNumber;
		this.parkingSlot= new ParkingSlot[totalSlots];
	}
	public int getFloorNumber()
	{
		return this.floorNumber;
	}
	
	public void addParkingSlot(ParkingSlot slot)
	{
		if(this.slotCount<this.parkingSlot.length)
		{
			this.parkingSlot[this.slotCount]=slot;
			this.slotCount++;
		}
		else {
			System.out.println("Slot is Full!!");
		}
	}
	
	public ParkingSlot findAvailableSlot(Vehicle vehicle)
	{
		for(int i=0;i<this.slotCount;i++)
		{
			if(this.parkingSlot[i] == null)
			{
				System.err.println("No slots are here ");
				continue;
			}
			if(this.parkingSlot[i].isAvailable() && this.parkingSlot[i].canFitVehicle(vehicle))
			{
				return this.parkingSlot[i];
				
			}
			
			
			
		}
		return null;
	}
	public void displayAvailableSlots()
	{
		for(int i=0;i<this.slotCount;i++)
		{
			if(this.parkingSlot[i].isAvailable())
			{
				System.out.println("Available Slots: "+this.parkingSlot[i].getSlotId());
			}
		}
	}
	public void displayAllSlots()
	{
		for(int i=0;i<this.slotCount;i++)
		{
			ParkingSlot slot= this.parkingSlot[i];
			if(slot.isAvailable())
			{
				System.out.println("Slot ID: " + slot.getSlotId()
	            + " | Status: Available");
			}
			else {
				System.out.println("Slot ID: " + slot.getSlotId()
	            + " | Status: Occupied"
	            + " | Vehicle: " + slot.getVehicle().getRegistrationNumber());
			}
		}
	}
	
}
