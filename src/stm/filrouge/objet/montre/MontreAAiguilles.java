package stm.filrouge.objet.montre;

import java.util.List;

public class MontreAAiguilles extends Montre{

	private Aiguille aiguilleH = new Aiguille(Montre.HEURE_MAX);
	private Aiguille aiguilleM = new Aiguille(Montre.MIN_MAX);
	private Aiguille aiguilleS = new Aiguille(Montre.SEC_MAX);
	
	public MontreAAiguilles(int h, int m, int s) {
		setHMS(h, m, s);
	}

	@Override
	public void avance() {
		if( ! aiguilleS.avancer() ) {
			if( ! aiguilleM.avancer() ) {
				aiguilleH.avancer();
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", 
				aiguilleH.getValeur(), aiguilleM.getValeur(), aiguilleS.getValeur());
	}

	@Override
	public void setHMS(int h, int m, int s) {
		this.aiguilleH.setValeur(h);
		this.aiguilleM.setValeur(m);
		this.aiguilleS.setValeur(s);
	}
	
	
}
