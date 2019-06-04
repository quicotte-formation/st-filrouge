package stm.filrouge.objet.recette;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Recette {

	public String nom;
	public Map<String, String> ingredients = new HashMap<>();
	public int nbPersonnes;
	
	public Recette() {
	}

	public Recette(String nom, int nbPersonnes) {
		this.nom = nom;
		this.nbPersonnes = nbPersonnes;
	}

	@Override
	public String toString() {
		
		return "Recette [nom=" + nom + ", ingredients=" + ingredients + ", nbPersonnes=" + nbPersonnes + "]";
	}



	public void afficher() {
		
		System.out.println( ingredients );
		
		System.out.println( 
				String.format(
						"Recette: %s , Ingredients: %s, pour %d personnes",
						nom, ingredients, nbPersonnes) );
	}
}
