public class FlightManager {
    Flight flight;
    Passenger passenger;
    Plane plane;

    public FlightManager(Flight flight, Passenger passenger, Plane plane) {
        this.flight = flight;
        this.passenger = passenger;
        this.plane = plane;
    }


    public int averageWeight() {
        return plane.getPlaneCapacity()/passenger.numOfBags;
    }
}
