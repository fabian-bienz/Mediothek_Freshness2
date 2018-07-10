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
		
		System.out.println("M�chten Sie ein Medium ausleihen? (Eingabe : 'ausleihen')");
		System.out.println("M�chten Sie ein Medium zur�ckgeben? (Eingabe : 'r�ckgabe')");
		System.out.println("M�chten Sie Ihre Maillbox anschauen? (Eingabe : 'mailbox')");
		
		String eingabe = input.nextLine();
		if (eingabe.equals("ausleihen")) {
			System.out.println("M�chten sie ein Buch ausleihen? (Eingabe: 'buch')");
			System.out.println("M�chten sie ein Video ausleihen? (Eingabe: 'video')");
			System.out.println("M�chten sie eine CD ausleihen? (Eingabe: 'cd')");
			System.out.println("M�chten Sie schm�ckern und sich die verf�gbaren Medien anzeigen lasen? (Eingabe : 'schm�ckern') ");
			eingabe = input.nextLine();
			if (eingabe.equals("buch")) {
				
			}
			if (eingabe.equals("video")) {
				
			}
			if (eingabe.equals("cd")) {
				
			}
			if (eingabe.equals("schm�ckern")) {
				
			}
			else {
				System.out.println("Ung�ltige eingabe");
			}
		}
		if (eingabe.equals("r�ckgabe")) {
			
		}
		if (eingabe.equals("mailbox")) {
			
		}
		else {
			System.out.println("Ung�ltige eingabe");
		}
		
	}
	else {
		System.out.println("Geben Sie Ihren Namen an");
		String name = input.nextLine();
		
		Mediothek m = new Mediothek();
		m.registerKunde(name);
		
		//mailbox:
		//..
		
		System.out.println("Es wurde f�r Sie ein Benutzerkonto und eine Mailbox eingerichtet");
		System.out.println("M�chten Sie Mitglied werden? Es kostet Sie 10fr in der Woche, daf�r werden die Ausleihen nicht berechnet Y/N");
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
	

