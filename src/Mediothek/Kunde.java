package Mediothek;
import java.util.*;
import Mediothek.Buch.BuchBuilder;

public class Kunde {
	
	public String name;
	public boolean istMitglied = false ;
	protected int id;
	public Mitgliedschaft mitgliedschaft = null;
	
	
	public Kunde(String name, int id) {
		this.name = name;
		this.id = id;
		
	}

	public Date erstelleMitgliedschaft(Kunde vonWem) {
		
		Mitgliedschaft mitgliedschaft = new Mitgliedschaft(vonWem);
		mitgliedschaft.renewMitgliedschaft();
		return mitgliedschaft.getEndDatum();
		// hier will ich die default NULL mitgliedscheft  nicht mehr null setztn..
		// geht das so??
		// this.mitgliedschaft = mitgliedschaft;
		// istMitglied = true;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isIstMitglied() {
		return istMitglied;
	}


	public void setIstMitglied(boolean istMitglied) {
		this.istMitglied = istMitglied;
	}


	public Mitgliedschaft getMitgliedschaft() {
		return mitgliedschaft;
	}


	public void setMitgliedschaft(Mitgliedschaft mitgliedschaft) {
		this.mitgliedschaft = mitgliedschaft;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public Kunde(KundeBuilder builder) {
		this.name = builder._name;
		this.id = builder._id;
	}
	public static KundeBuilder builder() {
		return new KundeBuilder();
	}
	
	public static class KundeBuilder {
		private String _name;
		private int _id;
		
		public Kunde build() {
			return new Kunde(this);
		}
		
		public KundeBuilder name(String name) {
			_name = name;
			return this;
		}

		
		public KundeBuilder id(int id) {
			_id = id;
			return this;
		}
	}
	
}
