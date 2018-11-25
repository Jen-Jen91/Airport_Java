import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(AircraftType.MEDIUM, "easyJet");
        passenger = new Passenger("Hermione", "Granger");
    }

    @Test
    public void canGetAircraftType() {
        assertEquals(AircraftType.MEDIUM, plane.getAircraftType());
    }

    @Test
    public void canGetAirline() {
        assertEquals("easyJet", plane.getAirline());
    }

    @Test
    public void planeStartsEmpty() {
        assertEquals(0, plane.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.passengerCount());
    }

    @Test
    public void planeCanBeFull() {
        plane = new Plane(AircraftType.TINY, "easyJet");
        plane.addPassenger(passenger);
        plane.addPassenger(passenger);
        plane.addPassenger(passenger);
        plane.addPassenger(passenger);
        plane.addPassenger(passenger);
        assertEquals(true, plane.isFull());
    }

    @Test
    public void canSetAircraftType() {
        plane.setAircraft(AircraftType.TINY);
        assertEquals(AircraftType.TINY, plane.getAircraftType());
    }

}
