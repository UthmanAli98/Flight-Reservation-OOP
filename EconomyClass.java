
public class EconomyClass extends FlightClass{

	private int cost;
	
	
	public EconomyClass(Passenger p ,Flight f) {

		super(p,f);
		this.cost = 300;
		
	}
	public int getCost() {
		return cost;
	}
	public String reserveUnitedTicket() {
		
		String ticket = super.reserveUnitedTicket();
		String x = System.lineSeparator();
		ticket+= "Cost: $"+getCost()+x;
		return ticket;
	}
	
}
