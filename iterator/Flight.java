public class Flight {
    
    String flightNum;
    String from;
    String to;
    int duration;
    int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

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
