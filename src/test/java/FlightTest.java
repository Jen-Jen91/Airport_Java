import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(AircraftType.MEDIUM, "British Airways");
        flight = new Flight(plane, "BA2931", DestinationType.LONDON);
    }

    @Test
    public void flightHasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("BA2931", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals(DestinationType.LONDON, flight.getDestination());
    }

    @Test
    public void canGetPassengerCount() {
        Passenger passenger = new Passenger("Luna", "Lovegood");
        plane.addPassenger(passenger);
        assertEquals(1, flight.getTicketsBooked());
    }

}
