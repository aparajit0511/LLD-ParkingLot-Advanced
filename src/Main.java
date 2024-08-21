import ParkingLot.Vehicle;
import ParkingLot.VehicleType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vehicle vehicle = new Vehicle(VehicleType.CAR,"ABYP1234","Black");
        System.out.println(vehicle.getVehicleType());
        System.out.println(vehicle.getVehicleColor());
        System.out.println(vehicle.getRegistrationNumber());

    }// main
} // class