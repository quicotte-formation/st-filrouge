package stm.filrouge.objet.horloge;

import java.security.InvalidParameterException;
import java.util.Calendar;

public class Horloge {

	private static final int HEURE_MAX = 23;
	private static final int MIN_MAX = 59;
	private static final int SEC_MAX = 59;
	
	protected int heure;
	private int min;
	private int sec;
	
	
	
	public Horloge(int heure, int min, int sec) {
		
		this.setHeure(heure);
		this.setMin(min);
		this.setSec(sec);
	}

	public Horloge() {
		Calendar cal = Calendar.getInstance();
		heure=cal.get(Calendar.HOUR_OF_DAY);
		min=cal.get(Calendar.MINUTE);
		sec=cal.get(Calendar.SECOND);
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", heure, min, sec);
	}

	/**
	 * Avance d'une seconde.
	 */
	public void avance() 
	{
		
		sec++;
		
		if( sec>Horloge.SEC_MAX ) {
			sec = 0;
			min++;
			
			if( min>Horloge.MIN_MAX ) {
				min=0;
				heure++;
				
				if(heure>Horloge.HEURE_MAX) {
					heure=0;
				}
			}
		}
	}
	
	public int getHeure() {
		return heure;
	}
	
	/**
	 * Valide et définit heure
	 * @param heure
	 * @throws RuntimeException
	 */
	public void setHeure(int heure)
	{
		if( heure<0 || heure>Horloge.HEURE_MAX ) {
			throw new RuntimeException("Heure invalide");
		}
		
		this.heure = heure;
	}
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		if( min<0 || min>Horloge.MIN_MAX )
			throw new InvalidParameterException("Min invalide");
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec)
	{
		if( sec<0 || sec>Horloge.SEC_MAX )
			throw new InvalidParameterException("Sec invalide");
		this.sec = sec;
	}
	
}
