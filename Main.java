import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	static GraphicsConfiguration gc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Passenger passenger = new Passenger();
		
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
		FirstClass fc = new FirstClass(passenger,testFlight);
		fc.setSnack("cookies");
		fc.setFreeTaxi(true);
		
		FlightClass fclass = new FlightClass(passenger, testFlight);
		fclass.setPassenger(passenger);
		fclass.setFlight(testFlight);
		
		System.out.println(fc.reserveUnitedTicket());
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
		
		
		System.out.println(user.toString());
		
		System.out.println("We offer two flights: Service from Newark to Greensboro & Service from Greensboro to Newark");
		System.out.println("What would you like your destination to be?");
		String destination = scan.nextLine().trim();
		Flight userFlight = new Flight();
		
		if(destination.equals("Greensboro")) {
		userFlight.setLocTo(destination);
		userFlight.setLocFrom("Newark");
		}else if(destination.equals("Newark")) {
			userFlight.setLocTo(destination);
			userFlight.setLocFrom("Greensboro");
		}
		System.out.println("When will you be traveling? Format MM/DD/YYYY");
		String date = scan.nextLine().trim();
		userFlight.setDate(date);
		
		userFlight.addPassenger(user);
		
		if(fc.equals("First")) {
			FirstClass firstc = new FirstClass(user,userFlight);
			System.out.println(firstc.reserveUnitedTicket());
			
			
		}else if(fc.equals("Economy")) {
			EconomyClass ec = new EconomyClass(user,userFlight);
			System.out.println(ec.reserveUnitedTicket());
		}else if(fc.equals("Business")) {
			BusinessClass bc = new BusinessClass(user, userFlight);
			System.out.println(bc.reserveUnitedTicket());
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
