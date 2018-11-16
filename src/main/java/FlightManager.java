public class FlightManager {
    Flight flight;
    Passenger passenger;
    Plane plane;

    public FlightManager(Flight flight, Passenger passenger, Plane plane) {
        this.flight = flight;
        this.passenger = passenger;
        this.plane = plane;
    }


    public int baggageWeightAllowed() {
        return plane.getPlaneWeight()/2;
    }


}
