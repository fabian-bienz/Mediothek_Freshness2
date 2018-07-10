package Mediothek;
import java.util.*;

public class Mailbox {
	// diese Listen m�ssten pro kunde existieren.. tun sie das so?
	private Map<String, Integer> mahnungen; //String f�r die bezeichnung der Mahnung.. oder so und int f�r den betrag
	private List<Medien> ausgeliehen;
	private Map<String, Integer> rechnungen; // String f�r die Bezeichnung der Rechnung und int f�r den Betrag
	
	public Mailbox(Kunde kunde) {
		ausgeliehen = new ArrayList<Medien>();
		mahnungen = new HashMap<String, Integer>();
		rechnungen = new HashMap<String, Integer>();
		
	}

	public Map<String, Integer> getMahnung() {
		return mahnungen;
	}
	// wenn sich eine Zahlung verz�gert wird diese funktion aufgerufen..
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
	// sondern auch in die pers�nliche liste des Kunden geaddet..
	// auf diese weise hat der kunde den �berblick �ber alle medien die er schon ausgeliehen hat
	// hier kann man auch eine obergrenze festlegen, sodass er nicht mehr als (zb 20) medien auslehien kann..
	
	public void addAusgeliehen(Medien medium) {
		if (ausgeliehen.size() <= 20) {
		ausgeliehen.add(medium);
		}
		else {
			System.out.println("Sie haben bereits 20 Medien ausgeliehen. Sie m�ssen ein Medium zur�ckgeben, wenn sie weitere Medien ausleihen m�chten..");
		}		
	}
	
	public void r�ckgabe(Medien medium) {
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
