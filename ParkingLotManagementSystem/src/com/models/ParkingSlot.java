package com.models;

import com.abstractClasses.Vehicle;
/**
 * ParkingSlot should manage whether it is occupied and which vehicle it contains.
 *  It should not decide which floor or parking lot to search. 
 *  That responsibility belongs to other objects.
 */
public class ParkingSlot {
	private int slotId; // unique slot number
	private String supportedVehicleType; // BIKE || CAR || TRUCK
	private Vehicle vehicle; // stores the Parked Vehicle information
	
	public ParkingSlot(int slotId, String supportedVehicleType)
	{
		this.supportedVehicleType=supportedVehicleType;
		this.slotId=slotId;
	}
	public int getSlotId()
	{
		return this.slotId;
	}
	public String getSupportedVehicleType()
	{
		return this.supportedVehicleType;
	}
	/**
	 * check whether slot is empty or not, by checking null value
	 * @return
	 */
	public  boolean isAvailable()
	{
		return this.vehicle==null;
	}
	/**
	 * check whether vehicle can fit or not based on type
	 * @param vehicle
	 * @return
	 */
	public boolean canFitVehicle(Vehicle vehicle)
	{
		return vehicle.getVehicleType().equalsIgnoreCase(supportedVehicleType);
	}
	/**
	 * can be vehicle is parked or not
	 * @param vehicle
	 * @return
	 */
	public boolean parkVehicle(Vehicle vehicle)
	{
		if(!this.isAvailable()) {
			System.out.println("Parking slot is not available . Sorry for inconvenince!!");
			return false;
		}
		if(!this.canFitVehicle(vehicle))
		{
			System.out.println("No space available for this type of vehicle");
			return false;
		}
		this.vehicle=vehicle;
		return true;
		
	}
	/**
	 * remove the vehicle from parking slot
	 */
	public void removeVehicle()
	{
		this.vehicle=null;
	}
	public Vehicle getVehicle()
	{
		return this.vehicle;
	}
	
}
