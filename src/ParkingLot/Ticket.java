package ParkingLot;

public interface Ticket {

    public String generateTicketNumber(String PR,String vehicleLast4);

    public void deleteTicket();
}
