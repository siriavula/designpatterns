
/**
 * This class holds all of the details of the flight.
 */
public class Flight {
    /**
     * These are all of the instance variables. We have three strings and two integer variables.
     */
    String flightNum;
    String from;
    String to;
    int duration;
    int transfers;
    
    /**
     * This method is the constructor of the flight class.
     * @param flightNum is the number of the flight.
     * @param from is where the flight departs.
     * @param to is where the flight will arrive to.
     * @param duration is how long the flight will take.
     * @param transfers is the number of transfers during the flight.
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * This method is the accessor for "from." Its the getter and "gets" our value for where the flight departs.
     * @return returns the String of where the flight leaves from.
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * This method is the accessor for "to." Its the getter and "gets" our value for where the flight arrives.
     * @return returns the String of where the flight arrives at.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * This method is the accessor for "duration." Its the getter and "gets" our value for the duration of the flight.
     * @return returns the integer value of how long the flight takes.
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * This method is the accessor for "transfers." Its the getter and "gets" our value for the number of transfers.
     * @return returns the integer value of the number of transfers
     */
    public int getNumTransfers() {
        return this.transfers;
    }

    /**
     * This method returns a string of all of the information for the flight details.
     */
    public String toString() {
        if(getNumTransfers() == 0) {
            return "FlightNumber: " + this.flightNum + "\nFrom: " + getFrom() + "\nTo: " + getTo() + "\nDuration: " + getDuration() + "\nDirect Flight";
        }
        else if(getNumTransfers() == 1){
            return "FlightNumber: " + this.flightNum + "\nFrom: " + getFrom() + "\nTo: " + getTo() + "\nDuration: " + getDuration() + "\n1 Transfer";
        }
        else {
            return "FlightNumber: " + this.flightNum + "\nFrom: " + getFrom() + "\nTo: " + getTo() + "\nDuration: " + getDuration() + "\n" + getNumTransfers() + " Transfer";
        }
    }
    
}
