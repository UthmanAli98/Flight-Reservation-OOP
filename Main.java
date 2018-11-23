import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	static GraphicsConfiguration gc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Passenger passenger = new Passenger();
		
		passenger.setFirstName("Uthman");
		passenger.setLastName("Alibalogun");
		passenger.setFlightClass("First");
		passenger.setSeatPref("Window");
		
		
		Flight testFlight = new Flight();
		
		testFlight.setLocTo("Greensboro");
		testFlight.setLocFrom("Newark");
		testFlight.setDate("10/2/2018");
		
		testFlight.setSeats(2);
		testFlight.addPassenger(passenger);
		testFlight.addPassenger(new Passenger("Ania","Wallace","Window"));
		testFlight.addPassenger(new Passenger());
		System.out.print(testFlight.isFullFlight());
		EconomyClass ec = new EconomyClass(passenger,testFlight);
		BusinessClass bc = new BusinessClass(passenger, testFlight);
		bc.setSnack("peanuts");
		
		FirstClass fc = new FirstClass(passenger,testFlight);
		fc.setSnack("cookies");
		fc.setFreeTaxi(true);
		
		FlightClass fclass = new FlightClass(passenger, testFlight);
		fclass.setPassenger(passenger);
		fclass.setFlight(testFlight);
		
		System.out.println(bc.reserveUnitedTicket());
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to United's Flight Booker!");
		
		System.out.println("What is your first name?");
		Passenger user = new Passenger();
		
		String fn = scan.nextLine().trim();
		user.setFirstName(fn);
		
		System.out.println("What is your last name?");
		String ln = scan.nextLine().trim();
		user.setLastName(ln);
		
		System.out.print("Would you like a Window or Aisle seat?");
		String sc = scan.nextLine().trim();
		user.setSeatPref(sc);
		
		System.out.println("What class Flight would you like? - First, Business, Economy");
		String fc = scan.nextLine().trim();
		user.setFlightClass(fc);
		
		
		
		System.out.println("We offer two flights: Service from Newark to Greensboro & Service from Greensboro to Newark");
		System.out.println("What would you like your destination to be?");
		String destination = scan.nextLine().trim();
		Flight userFlight = new Flight();
		userFlight.setSeats(20);
		if(destination.equalsIgnoreCase("Greensboro")) {
		userFlight.setLocTo(destination);
		userFlight.setLocFrom("Newark");
		}else if(destination.equalsIgnoreCase("Newark")) {
			userFlight.setLocTo(destination);
			userFlight.setLocFrom("Greensboro");
		}
		System.out.println("When will you be traveling? Format MM/DD/YYYY");
		String date = scan.nextLine().trim();
		userFlight.setDate(date);
		
		userFlight.addPassenger(user);
		
		if(fc.equalsIgnoreCase("First")) {
			FirstClass firstc = new FirstClass(user,userFlight);
			
			System.out.println("Would you like cookies or peanuts?");
			String snack = scan.nextLine().trim();
			
			if(snack.equalsIgnoreCase("peanuts")) {

				firstc.setSnack("peanuts");
					
			}else if(snack.equalsIgnoreCase("cookies")) {
				firstc.setSnack("cookies");
			}
			
			
			
			System.out.print("Would you like to use our free taxi service? Yes or No");
			String ftaxi = scan.nextLine().trim();
			
			if(ftaxi.equalsIgnoreCase("Yes")) {
				firstc.setFreeTaxi(true);
			}else if (ftaxi.equals("No")) {
				firstc.setFreeTaxi(false);
			}
			
		
			
			String x = System.lineSeparator();
			String ticket = firstc.reserveUnitedTicket();
			ticket+="Snack: "+ snack+x;
			
			System.out.println(ticket);
			
			
		}else if(fc.equalsIgnoreCase("Economy")) {
			EconomyClass ec = new EconomyClass(user,userFlight);
			System.out.println(ec.reserveUnitedTicket());
			
		}else if(fc.equalsIgnoreCase("Business")) {
			BusinessClass bc = new BusinessClass(user, userFlight);
			
			bc.setCost(450);
			System.out.println("Would you like cookies or peanuts?");
			String snack = scan.nextLine().trim();
			bc.setSnack(snack);
		
			
			String ticket = bc.reserveUnitedTicket();
			String x = System.lineSeparator();
			
			
			ticket += "Snack: " + snack+x;

			System.out.println(ticket);
			
			
		}
		
		
		/*
		FlightClass newFlightClass = new FlightClass();
		
		newFlightClass.setFlight(newFlight);
		newFlightClass.setPassenger(passenger);
		newFlightClass.setSeatType("Window");
		
		newFlightClass.printTicket();
		
		Passenger user = new Passenger();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Uthman's flight Booker!");
		
		System.out.println("Please type your first name then press enter");
		String fn = scan.nextLine();
		user.setFirstName(fn);
		
		System.out.println("Please type your last name then press enter: ");
		String ln = scan.nextLine();
		user.setLastName(ln);
		
		System.out.println("What class would you be riding in today? 1- Economy , 2 - Business , 3- First ");
		int fclass = scan.nextInt();
		
		while(fclass != 1 || fclass != 2|| fclass !=3) {
			System.out.println("Select a proper flight number!");
			 fclass = scan.nextInt();
			 System.out.println(fclass);
	}
		if(fclass == 1) {
			user.setFlightClass("Economy");
		}else if(fclass == 2 ) {
			user.setFlightClass("Business");
		}else if(fclass == 3) {
			user.setFlightClass("First");
		}
		*/
	}

}
