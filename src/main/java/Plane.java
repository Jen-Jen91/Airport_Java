import java.util.ArrayList;

public class Plane {

    private AircraftType aircraft;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(AircraftType aircraft, String airline) {
        this.aircraft = aircraft;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public AircraftType getAircraftType() {
        return this.aircraft;
    }

    public String getAirline() {
        return this.airline;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

}
