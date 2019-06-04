package stm.filrouge.objet.montre;

import java.security.InvalidParameterException;

public class Aiguille {

	private int max;
	private int valeur;
	
	public Aiguille(int max) {
		super();
		this.max = max;
	}

	/**
	 * Avance d'une unité jusque max, et remet à zero au delà de max.
	 * @return true si incrémentation, false si reset.
	 */
	public boolean avancer() {
		
		if( valeur>=max ) {
			valeur = 0;
			return false;
		}
		
		valeur++;
		return true;
	}
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		if( max<0 || max<valeur )
				throw new InvalidParameterException("Max invalide");
		this.max = max;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		if( valeur<0 || valeur>max )
			throw new InvalidParameterException("Valeur invalide");
		this.valeur = valeur;
	}
	
	
}
