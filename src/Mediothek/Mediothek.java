package Mediothek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediothek {
	
	private List<Kunde> kunden;
	private Map<Integer, String> medienDa; //medien, die sich in der Mediothek befinden 
	private Map<Integer, String> medienWeg; // medien, die ausgeliehen sind..k�nnte auch ein attribut sein..
	
	public Mediothek() {
		kunden = new ArrayList<Kunde>();
		medienDa = new HashMap<Integer, String>();
	}
	
	public void addMedium(Medien medium) {
		medienDa.put(medium.getId(),medium.getTitel());
	}
	
	public void printMedien() {
		for(Map.Entry m:medienDa.entrySet()){
			System.out.print(m.getKey());
			System.out.print(": " + m.getValue() + "\n");
		}
	}
	// einen kunden anhand eines namen registrieren 
	public void registerKunde(String name) {
		// id vergeben 
		int id = kunden.size() +1;
		// kunde adden 
		Kunde kunde = new Kunde(name, id);
		kunden.add(kunde);
	}

	public List<Kunde> getKunden() {
		return kunden;
	}
	// einen kunden anhand eines Namen herausfinden
	public Kunde getKunde(String name) {
		Kunde dieser = null;
		for (Kunde kunde: kunden) {
			if (kunde.getName().equals(name)) {				
				dieser = kunde;
			}
		}
		return dieser;			
	}

	public void setKunden(List<Kunde> kunden) {
		this.kunden = kunden;
	}

	public Map<Integer, String> getMedien() {
		return medienDa;
	}

	public void setMedien(Map<Integer, String> medien) {
		this.medienDa = medien;
	}
	
	
	
	
}
