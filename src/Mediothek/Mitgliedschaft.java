package Mediothek;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Mitgliedschaft {
	private Date endDatum;
	public Kunde vonWem;
	
	

	public Mitgliedschaft(Kunde vonWem) {
		endDatum = new Date();
		endDatum = new Date(endDatum.getTime()+ TimeUnit.DAYS.toMillis(30));
		this.vonWem = vonWem;
		
	}
	
	public Kunde getVonWem() {
		return vonWem;
	}

	public void setVonWem(Kunde vonWem) {
		this.vonWem = vonWem;
	}

	public void renewMitgliedschaft() {
		endDatum = new Date(endDatum.getTime()+ TimeUnit.DAYS.toMillis(30));
	}
	
	public void setEndDatum(Date endDatum) {
		this.endDatum = endDatum;
	}
	
	public Date getEndDatum() {
		return endDatum;
	}
}
