package com.models;

import java.time.Duration;
import java.time.LocalDateTime;

import com.abstractClasses.Vehicle;

public class ParkingTicket {
	private int ticketId;
	private Vehicle vehicle;
	private ParkingSlot parkingSlot;
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private boolean active = true;

	public ParkingTicket(int ticketId, Vehicle vehicle, ParkingSlot parkingSlot, LocalDateTime entryTime) {

		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.parkingSlot = parkingSlot;
		this.entryTime = entryTime;
	}
	public boolean isActive()
	{
		return this.active;
	}
	public void completeTicket()
	{
		this.active=false;
	}
	public int getTicketId()
	{
		return this.ticketId;
	}
	public ParkingSlot getParkingSlot()
	{
		return this.parkingSlot;
	}
	public void setExitTime(LocalDateTime exitTime) {
		if (exitTime.isBefore(entryTime)) {
		    throw new IllegalArgumentException("Exit time cannot be before entry time");
		}
		this.exitTime = exitTime;
	}

	public long calculateParkingDuration() {
		if (this.exitTime == null) {
			return 0;
		}
		long minutes = Duration.between(entryTime, exitTime).toMinutes();

		long hrs = (long) Math.ceil(minutes / 60.0);
		return minutes;
	}

	public double calculateParkingFee() {
		long hrs = calculateParkingDuration();
		long fee = 0;
		switch (vehicle.getVehicleType()) {
		case "BIKE":
			fee = hrs * 10;
			break;
		case "CAR":
			fee = hrs * 20;
			break;
		case "TRUCK":
			fee = hrs * 50;
			break;
		default:
			fee = 0;
			System.out.println("No vehicle is there");
		}

		return fee;
	}

	public void displayTicketDetails() {
		System.out.println("Vehicle Number: " + vehicle.getRegistrationNumber());
		System.out.println("Vehicle Type: " + vehicle.getVehicleType());
		System.out.println("Parking Slot: " + parkingSlot.getSlotId());
		System.out.println("Entry Time: " + entryTime);
		System.out.println("Exit Time: " + exitTime);
		System.out.println("Duration: " + calculateParkingDuration());
	}
}
