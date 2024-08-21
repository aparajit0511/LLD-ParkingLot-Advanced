package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floors {
    private List<Slot> slots;

    private int total_floors;

    public Floors(int total_floors){
        this.total_floors = total_floors;
        this.slots = new ArrayList<>(10);
        for(int i=1;i<=total_floors;i++){
            this.slots.add(new Slot(i));
        }

    }
}
