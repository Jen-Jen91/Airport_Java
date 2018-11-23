import java.util.ArrayList;

public class Passenger {

    private String firstName;
    private String lastName;
    private ArrayList<Flight> flights;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flights = new ArrayList<>();
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int flightCount() {
        return this.flights.size();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
}
