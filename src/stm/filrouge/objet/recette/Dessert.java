package stm.filrouge.objet.recette;

public class Dessert extends Recette{

	
	
	public Dessert(String nom, int nbPersonnes) {
		super(nom, nbPersonnes);
		// TODO Auto-generated constructor stub
	}

	public Dessert() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Ceci est un dessert MAIS: ";
	}

	
}
