package ParkingLot;

public class Vehicle {

    private VehicleType type;
    private String regiNum;
    private String color;

    public Vehicle(VehicleType type, String regiNum, String color){
        this.type = type;
        this.regiNum = regiNum;
        this.color = color;
    }

    public String getRegistrationNumber(){
        return this.regiNum;
    }
    public VehicleType getVehicleType(){
        return this.type;
    }
    public String getVehicleColor(){
        return this.color;
    }

}
