
public class FirstClass extends BusinessClass {

	private boolean freeTaxi;
	private int cost;
	
	public FirstClass(Passenger p , Flight f) {
		super(p,f);
		setFreeTaxi(false);
		this.cost = 900;
	}
	
	public void setTaxi(String wantsTaxi) {
		if(wantsTaxi.equalsIgnoreCase("YES")) {
			
		}
	}

	public boolean isFreeTaxi() {
		return freeTaxi;
	}

	public void setFreeTaxi(boolean freeTaxi) {
		this.freeTaxi = freeTaxi;
	}
	public int getCost() {
		return cost;
	}
	public String reserveUnitedTicket() {
		String ticket = super.printTicket();
		String x = System.lineSeparator();
		ticket+= "Cost: $"+ cost+x;
		ticket+="Snack: "+super.getSnack()+x;
		ticket+="Wants a free taxi: "+isFreeTaxi()+x;
		
		return ticket;
	}
	
}
