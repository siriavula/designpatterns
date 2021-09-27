import java.util.Iterator;
/**
 * This is our FlightIterator class which implements the Iterator.
 */
public class FlightIterator implements Iterator<Flight> {

    /**
     * These are two instance variables. We have a array flights of type Flight and an integer variable for position.
     */
    private Flight[] flights;
    private int position;

    /**
     * This is the constructor of our FlightIterator class.
     * @param flights assigned to this.flights; an array of flights of type Flight.
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * This method returns true if there are flights to iterate.
     */
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method reutnrs the next flight if one exists, but otherwise it returns null.
     */
    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }
    
}
