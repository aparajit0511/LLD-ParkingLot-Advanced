import ParkingLot.Floors;
import ParkingLot.Slot;
import ParkingLot.Vehicle;
import ParkingLot.VehicleType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vehicle vehicle = new Vehicle(VehicleType.CAR,"ABYP1234","Black");
        System.out.println(vehicle.getVehicleType());
        System.out.println(vehicle.getVehicleColor());
        System.out.println(vehicle.getRegistrationNumber());

//        Slot slot = new Slot();
//        slot.park(vehicle);
//        System.out.println(slot.isAvailable());
//        System.out.println(slot.getDetails());
        Floors floors = new Floors(4,10);
        System.out.println("park vehicle status " + floors.parkVehicle(vehicle));
//        floors.parkVehicle(vehicle);
        floors.getAvailableSlots();

        Vehicle bus = new Vehicle(VehicleType.BUS,"UP32AH1457","Black");
        System.out.println("park vehicle status " + floors.parkVehicle(bus));
        floors.getAvailableSlots();

        Vehicle bus1 = new Vehicle(VehicleType.BUS,"UP16AH2457","Red");
        System.out.println("park vehicle status " + floors.parkVehicle(bus1));
        floors.getAvailableSlots();
//        slot.vacate();
//        System.out.println(slot.getDetails());

    }// main
} // class