import java.util.ArrayList;
import java.util.HashMap;

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
//        int index = 0;
//        if (this.hangar.contains(plane)) {
//            index = this.hangar.indexOf(plane);
//        }
//        return this.hangar.remove(index);
        if (this.hangar.remove(plane)){
            return plane;
        }
        return this.hangar.remove(0);
    }


    public void createFlight(Plane plane, String code, DestinationType destination) {
        assignPlaneToFlight(plane, destination);
        assignNewPlaneIfBroken(plane, destination);
        Plane planeFromHangar = removePlaneFromHangar(plane);
        Flight flight = new Flight(planeFromHangar, code, destination);
        this.flights.add(flight);
    }


    public void sellTicket(Flight flight, Passenger passenger) {
        Plane plane = flight.getPlane();

        if (!plane.isFull()) {
            plane.addPassenger(passenger);
            passenger.addFlight(flight);
        }
    }


//    public ArrayList<Integer> passengersOnEachFlight() {
//        ArrayList<Integer> bookings = new ArrayList<>();
//        for (Flight flight : this.flights) {
//            int tickets = flight.getTicketsBooked();
//            bookings.add(tickets);
//        }
//        return bookings;
//    }


//    public HashMap<String, Integer> passengersOnEachFlight() {
//        HashMap<String, Integer> passengers = new HashMap<>();
//
//        for (Flight flight : this.flights) {
//            int tickets = flight.getTicketsBooked();
//            passengers.put(flight.getFlightNumber(), tickets);
//        }
//        return passengers;
//    }


    public void assignPlaneToFlight(Plane plane, DestinationType destination) {
        if (destination.getValue() == "Scotland") {
            plane.setAircraft(AircraftType.TINY);
        } else if (destination.getValue() == "UK") {
            plane.setAircraft(AircraftType.SMALL);
        } else if (destination.getValue() == "Western Europe") {
            plane.setAircraft(AircraftType.MEDIUM);
        } else if (destination.getValue() == "Eastern Europe") {
            plane.setAircraft(AircraftType.BIG);
        } else if (destination.getValue() == "Western Asia") {
            plane.setAircraft(AircraftType.BIG);
        } else if (destination.getValue() == "Eastern Asia") {
            plane.setAircraft(AircraftType.HUGE);
        } else if (destination.getValue() == "America") {
            plane.setAircraft(AircraftType.HUGE);
        }
    }

    public void assignNewPlaneIfBroken(Plane plane, DestinationType destination) {
        if (plane.isBrokenDown()) {
            if (destination.getValue() == "Scotland") {
                plane.setAircraft(AircraftType.SMALL);
            } else if (destination.getValue() == "UK") {
                plane.setAircraft(AircraftType.MEDIUM);
            } else if (destination.getValue() == "Western Europe") {
                plane.setAircraft(AircraftType.BIG);
            } else if (destination.getValue() == "Eastern Europe") {
                plane.setAircraft(AircraftType.HUGE);
            } else if (destination.getValue() == "Western Asia") {
                plane.setAircraft(AircraftType.HUGE);
            } else if (destination.getValue() == "Eastern Asia") {
                plane.setAircraft(AircraftType.BIG);
            } else if (destination.getValue() == "America") {
                plane.setAircraft(AircraftType.BIG);
            }
        }



    }


}
