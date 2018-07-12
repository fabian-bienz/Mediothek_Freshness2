package Mediothek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediothek {
	
	private List<Kunde> kunden;
	private Map<Integer, String> medienDa; //medien, die sich in der Mediothek befinden 
	private Map<Integer, String> medienWeg; // medien, die ausgeliehen sind..könnte auch ein attribut sein..
	
	public Mediothek() {
		kunden = new ArrayList<Kunde>();
		medienDa = new HashMap<Integer, String>();
	}
	
	public void addKunde(Kunde kunde) {
		kunden.add(kunde);
	}
	
	public void addMediumDa(Medien medium) {
		medienDa.put(medium.getId(),medium.getTitel());
	}
	public void addMediumWeg(Medien medium) {
		medienWeg.put(medium.getId(),medium.getTitel());
		
	}
	public void removeMediumDa(Medien medium) {
		medienDa.remove(medium);
	}
	public void removeMediumWeg(Medien medium) {
		medienWeg.remove(medium);
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
		Kunde kunde = new Kunde(name);
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
	// ein medium anhand des Titels herausfinden
	public Object getMediumDa(String name) {
		Object dieses = null;
		for (Map.Entry m: medienDa.entrySet()){
			if (m.getValue().equals(name)) {
				dieses = m.getValue();
			}
			
		}
		return dieses;			
	}
	// ein medium anhand des Titels herausfinden
	public Object getMediumWeg(String name) {
		Object dieses = null;
		for (Map.Entry m: medienWeg.entrySet()){
			if (m.getValue().equals(name)) {
				dieses = m.getValue();
			}	
		}
		return dieses;			
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
