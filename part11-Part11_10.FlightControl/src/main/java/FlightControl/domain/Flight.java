package FlightControl.domain;

public class Flight {
    
    private Airplane airplane;
    private Place destination;
    private Place departure;
    
    public Flight(Airplane airplane, Place departureAirport, Place destinationAirport) {
        this.airplane = airplane;
        this.departure = departureAirport;
        this.destination = destinationAirport;
    }
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    public Place getDeparture() {
        return this.departure;
    }
    
    public Place getDestination() {
        return this.destination;
    }
    
    @Override
    public String toString() {
        return this.airplane + " (" + this.departure + "-" + this.destination + ")";
    }
}