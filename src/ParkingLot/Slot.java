package ParkingLot;

public class Slot implements Ticket {
    private boolean isOccupied;
    private Vehicle vehicle;

    private int slotNumber;

    private String ticketNumber = null;

    public Slot(int slotNumber){
        this.slotNumber = slotNumber;
        this.isOccupied = false;

    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    public String park(Vehicle vehicle){

        this.vehicle = vehicle;
        this.isOccupied = true;
        System.out.println("hi2");
        return generateTicketNumber("PR", vehicle.getRegistrationNumber());
    }

    public void vacate(){
        this.vehicle = null;
        this.isOccupied = false;
        deleteTicket();
    }

    public String getDetails(){
        if(!isAvailable()){
            return this.vehicle.getVehicleColor() + " " + this.vehicle.getVehicleType() + " " +  this.vehicle.getRegistrationNumber();
        }
        return "No vehicle parked";
    }

    @Override
    public String generateTicketNumber(String PR, String vehicleLast4) {
        ticketNumber = "PR"  + vehicleLast4;
        return ticketNumber;
    }

    @Override
    public void deleteTicket() {
        ticketNumber = null;
    }
}
