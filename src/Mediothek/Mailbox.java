package Mediothek;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Mailbox {
	// man könnte auch eine haschmap mit <Date, Integer> machen um das EndDate mitzugeben.. 
	
	// diese Listen müssten pro kunde existieren.. tun sie das so?
	private Map<String , Integer> mahnungen; //String für die bezeichnung der Mahnung.. oder so und int für den betrag
	private Map<Medien, Date> ausgeliehen; // Welches Medium mit welchem rückgabedatum?
	private Map<String, Integer> rechnungen; // String für die Bezeichnung der Rechnung und int für den Betrag
	public Kunde kunde;
	
	// wo befindet sich eine liste der Mailboxen oder eine liste der registrieren kunden? 
	public Mailbox(Kunde kunde) {
		ausgeliehen = new HashMap<Medien, Date>();
		mahnungen = new HashMap<String, Integer>();
		rechnungen = new HashMap<String, Integer>();
		this.kunde = kunde;
	}

	public Map<String, Integer> getMahnungen() {
		return mahnungen;
	}
	// wenn sich eine Zahlung verzögert wird diese methode aufgerufen..
	public void addMahnung(String key, int value) {
		mahnungen.put(key, value);
	}
	//wenn etwas bezahlt werden muss wird diese methode aufgerufen
	public void addRechnung(String key, int value) {
		rechnungen.put(key, value);
	}

	public void setMahnungen(Map<String, Integer> mahnungen) {
		this.mahnungen = mahnungen;
	}

	public Map<Medien, Date> getAusgeliehen() {
		return ausgeliehen;
	}
	// wird ein Medium ausgeliehen, dann wird es nicht nur zentral in der Mediothek in die Liste "medienWeg"geaddet
	// sondern auch in die persönliche liste des Kunden geaddet..
	// auf diese weise hat der kunde den überblick über alle medien die er schon ausgeliehen hat
	// hier kann man auch eine obergrenze festlegen, sodass er nicht mehr als (zb 20) medien auslehien kann..
	
	public void addAusgeliehen(Medien medium) {
		if (ausgeliehen.size() <= 20) {
		
		// es muss ein rückgabedatum festgelegt werden bezogen auf den kunde und auf das medium
			Date endDatum = new Date();
			endDatum = new Date(endDatum.getTime()+ TimeUnit.DAYS.toMillis(30));
		
			ausgeliehen.put(medium, endDatum);
			// kostet es was? resp ist der Kunde Mitglied sonst bekommt er eine REchnung..
			if (kunde.istMitglied == false) {
				Rechnung rechnung = new Rechnung(medium.titel, 5, endDatum, kunde);
				rechnung.sendeRechnung();
			}
		// es muss mitgezählt werden wie oft er noch verlängern darf .. keine ahnung sollte auch eine Spalte sein in der Tabelle.. Hashmaps bestahen aber irgendwie mur aus Keys  und Values..
		}
		else {
			System.out.println("Sie haben bereits 20 Medien ausgeliehen. Sie müssen ein Medium zurückgeben, wenn sie weitere Medien ausleihen möchten..");
		}		
	}
	
	public void rückgabe(Medien medium) {
		ausgeliehen.remove(medium);
	}
	
	public void bezahleMahnung(Object mahnung) {
		mahnungen.remove(mahnung);
	}
	
	public void bezahleRechnung(Object rechnung) {
		rechnungen.remove(rechnung);
	}
	public void setAusgeliehen(List<Medien> ausgeliehen) {
		this.ausgeliehen = ausgeliehen;
	}

	public Map<String, Integer> getRechnungen() {
		return rechnungen;
	}

	public void setRechnungen(Map<String, Integer> rechnungen) {
		this.rechnungen = rechnungen;
	}
	public Object returnMahnung (String key) {
		return mahnungen.get(key);
	}
	public Object returnRechnung(String key) {
		return rechnungen.get(key);
	}
	
	
}
