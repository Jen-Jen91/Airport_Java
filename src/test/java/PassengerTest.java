import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        passenger = new Passenger("Harry", "Potter");
        plane = new Plane(AircraftType.SMALL, "easyJet");
        flight = new Flight(plane, "U26925", "Amsterdam");
    }

    @Test
    public void hasFirstName() {
        assertEquals("Harry", passenger.getFirstName());
    }

    @Test
    public void hasLastName() {
        assertEquals("Potter", passenger.getLastName());
    }

    @Test
    public void startsWithNoFlights() {
        assertEquals(0, passenger.flightCount());
    }

    @Test
    public void canAddFlight() {
        passenger.addFlight(flight);
        assertEquals(1, passenger.flightCount());
    }
}
