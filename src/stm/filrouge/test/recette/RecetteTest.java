package stm.filrouge.test.recette;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import stm.filrouge.objet.recette.Dessert;
import stm.filrouge.objet.recette.Plat;
import stm.filrouge.objet.recette.Recette;
import stm.filrouge.objet.recette.Smootie;

public class RecetteTest {

	@Test
	public void listeBoissonsOK() {
		
		Dessert d = new Dessert("foret noire", 6);
		Plat p = new Plat("plat1", 3);
		Smootie s = new Smootie("fraise pastèque", 1, 50);
		
		List<Recette> recettes = new ArrayList<>();
		recettes.add( p );	
		recettes.add( s );
		recettes.add( d );
		
		for( Recette rec : recettes ) {
			System.out.println( rec );
		}
	}
	
//	@Test
	public void queFaitPrintLnDeObjectOK() {
		Recette r = new Recette();
		r.nom="Mystère au chocolat";
		System.out.println( r );
	}
	
//	@Test
	public void test() {
		Recette monDessert = new Dessert();
		
		monDessert.nom = "Dinde aux marrons glacée";
		monDessert.nbPersonnes = 1;
		monDessert.ingredients.put("dinde", "une petite dinde");
		monDessert.ingredients.put("des marrons", "un bon kilo");
		monDessert.ingredients.put("sel", "une pincée généreuse");
		
		System.out.println( monDessert.toString() );
		
		monDessert.afficher();
	}

}
