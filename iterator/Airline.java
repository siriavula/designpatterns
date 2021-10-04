/**
 * This is the Airline class. We use this class to add flights to the airline and return an iterator.
 */
public class Airline {

    /**
     * These are all of the instance variables. We have a string for the title, a integer variable for the size, and the array of flights.
     */
    private String title;
    private Flight[] flights;
    private int size = 0;

    /**
     * This method is the constructor for the Airline class.
     * @param title is the title of the airline represented by a String.
     */
    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
    }

    /**
     * This method adds the flight to the array of flights for the airline.
     * @param flightNum is the number of the flight.
     * @param from is where the flight departs.
     * @param to is where the flight will arrive to.
     * @param duration is how long the flight will take.
     * @param transfers is the number of transfers during the flight.
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        if(size == flights.length) {
            flights = growArray(flights);
        }
        flights[size] = new Flight(flightNum, from, to, duration, transfers);
    }

    /**
     * This method is the accessor for "title." Its the getter and "gets" our String value for the title of the airline.
     * @return returns the String of the title of the airline.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * This method helps the array "grow" by returning an array that has twice the size but still retaining all its data. 
     * @param flights is the array of flights
     * @return returns an array of the flights with a bigger size
     */
    private Flight[] growArray(Flight[] flights) {
        flights = new Flight[size*2];
        return flights;
    }

    /**
     * This method creates a new FlightIterator and returns it.
     * @return returns a new FlightIterator
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
    
}
