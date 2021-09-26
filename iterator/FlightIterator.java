import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;
public class FlightIterator implements Iterator<Flight> {

    private Flight[] flights;
    private int position = 0;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }
    
}
