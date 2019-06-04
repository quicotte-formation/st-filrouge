package stm.filrouge.objet.montre;

public abstract class Montre {

	protected static final int HEURE_MAX = 23;
	protected static final int MIN_MAX = 59;
	protected static final int SEC_MAX = 59;
	
	abstract public void setHMS(int h, int m, int s);
	abstract public void avance();
}
