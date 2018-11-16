import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    FlightManager flightManager;
    Flight flight1;
    Plane airCodeClan1;

    @Before
    public void setUp(){

        passenger1 = new Passenger("Rique", 2);
        passenger2 = new Passenger("Fiona", 1);
        passenger3 = new Passenger("Mitzy", 0);
        airCodeClan1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight("GRU217", "SAO PAULO", "1700");
        flightManager = new FlightManager(flight1, passenger2, airCodeClan1);
    }

    @Test
    public void passengerCanDispatchMoreBags() {
        passenger2.setNumOfBags(2);
        assertEquals(2, passenger2.getNumOfBags());
    }

}
