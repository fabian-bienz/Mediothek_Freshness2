package Mediothek;
import java.util.*;

public class Rechnung {
	
	public String bezeichnung;
	public int betrag;
	public Date endDate;
	public Kunde kunde;
	
	// auch der konstruktor f�r Mahnungen..
	// kunde auch �bergeben??
	public Rechnung(String bezeichnung, int betrag, Date endDate, Kunde kunde) {
		this.bezeichnung = bezeichnung;
		this.betrag = betrag;
		this.endDate = endDate;
		this.kunde = kunde;
				
		
	}
	public void sendeRechnung() {
		// keine ahnung.. am schluss m�sste es zum hashmap der mailbox des kunden landen
		// aber endDate geht verloren..? sollte sich kunde auf jeden fall anzeigen lassen k�nnen
		Mailbox mailbox = new Mailbox(kunde);
		mailbox.addRechnung(bezeichnung, betrag);
	}
	public void sendeMahnung() {
		// das hier passiert wenn ein endDatum �berschritten wurde..
		
		if (endDatum > CurrentTime) { // keine ahnnugn 
			Mailbox mailbox = new Mailbox(kunde);
			// m�sste man sich die bezeichnugn und den betrag von der entsprechenden rechnung holen..
			mailbox.getRechnungen().get(bezeichnung);//sowas??
			mailbox.addMahnung(bezeichnung, betrag); // h����.. aber sollte ja der betrag der rechnung sein.. 
			
		}
	}
}
