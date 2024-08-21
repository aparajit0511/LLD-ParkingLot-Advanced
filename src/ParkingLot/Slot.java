package ParkingLot;

public class Slot {
    private int maxSlots;
    private boolean isOccupied;
    private Vehicle vehicle;

    public Slot(int maxSlots){
        this.maxSlots = maxSlots;
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
