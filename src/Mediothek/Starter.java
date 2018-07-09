package Mediothek;

import java.util.*;

public class Starter {
	
	public static void main(String args[]) {
	
	System.out.println("Haben Sie sich schon angemeldet? Y/N");	
	Scanner input = new Scanner(System.in);
	String userInput = input.nextLine();
	
	if (userInput.equals("Y") || userInput.equals("y")) {
		
	}
	else {
		System.out.println("Geben Sie Ihren Namen an");
		String name = input.nextLine();
		
		Mediothek m = new Mediothek();
		m.registerKunde(name);
		
		
		System.out.println("Es wurde für Sie ein Benutzerkonto und eine Mailbox eingerichtet");
		System.out.println("Möchten Sie Mitglied werden? Es kostet Sie 10fr in der Woche, dafür werden die Ausleihen nicht berechnet Y/N");
		String userInput2 = input.nextLine();
		
		if (userInput.equals("Y") || userInput.equals("y")) {
			List<Kunde> kunden = m.getKunden();
			
			for (int i=0; i <= kunden.size(); i++) {
				// wenn der kunde der ist welcher sich gerade angemeldet hat
				// könnte auch das element im array mit dem grössten index sein
				// aber muss ich kunde = new Kunde schreiben? 
				// das macht doch schon register Kunde??
				//  und wie weiss man auf welchen kunde genau 
				// diese Mutgliedschaft erstellt wird??
				if (kunde.getName.equals(name)) {
					kunde.erstelleMitgliedschaft(kunde);
				}
				else {
					continue;
				}
				
			}}
		else {
			// keine mitgliedschaft 
			continue;
		}
		}
	}
	
		
	}
	
	
}
