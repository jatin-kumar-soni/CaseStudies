package com.main;

import com.abstractClasses.Vehicle;

import com.management.ParkingLot;

import com.models.Bike;

import com.models.Car;

import com.models.ParkingFloor;

import com.models.ParkingSlot;

import com.models.Truck;
public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car("JH01AB1234");
        Vehicle v2 = new Bike("JH01CD5678");
        Vehicle v3 = new Truck("JH01EF9012");

        ParkingFloor floor = new ParkingFloor(1, 3);

        floor.addParkingSlot(new ParkingSlot(101, "CAR"));
        floor.addParkingSlot(new ParkingSlot(102, "BIKE"));
        floor.addParkingSlot(new ParkingSlot(103, "TRUCK"));

        ParkingLot parkingLot =
                new ParkingLot("KODEWALA PARKING", 1, 3);

        parkingLot.addParkingFloor(floor);

        // Park vehicles
        parkingLot.parkVehicle(v1);
        parkingLot.parkVehicle(v2);
        parkingLot.parkVehicle(v3);

        // Display all slots
        System.out.println("\n--- PARKED VEHICLES ---");
        parkingLot.displayParkedVehicles();

        // Exit Truck
        System.out.println("\n--- TRUCK EXIT ---");
        parkingLot.exitVehicle(3);

        // Display available slots
        System.out.println("\n--- AVAILABLE SLOTS ---");
        parkingLot.displayAvailableSlots();

        // Try exiting the same ticket again
        System.out.println("\n--- DUPLICATE EXIT TEST ---");
        parkingLot.exitVehicle(3);

        // Display final status
        System.out.println("\n--- FINAL PARKING STATUS ---");
        parkingLot.displayParkedVehicles();
    }
}