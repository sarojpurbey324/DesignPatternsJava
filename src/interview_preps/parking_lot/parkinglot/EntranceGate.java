package interview_preps.parking_lot.parkinglot;


import interview_preps.parking_lot.Entity.Vehicle;
import interview_preps.parking_lot.Ticket;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}


