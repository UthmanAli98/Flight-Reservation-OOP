import java.util.HashMap;
import java.util.HashSet;

public class Flight {

	private HashMap<String,Passenger> passengerList;
	private int seats;
    private String locTo, locFrom; 
    private Passenger[] listOfPassengers;
    private String flightNum;
    private String departT, arrivalT;
    int top = -1;
    private String date;
    private String fullFlight;
    public Flight(){
    	
    	setSeats(0);
    	locTo = "";
    	locFrom = "";
    	setFlightNum("");
    	passengerList = new HashMap();
    }

	public Passenger[] getListOfPassengers() {
		return listOfPassengers;
	}
	public boolean isFullFlight() {
		return top == seats;
	}

	public void setLocTo(String destination) {
		this.locTo = destination;
		
		if(destination.trim().equalsIgnoreCase("Greensboro")) {
			this.flightNum = "320";
			this.setDepartT("1:59 PM");
			this.setArrivalT("3:29PM");
		}
		if(destination.equalsIgnoreCase("Newark")) {
			this.flightNum = "310";
			this.setArrivalT("9:30 AM");
			this.setDepartT("8:00 AM");
		}
	}
	public String getLocTo() {
		return locTo;
	}
	public void setLocFrom(String arrival) {
		this.locFrom = arrival;
		
	}
	public String getLocFrom() {
		return locFrom;
	}

	public int getSeats() {
		return seats;
	}
	public void addPassenger(Passenger passenger) {
		try {
			top = top + 1;
			listOfPassengers[top] = passenger;
			passengerList.put(passenger.getFirstName(), passenger);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("There aare no more seats on the flight!");
		}
	}
	public void getPassenger(String firstName) {
		if(passengerList.containsKey(firstName)) {
			
			Passenger pg = passengerList.get(firstName);
			
		}
	
	}
	public void setSeats(int seats) {
		this.seats = seats;
		listOfPassengers = new Passenger[seats];
	}

	public String getFlightNum() {
		return flightNum;
	}

	
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getArrivalT() {
		return arrivalT;
	}

	public void setArrivalT(String arrivalT) {
		this.arrivalT = arrivalT;
	}

	public String getDepartT() {
		return departT;
	}

	public void setDepartT(String departT) {
		this.departT = departT;
	}
	
	@Override
	public String toString() {
		
		return flightNum + " "+ departT +" "+ arrivalT +" "+locFrom +" "+ locTo+" "+ date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
