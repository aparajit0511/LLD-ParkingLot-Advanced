package ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floors {
    private Map<Integer,List<Slot>> slots;
    private int maxSlots;

    private int total_floors;

    public  Floors(int total_floors,int maxSlots){
        this.total_floors = total_floors;
        this.maxSlots = maxSlots;
        slots =  new HashMap<>();
        for(int i=1;i<=total_floors;i++){
            List<Slot> slotList = new ArrayList<>();
//            System.out.println("Floors");
            for(int j = 0;j < maxSlots;j++){
//                System.out.println("Slots");
                slotList.add(new Slot(j));
            }
            slots.put(i, slotList);
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
//        System.out.println(slots);
        for(Map.Entry<Integer,List<Slot>> entry : slots.entrySet()){
            List<Slot> value = entry.getValue();
            System.out.println(value);
            System.out.println(value.get(0));
            if (value.get(0).isAvailable() && vehicle.getVehicleType() == VehicleType.BUS){
                value.get(0).park(vehicle);      // Park the vehicle in the first available slot
//                value.set(0).park(vehicle);   //  If you need to modify a slot, there's no need to use set() unless you're replacing the Slot object itself.
                return true;
            }
            else if( vehicle.getVehicleType() == VehicleType.MOTORCYCLE ){
                if((value.get(1).isAvailable() )){
                    value.get(1).park(vehicle);
                }
                else if(value.get(2).isAvailable()){
                    value.get(2).park(vehicle);
                }
                return true;
            }
            else{
                for(int index = 3; index < value.size();index++){
                    if(value.get(index).isAvailable() && vehicle.getVehicleType() == VehicleType.CAR){
                        value.get(index).park(vehicle);
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public void getAvailableSlots(){


        for (Map.Entry<Integer,List<Slot>> entry:slots.entrySet()){
            int availableSlotsforBus = 0;
            int availableSlotsforCar = 0;
            int availableSlotsforMotorcycle = 0;

            Integer floor = entry.getKey();
            List<Slot> mostSlots = entry.getValue();
            System.out.println(mostSlots.size());

            if(mostSlots.get(0).isAvailable()){
                availableSlotsforBus += 1;
            }
            if(mostSlots.get(1).isAvailable()){
                availableSlotsforMotorcycle += 1;
            }
            if(mostSlots.get(2).isAvailable()){
                availableSlotsforMotorcycle += 1;
            }

            for(int index = 3;index < mostSlots.size();index++){

                if( mostSlots.get(index).isAvailable()){
                    availableSlotsforCar += 1;
                }
            }

            System.out.println("On Floor " + floor + " total bus slots available are " + availableSlotsforBus + " ,total car slots available are " + availableSlotsforCar + " and total motorcycle slots available are " + availableSlotsforMotorcycle);
        }

    }
}// class
