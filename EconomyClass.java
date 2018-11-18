
public class EconomyClass extends FlightClass{

	private int cost;
	
	
	public EconomyClass(Passenger p ,Flight f) {

		super(p,f);
		cost = 300;
		
	}
	public String reserveUnitedTicket() {
		
		String ticket = super.reserveUnitedTicket();
		String x = System.lineSeparator();
		ticket+= "Cost: $"+cost;
		return ticket;
	}
	
}
