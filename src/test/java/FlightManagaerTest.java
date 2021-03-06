import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagaerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    ArrayList<Passenger> bookedPassengers;
    Plane airCodeClan1;
    Flight flight1;
    FlightManager flightManager;

    @Before
    public void setUp() {
        passenger1 = new Passenger("Rique", 2);
        passenger2 = new Passenger("Fiona", 1);
        passenger3 = new Passenger("Mitzy", 0);
        airCodeClan1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight("GRU217", "SAO PAULO", "1700");
        bookedPassengers = new ArrayList<Passenger>();
        flightManager = new FlightManager(flight1, passenger2, airCodeClan1);
        bookedPassengers.add(passenger1);
        bookedPassengers.add(passenger2);
        bookedPassengers.add(passenger3);


    }

    @Test
    public void getWeightOfBaggage() {
        assertEquals(10, flightManager.baggageWeightAllowed());
    }

}
