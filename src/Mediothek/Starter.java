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
		Mediothek mediothek = new Mediothek();
		Kunde kunde = mediothek.getKunde(name);
		
		
		
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
				System.out.println("Geben sie den Titel ein. Wenn sie alle verf�gbaren B�cher anzeigen lassen wollen geben sie 'anzeigen' ein.");
				eingabe = input.nextLine();
				if (eingabe.equals("anzeigen")) {
					mediothek.getMedien();
					System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumDa(eingabe);
					mediothek.addMediumWeg((Medien) medium);
					Mailbox mail = new Mailbox(kunde);
					mail.addAusgeliehen((Medien) medium);
					
				}
				else {
					System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumDa(eingabe);
					mediothek.addMediumWeg((Medien) medium);
					Mailbox mail = new Mailbox(kunde);
					mail.addAusgeliehen((Medien) medium);
					
				}
			}
			if (eingabe.equals("video")) {
				System.out.println("Geben sie den Titel ein. Wenn sie alle verf�gbaren B�cher anzeigen lassen wollen geben sie 'anzeigen' ein.");
				eingabe = input.nextLine();
				if (eingabe.equals("anzeigen")) {
					mediothek.getMedien();
					System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumDa(eingabe);
					mediothek.addMediumWeg((Medien) medium);
					Mailbox mail = new Mailbox(kunde);
					mail.addAusgeliehen((Medien) medium);
					
				}
				else {
					System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumDa(eingabe);
					mediothek.addMediumWeg((Medien) medium);
					Mailbox mail = new Mailbox(kunde);
					mail.addAusgeliehen((Medien) medium);
					
				}			
			}
			if (eingabe.equals("cd")) {
				System.out.println("Geben sie den Titel ein. Wenn sie alle verf�gbaren B�cher anzeigen lassen wollen geben sie 'anzeigen' ein.");
				eingabe = input.nextLine();
				if (eingabe.equals("anzeigen")) {
					mediothek.getMedien();
					System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumDa(eingabe);
					mediothek.addMediumWeg((Medien) medium);
					Mailbox mail = new Mailbox(kunde);
					mail.addAusgeliehen((Medien) medium);
					
				}
				else {
					System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumDa(eingabe);
					mediothek.addMediumWeg((Medien) medium);
					Mailbox mail = new Mailbox(kunde);
					mail.addAusgeliehen((Medien) medium);
					
				}
				
			}
			if (eingabe.equals("schm�ckern")) {
				mediothek.getMedien();
				System.out.println("Welches m�chten Sie ausleihen? (Eingabe: 'titel')");
				eingabe = input.nextLine();
				Object medium = mediothek.getMediumDa(eingabe);
				mediothek.addMediumWeg((Medien) medium);
				Mailbox mail = new Mailbox(kunde);
				mail.addAusgeliehen((Medien) medium);
				
			}
			else {
				System.out.println("Ung�ltige eingabe");
			}
		}
		if (eingabe.equals("r�ckgabe")) {
			// keine ahnung isch gloubs e seich hie (w�ge der new Mailbox)
			Mailbox mail = new Mailbox(kunde);
			System.out.println("Welches Medium m�chten Sie zur�ckgeben? (Eingabe: 'Titel'");
			eingabe = input.nextLine();
			Object medium = mediothek.getMediumWeg(eingabe);
			mail.r�ckgabe((Medien) medium);
			// noch aus dem medienWeg removen und in das medienDa adden
			mediothek.addMediumDa((Medien) medium);
			mediothek.removeMediumWeg((Medien) medium);	
			
		}
		if (eingabe.equals("mailbox")) {
			System.out.println("M�chten Sie die Mahnungen sehen? (Eingabe: 'mahnungen')");
			System.out.println("M�chten Sie die Rechnungen sehen? (Eingabe: 'rechnungen')");
			System.out.println("M�chten Sie die ausgeliehenen Medien sehen? (Eingabe: 'ausgeliehen')");
			eingabe = input.nextLine();
			if (eingabe.equals("mahnungen")) {
				// instanzierungen machen mir sorgen.. 
				Mailbox mail = new Mailbox(kunde);
				System.out.println(mail.getMahnungen());
				System.out.println("M�chten Sie eine Mahnung begleichen (Eingabe: Y/N)");
				eingabe = input.nextLine();
				if (eingabe.equals("Y")) {
					System.out.println("Geben Sie die Bezeichnung der Mahnung ein, die Sie bazahlen m�chten");
					eingabe = input.nextLine();
					System.out.println(mail.returnMahnung(eingabe)+" bezahlen (Eingabe: Y/N)");
					String eingabe2 = input.nextLine();
					if (eingabe2.equals("Y")) {
						mail.bezahleMahnung(mail.returnMahnung(eingabe));
					}
				}
					
				
			}
			if (eingabe.equals("rechnungen")) {
				// instanzierungen machen mir sorgen.. 
				Mailbox mail = new Mailbox(kunde);
				System.out.println(mail.getRechnungen());
				System.out.println("M�chten Sie eine Rechnung begleichen (Eingabe: Y/N)");
				eingabe = input.nextLine();
				if (eingabe.equals("Y")) {
					System.out.println("Geben Sie die Bezeichnung der Rechnung ein, die Sie bazahlen m�chten");
					eingabe = input.nextLine();
					System.out.println(mail.returnRechnung(eingabe)+" bezahlen (Eingabe: Y/N)");
					String eingabe2 = input.nextLine();
					if (eingabe2.equals("Y")) {
						mail.bezahleRechnung(mail.returnRechnung(eingabe));
					}
				}
							
			}
			if (eingabe.equals("ausgeliehen")) {
				// instanzierungen machen mir sorgen.. 
				Mailbox mail = new Mailbox(kunde);
				System.out.println(mail.getAusgeliehen());
				System.out.println("M�chten Sie eine Medium zur�ckgeben? (Eingabe: 'r�ckgabe')");
				System.out.println("M�chten Sie ein Medium verl�ngern? (Eingabe: 'verl�ngern')");
				eingabe = input.nextLine();
				if (eingabe.equals("r�ckgabe")) {
					System.out.println("Welches Medium m�chten Sie zur�ckgeben? (Eingabe: 'Titel'");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumWeg(eingabe);
					mail.r�ckgabe((Medien) medium);
					// noch aus dem medienWeg removen und in das medienDa adden 
					// geanu umgekehrt wie bei der ausleihe
					mediothek.addMediumDa((Medien) medium);
					mediothek.removeMediumWeg((Medien) medium);
				}
				if (eingabe.equals("verl�ngern")) {
					System.out.println("Welches Medium m�chten Sie verl�ngern? (Eingabe: 'Titel'");
					eingabe = input.nextLine();
					Object medium = mediothek.getMediumWeg(eingabe);
				}
				
			}
			else {
				System.out.println("Ung�ltige eingabe");
			}
				
			
		}
		else {
			System.out.println("Ung�ltige eingabe");
		}
		
	}
	// der kunde hat sich noch nie registriert : 
	else {
		System.out.println("Geben Sie Ihren Namen an");
		String name = input.nextLine();
		
		Mediothek m = new Mediothek();
		m.registerKunde(name);
		
		Kunde kunde = m.getKunde(name);
		Mailbox mailbox = new Mailbox(kunde);
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
			Kunde kunde1 = m.getKunde(name);
			Mitgliedschaft mitglied = new Mitgliedschaft(kunde1);
			kunde1.erstelleMitgliedschaft(kunde1); // keine ahnung..
			mitglied.renewMitgliedschaft();		// keine ahnung..
			
			}
		else {
			System.out.println("Sie m�ssen sp�ter wiederkommen, um etwas auszuleihen.");
			System.out.println("Ihre Registrierung wird verarbeitet.. haha");
		}
		}
	}		
}
	

