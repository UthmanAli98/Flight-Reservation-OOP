
public class Passenger {

	private String firstName;
	private String lastName;
	private String classType;
	private String seatPref;
	private double cost;
	
	Passenger(){
		setFirstName("");
		setLastName("");
		setClassType("");
		setSeatPref("");
		cost = 0.0;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getClassType() {
		return classType;
	}


	public void setClassType(String classType) {
		this.classType = classType;
	}


	public String getSeatPref() {
		return seatPref;
	}


	public void setSeatPref(String seatPref) {
		this.seatPref = seatPref;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(String classType) {
		if(classType.equals("Economy")){
			this.cost = 300;
		}else if(classType.equals("Business")) {
			this.cost = 450;
		}else if(classType.equals("First")) {
			this.cost = 900;
		}
	}
	
	
}
