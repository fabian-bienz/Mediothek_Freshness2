package Mediothek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediothek {
	
	private List<Kunde> kunden;
	private Map<Integer, String> medien;
	
	public Mediothek() {
		kunden = new ArrayList<Kunde>();
		medien = new HashMap<Integer, String>();
	}
	
	public void addMedium(Medien medium) {
		medien.put(medium.getId(),medium.getTitel());
	}
	
	public void printMedien() {
		for(Map.Entry m:medien.entrySet()){
			System.out.print(m.getKey());
			System.out.print(": " + m.getValue() + "\n");
		}
	}
	
	public void registerKunde() {
		Kunde kunde = new Kunde("Severin", 1);
		kunden.add(kunde);
	}
	
	
	
}
