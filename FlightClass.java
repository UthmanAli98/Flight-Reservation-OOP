
public class FlightClass {

	private String seatType;
	Passenger p;
	Flight f;
	FlightClass(Passenger p, Flight f){
		this.p = p;
		this.f = f;
	}
	
	public void setPassenger(Passenger passenger) {
		this.p = passenger;
	}
	public Passenger getPassenger() {
		return p;
	}
	public void setFlight(Flight f) {
		this.f = f;
	}
	public Flight getFlight() {
		return f;
	}
	public void setSeatType(String seatType) {
		if(seatType.equals("Window")) {
			this.seatType = "Window";
		}else {
			this.seatType = "Aisle";
		}
	}
	public String getSeatType() {
		return seatType;
	}
	

	public String reserveUnitedTicket() {
	
		String x = System.lineSeparator();
        String ticket = "Flight Ticket" + x + "------------------------------------------------------------"+x;

        ticket+= "First Name: " + p.getFirstName() + x;
        ticket+= "Last  Name: " + p.getLastName() + x;
        ticket+= "Flight Date: "+f.getDate()+ x;
        ticket+= "Flight Class: "+ p.getFlightClass()+x;
        ticket+= "Seat Type: "+ p.getSeatPref()+ x;
        ticket+= "Departing: "+f.getDepartT() + " from: " + f.getLocFrom() +x;
        ticket+= "Arrival: "+f.getArrivalT() +" to: "+ f.getLocTo()+x;
        ticket+= "Flight Number: "+ f.getFlightNum()+x;
        return ticket;

	}
	
	
}


