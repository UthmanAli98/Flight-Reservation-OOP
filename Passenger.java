
public class Passenger{

	private String firstName;
	private String lastName;
	private String seatPref;
	//private FlightClass fclass;

	private String classType;
	
	public Passenger(String f, String l, String s) {
		setFirstName(f);
		setLastName(l);
		setSeatPref(s);
		
	}
	public Passenger() {
		this.firstName = "";
		this.lastName = "";
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFlightClass(String classType) {
		
			this.classType = classType;
		
	}

	
	public String getFlightClass() {
		return classType;
	}
	@Override
	public String toString() {
		
		return firstName+" "+lastName +" "+ classType+" "+seatPref;
	}

	public String getSeatPref() {
		return seatPref;
	}

	public void setSeatPref(String seatPref) {
		this.seatPref = seatPref;
	}
}
