
public class BusinessClass extends FlightClass{

	private int cost;
	private String amenities;
	private String snack;
	
	public BusinessClass(Passenger p, Flight f) {
		super(p,f);
		cost = 450;
	}
	public void  setSnack(String snackChoice) {
		if(snackChoice.equalsIgnoreCase("peanuts")) {
			this.snack = "Peanuts";
		}else if(snackChoice.equalsIgnoreCase("cookies")) {
			this.snack = "Cookies";
		}
		
	}
	public String getSnack() {
		
		return snack;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String printTicket() {
		String ticket = super.reserveUnitedTicket();
		String x = System.lineSeparator();
		ticket+= "Cost: $"+ cost+x;
		ticket+="Snack: "+snack+x;
		
		return ticket;
	}
	
}
