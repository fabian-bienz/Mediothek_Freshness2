package Mediothek;
import java.util.*;

public class Mailbox {
	// diese Listen müssten pro kunde existieren.. tun sie das so?
	private Map<String, Integer> mahnungen; //String für die bezeichnung der Mahnung.. oder so und int für den betrag
	private List<Medien> ausgeliehen;
	private Map<String, Integer> rechnungen; // String für die Bezeichnung der Rechnung und int für den Betrag
	
	public Mailbox(Kunde kunde) {
		ausgeliehen = new ArrayList<Medien>();
		mahnungen = new HashMap<String, Integer>();
		rechnungen = new HashMap<String, Integer>();
		
	}

	public Map<String, Integer> getMahnung() {
		return mahnungen;
	}
	// wenn sich eine Zahlung verzögert wird diese funktion aufgerufen..
	public void addMahnung(String key, int value) {
		mahnungen.put(key, value);
	}

	public void setMahnungen(Map<String, Integer> mahnungen) {
		this.mahnungen = mahnungen;
	}

	public List<Medien> getAusgeliehen() {
		return ausgeliehen;
	}
	// wird ein Medium ausgeliehen, dann wird es nicht nur zentral in der Mediothek in die Liste "medienWeg"geaddet
	// sondern auch in die persönliche liste des Kunden geaddet..
	// auf diese weise hat der kunde den überblick über alle medien die er schon ausgeliehen hat
	// hier kann man auch eine obergrenze festlegen, sodass er nicht mehr als (zb 20) medien auslehien kann..
	
	public void addAusgeliehen(Medien medium) {
		if (ausgeliehen.size() <= 20) {
		ausgeliehen.add(medium);
		}
		else {
			System.out.println("Sie haben bereits 20 Medien ausgeliehen. Sie müssen ein Medium zurückgeben, wenn sie weitere Medien ausleihen möchten..");
		}		
	}
	
	public void rückgabe(Medien medium) {
		ausgeliehen.remove(medium);
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
	
	
}
