import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airport;
    private Plane plane;
    private Flight flight;
    private Passenger passenger;


    @Before
    public void before() {
        airport = new Airport("Edinburgh", "EDI");
        plane = new Plane(AircraftType.TINY, "Ryanair");
        flight = new Flight(plane, "FR6266", "Barcelona");
        passenger = new Passenger("Ron", "Weasley");
    }

    @Test
    public void hasName() {
        assertEquals("Edinburgh", airport.getName());
    }

    @Test
    public void hasCode() {
        assertEquals("EDI", airport.getCode());
    }

    @Test
    public void startsWithEmptyHangar() {
        assertEquals(0, airport.planeCount());
    }

    @Test
    public void canAddPlaneToHangar() {
        airport.addPlaneToHangar(plane);
        assertEquals(1, airport.planeCount());
    }

    @Test
    public void startsWithNoFlights() {
        assertEquals(0, airport.flightCount());
    }

    @Test
    public void canRemovePlaneFromHangar() {
        airport.addPlaneToHangar(plane);
        assertEquals(1, airport.planeCount());
        airport.removePlaneFromHangar(plane);
        assertEquals(0, airport.planeCount());
    }

    @Test
    public void canAddFlight() {
        airport.addPlaneToHangar(plane);
        airport.createFlight(plane, "FR6266", "Barcelona");
        assertEquals(1, airport.flightCount());
    }

    @Test
    public void canSellTicket() {
        airport.sellTicket(flight, passenger);
        assertEquals(1, plane.passengerCount());
        assertEquals(1, passenger.flightCount());
    }

    @Test
    public void cannotSellTicketIfPlaneFull() {
        airport.sellTicket(flight, passenger);
        airport.sellTicket(flight, passenger);
        airport.sellTicket(flight, passenger);
        airport.sellTicket(flight, passenger);
        airport.sellTicket(flight, passenger);
        airport.sellTicket(flight, passenger);
        assertEquals(5, plane.passengerCount());
        assertEquals(5, passenger.flightCount());
    }

}
