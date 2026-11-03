package com.management;

import java.time.LocalDateTime;

import com.abstractClasses.Vehicle;
import com.models.ParkingFloor;
import com.models.ParkingSlot;
import com.models.ParkingTicket;

public class ParkingLot {
	private String parkingName;
	private int floorCount = 0;
	private int ticketCount = 0;

	private ParkingFloor[] parkingFloor;
	private ParkingTicket[] parkingTicket;

	public ParkingLot(String parkingName, int floorCount, int ticketCount) {
		super();
		this.parkingName = parkingName;

		this.parkingFloor = new ParkingFloor[floorCount];
		this.parkingTicket = new ParkingTicket[ticketCount];
	}

	public void addParkingFloor(ParkingFloor parkingFloor) {
		if (floorCount < this.parkingFloor.length) {
			this.parkingFloor[this.floorCount] = parkingFloor;
			floorCount++;
		} else {
			System.out.println("Parking floor is full!!");
		}
	}

	public ParkingTicket parkVehicle(Vehicle vehicle) {
		for (int i = 0; i < this.floorCount; i++) {
			ParkingSlot slot = this.parkingFloor[i].findAvailableSlot(vehicle);
			if (slot == null) {
				continue;
			}

			boolean parkedVehicle = slot.parkVehicle(vehicle);

			if (parkedVehicle) {
				if (this.ticketCount >= parkingTicket.length) {
					System.out.println("Ticket Capacity is full!!");
					slot.removeVehicle();
					return null;
				}
				ParkingTicket ticket = new ParkingTicket(ticketCount + 1, vehicle, slot, LocalDateTime.now());
				parkingTicket[ticketCount] = ticket;
				ticketCount++;
				
				return ticket;
			}

		}
		return null;

	}

	public boolean exitVehicle(int ticketId) {
		ParkingTicket ticket= this.findTicket(ticketId);
		if(ticket==null)
		{
			return false;
		}
		ticket.setExitTime(LocalDateTime.now());
		double fee = ticket.calculateParkingFee();
		ticket.getParkingSlot().removeVehicle();
		System.out.println("Total Fee of parking is : "+fee);
		ticket.completeTicket();
		return true;
		
	}

	public ParkingTicket findTicket(int ticketId) {
		for (int i = 0; i < this.ticketCount; i++) {
			if (this.parkingTicket[i]!=null && this.parkingTicket[i].getTicketId() == ticketId) {
				return this.parkingTicket[i];
			}
		}
		return null;
	}

	public void displayAvailableSlots() {
		for(int i=0;i<this.floorCount;i++)
		{
			this.parkingFloor[i].displayAvailableSlots();
		}

	}

	public void displayParkedVehicles() {
		for(int i=0;i<this.floorCount;i++)
		{
			this.parkingFloor[i].displayAllSlots();
		}
	}
}
