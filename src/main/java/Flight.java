import java.util.ArrayList;

public class Flight {

    String flightNum;
    String destination;
    String departure_time;
    Plane plane;
    ArrayList<Passenger> bookedPassengers;

    public Flight(String flightNum, String destination, String departure_time) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure_time = departure_time;
        this.plane = new Plane(PlaneType.BOEING747);
        this.bookedPassengers = new ArrayList<Passenger>();
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture_time() {
        return departure_time;
    }

//    public void addPlane(Plane plane) {
//        this.planes.add(plane);
//    }

    public int checkNumOfPassengers() {
        return this.bookedPassengers.size();
    }

    public void bookFlight(Plane plane, Passenger passenger){
        if(remainingSeats() > checkNumOfPassengers()){
            this.bookedPassengers.add(passenger);
        }
    }

    public int remainingSeats() {
        int seats = plane.getPlaneCapacity();
        int totalSeatsAvailable = seats -= checkNumOfPassengers();
        return totalSeatsAvailable;
    }
}
