import java.util.ArrayList;

public class Plane {

    private AircraftType aircraft;
    private String airline;
    private ArrayList<Passenger> passengers;
    private boolean isBroken;

    public Plane(AircraftType aircraft, String airline) {
        this.aircraft = aircraft;
        this.airline = airline;
        this.passengers = new ArrayList<>();
        this.isBroken = false;
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

    public boolean isFull() {
        return this.aircraft.getValue() == passengerCount();
    }

    public void setAircraft(AircraftType newAircraft) {
        this.aircraft = newAircraft;
    }

    public void setPlaneIsBroken() {
        this.isBroken = true;
    }

    public boolean isBrokenDown() {
        if (this.isBroken) {
            return true;
        }
        return false;
    }
}
