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
            System.out.println("Floors");
            for(int j = 1;j <= maxSlots;j++){
                System.out.println("Slots");
                slotList.add(new Slot(j));
            }
            slots.put(i, slotList);
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        System.out.println(slots);
        return false;
    }
}// class
