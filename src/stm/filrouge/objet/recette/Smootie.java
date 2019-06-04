package stm.filrouge.objet.recette;

public class Smootie extends Boisson {

	public int proportionGlace;

	@Override
	public String toString() {
		return "Smootie [proportionGlace=" + proportionGlace + super.toString() +  "]";
	}

	public Smootie(String nom, int nbPersonnes, int proportionGlace) {
		super(nom, nbPersonnes);
		this.proportionGlace = proportionGlace;
		// TODO Auto-generated constructor stub
	}
	
	
}
