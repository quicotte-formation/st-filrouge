package stm.filrouge.objet.horloge;

public class HorlogeZarbi extends Horloge {

	public HorlogeZarbi(int heure, int min, int sec) {
		super(heure, min, sec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setHeure(int heure) {
		if (heure < 0 || heure > 23) {
			throw new RuntimeException("Heure invalide");
		}
		this.heure = heure;
	}

	@Override
	public void setMin(int min) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSec(int sec) {
		// TODO Auto-generated method stub

	}

}
