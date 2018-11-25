public class Flight {

    private Plane plane;
    private String flightNumber;
    private DestinationType destination;

    public Flight(Plane plane, String flightNumber, DestinationType destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public DestinationType getDestination() {
        return this.destination;
    }

    public int getTicketsBooked() {
        return this.plane.passengerCount();
    }
}
