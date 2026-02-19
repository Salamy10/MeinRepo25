package V;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;

public class D18_Attributes {

	public static void main(String[] args) {
		
		FlightConnection connection1 = new FlightConnection();	//Erstelle ein Objekt connection1 um darin Daten zu speichern
		
		connection1.airline = "Lufthansa";
		connection1.connectedID = "0400";
		connection1.arrivalAirport = "New York";
		connection1.departureAirport = "Frankfurt";
		
		Flight flight1 = new Flight();
		Flight flight2 = new Flight();
		
		flight1.flightConnection = connection1;	//gib dem Objekt die Daten aus connection 1
		flight1.flightDate = LocalDate.now();
		flight1.flightPriceInEuro = 498.36;
		
		flight2.flightConnection = connection1;
		flight2.flightDate = LocalDate.of(2026, 2, 27);
		flight2.flightPriceInEuro = 333.33;
		
		System.out.println(flight2.flightConnection.airline);	//attribut flight2 hat die connection. Connection hat die airline
		System.out.println(flight2.flightConnection.connectedID);	
		System.out.println(flight2.flightConnection.departureAirport);	
		System.out.println(flight2.flightConnection.arrivalAirport);	
		System.out.println(flight2.flightDate);	
		System.out.println(flight2.flightPriceInEuro);	


	}

}
