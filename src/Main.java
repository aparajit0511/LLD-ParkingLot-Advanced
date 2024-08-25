import ParkingLot.Floors;
import ParkingLot.Slot;
import ParkingLot.Vehicle;
import ParkingLot.VehicleType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vehicle car = new Vehicle(VehicleType.CAR,"ABYP1234","Black");
//        System.out.println(vehicle.getVehicleType());
//        System.out.println(vehicle.getVehicleColor());
//        System.out.println(vehicle.getRegistrationNumber());

//        Slot slot = new Slot(9);
//        slot.park(vehicle);
//        System.out.println(slot.isAvailable());
//        System.out.println(slot.getDetails());
        Floors floors = new Floors(4,10);
//        System.out.println("park vehicle status " + floors.parkVehicle(car));
          String ticket1 = floors.parkVehicle(car);
        System.out.println("Ticket generated " +ticket1);
//        floors.getAvailableSlots();

        Vehicle bus = new Vehicle(VehicleType.BUS,"UP32AH1457","Black");
//        System.out.println("park vehicle status " + floors.parkVehicle(bus));
        String ticket2 = floors.parkVehicle(bus);
        System.out.println("Ticket genereated "+ ticket2);
//        floors.getAvailableSlots();

        Vehicle bus1 = new Vehicle(VehicleType.BUS,"UP16AH2457","Red");
        String ticket3 = floors.parkVehicle(bus1);
        System.out.println("Ticket genereated "+ ticket3);
//        System.out.println("park vehicle status " + floors.parkVehicle(bus1));
//        floors.getAvailableSlots();
//        System.out.println(slot.getDetails());
//        slot.vacate();
//        System.out.println(slot.getDetails());


        Vehicle bus3 = new Vehicle(VehicleType.BUS,"HP36AH3257","Green");
        String ticket4 = floors.parkVehicle(bus3);


        Vehicle bus4 = new Vehicle(VehicleType.BUS,"MH06AH1000","White");
        String ticket5 = floors.parkVehicle(bus4);

        floors.getAvailableSlots();
        floors.leaveVehicle("PRUP16AH2457");
        floors.getAvailableSlots();

        Vehicle bus5 = new Vehicle(VehicleType.BUS,"GOR6AH1000","Blue");
        String ticket6 = floors.parkVehicle(bus5);
        System.out.println("Ticket Genereated "+ ticket6);

//        floors.leaveVehicle("PRUP16AH2457");
//        floors.getAvailableSlots();

    }// main
} // class