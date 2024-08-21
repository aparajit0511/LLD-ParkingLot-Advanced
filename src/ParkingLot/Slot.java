package ParkingLot;

public class Slot {
    private int maxSlots;
    private boolean isOccupied;

    public Slot(int maxSlots){
        this.maxSlots = maxSlots;
        this.isOccupied = false;
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    public boolean park(Vehicle vehicle){
//        this.vehicle = vehicle;
        return true;
    }
}
