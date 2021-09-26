public class Airline {
    static final int INITIAL = 2; // MAY DELETE

    private String title;
    private Flight[] flights;
    private int size = 0;

    public Airline(String title) {
        this.title = title;
        flights = new Flight[INITIAL];
       // this.flights = flights; // MAY BE WRONG
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flight = new Flight(flightNum, from, to, duration, transfers);
        if (size >= INITIAL) {
            System.err.println("Sorry, cannot add flight! Flights are full!");
        } else {
            growArray(flights);
            flights[size] = flight;
           // flights[size] = flight; // maybe multiply size by 2
           // size = size + 1;

        }
    }

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {
        flights = new Flight[size*2];
        return flights;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
    
}
