package ParkingLot;

public class Slot {
    private boolean isOccupied;
    private Vehicle vehicle;

    private int slotNumber;

    public Slot(int slotNumber){
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    public void park(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isOccupied = true;

    }

    public void vacate(){
        this.vehicle = null;
        this.isOccupied = false;
    }

    public String getDetails(){
        if(!isAvailable()){
            return this.vehicle.getVehicleColor() + " " + this.vehicle.getVehicleType() + " " +  this.vehicle.getRegistrationNumber();
        }
        return "No vehicle parked";
    }
}
