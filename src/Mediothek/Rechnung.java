package Mediothek;
import java.util.*;

public class Rechnung {
	
	public String bezeichnung;
	public int betrag;
	public Date endDate;
	public Kunde kunde;
	
	// auch der konstruktor für Mahnungen..
	// kunde auch übergeben??
	public Rechnung(String bezeichnung, int betrag, Date endDate, Kunde kunde) {
		this.bezeichnung = bezeichnung;
		this.betrag = betrag;
		this.endDate = endDate;
		this.kunde = kunde;
				
		
	}
	public void sendeRechnung() {
		// keine ahnung.. am schluss müsste es zum hashmap der mailbox des kunden landen
		// aber endDate geht verloren..? sollte sich kunde auf jeden fall anzeigen lassen können
		Mailbox mailbox = new Mailbox(kunde);
		mailbox.addRechnung(bezeichnung, betrag);
	}
	public void sendeMahnung() {
		// das hier passiert wenn ein endDatum überschritten wurde..
		
		if (endDatum > CurrentTime) { // keine ahnnugn 
			Mailbox mailbox = new Mailbox(kunde);
			// müsste man sich die bezeichnugn und den betrag von der entsprechenden rechnung holen..
			mailbox.getRechnungen().get(bezeichnung);//sowas??
			mailbox.addMahnung(bezeichnung, betrag); // hääää.. aber sollte ja der betrag der rechnung sein.. 
			
		}
	}
}
