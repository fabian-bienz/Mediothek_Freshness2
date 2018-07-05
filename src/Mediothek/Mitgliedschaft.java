package Mediothek;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Mitgliedschaft {
	private Date endDatum;
	
	public Mitgliedschaft() {
		endDatum = new Date();
		endDatum = new Date(endDatum.getTime()+ TimeUnit.DAYS.toMillis(30));
	}
	
	
}
