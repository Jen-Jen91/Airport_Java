import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(AircraftType.MEDIUM, "British Airways");
        flight = new Flight(plane, "BA2931", "London Gatwick");
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
        assertEquals("London Gatwick", flight.getDestination());
    }

}
