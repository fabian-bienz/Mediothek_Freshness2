package Mediothek;

import java.util.*;

public class Starter {
	
	public static void main(String args[]) {
	
	System.out.println("Haben Sie sich schon einmal registriert? Y/N");	
	Scanner input = new Scanner(System.in);
	String userInput = input.nextLine();
	
	if (userInput.equals("Y") || userInput.equals("y")) {
		System.out.println("Geben Sie Ihren Namen an");
		String name = input.nextLine();
		
		System.out.println("Möchten Sie ein Medium ausleihen? (Eingabe : 'ausleihen')");
		System.out.println("Möchten Sie ein Medium zurückgeben? (Eingabe : 'rückgabe')");
		System.out.println("Möchten Sie Ihre Maillbox anschauen? (Eingabe : 'mailbox')");
		
		String eingabe = input.nextLine();
		if (eingabe.equals("ausleihen")) {
			System.out.println("Möchten sie ein Buch ausleihen? (Eingabe: 'buch')");
			System.out.println("Möchten sie ein Video ausleihen? (Eingabe: 'video')");
			System.out.println("Möchten sie eine CD ausleihen? (Eingabe: 'cd')");
			System.out.println("Möchten Sie schmöckern und sich die verfügbaren Medien anzeigen lasen? (Eingabe : 'schmöckern') ");
			eingabe = input.nextLine();
			if (eingabe.equals("buch")) {
				
			}
			if (eingabe.equals("video")) {
				
			}
			if (eingabe.equals("cd")) {
				
			}
			if (eingabe.equals("schmöckern")) {
				
			}
			else {
				System.out.println("Ungültige eingabe");
			}
		}
		if (eingabe.equals("rückgabe")) {
			
		}
		if (eingabe.equals("mailbox")) {
			
		}
		else {
			System.out.println("Ungültige eingabe");
		}
		
	}
	else {
		System.out.println("Geben Sie Ihren Namen an");
		String name = input.nextLine();
		
		Mediothek m = new Mediothek();
		m.registerKunde(name);
		
		//mailbox:
		//..
		
		System.out.println("Es wurde für Sie ein Benutzerkonto und eine Mailbox eingerichtet");
		System.out.println("Möchten Sie Mitglied werden? Es kostet Sie 10fr in der Woche, dafür werden die Ausleihen nicht berechnet Y/N");
		String userInput2 = input.nextLine();
		
		if (userInput2.equals("Y") || userInput2.equals("y")) {
			// hier wird anhand des namens der korrekte kunde aus der liste geholt..
			// siehe in kunde nach.. 
			// der Mitgliedschaft muss jetzt auch ein Parameter "Kunde" mitgegeben werden.. 
			// damit die Mitgliedschaft immer auf einen Kunden lautet (vielleicht ein seich)
			Kunde kunde = m.getKunde(name);
			Mitgliedschaft mitglied = new Mitgliedschaft(kunde);
			kunde.erstelleMitgliedschaft(kunde); // keine ahnung..
			mitglied.renewMitgliedschaft();		// keine ahnung..
			
		}
		else {
			// keine mitgliedschaft 
		
		}
		}
	}
	
		
	}
	

