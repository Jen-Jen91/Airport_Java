import java.util.ArrayList;

public class Airport {

    private String name;
    private String code;
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;

    public Airport(String name, String code) {
        this.name = name;
        this.code = code;
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public int planeCount() {
        return this.hangar.size();
    }

    public void addPlaneToHangar(Plane plane) {
        this.hangar.add(plane);
    }

    public int flightCount() {
        return this.flights.size();
    }

    public Plane removePlaneFromHangar(Plane plane) {
        int index = 0;
        if (this.hangar.contains(plane)) {
            index = this.hangar.indexOf(plane);
        }
        return this.hangar.remove(index);
    }

    public void createFlight(Plane plane, String code, String destination) {
        Plane planeFromHangar = removePlaneFromHangar(plane);
        Flight flight = new Flight(planeFromHangar, code, destination);
        this.flights.add(flight);
    }


}
