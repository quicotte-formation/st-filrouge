package stm.filrouge.test.utilisateur;

import static org.junit.Assert.*;

import org.junit.Test;

import stm.filrouge.objet.utilisateur.Utilisateur;
import stm.filrouge.objet.utilisateur.Utilisateur.TypeUtilisateur;

public class UtilisateurTest {

	@Test
	public void test() {

		// Utilisation
		Utilisateur u = new Utilisateur();
		u.setPseudo("kung fu panda");
		u.setTypeUtil( Utilisateur.TypeUtilisateur.ADMIN );
		
		// Lister les valeurs de l'énum
		for( Utilisateur.TypeUtilisateur typeUtil : Utilisateur.TypeUtilisateur.values() ) {
			System.out.println( typeUtil );
		}
		
		// Conversion string <-> enum
		String str = Utilisateur.TypeUtilisateur.MODERATEUR.toString();
		Utilisateur.TypeUtilisateur.valueOf( "ADMIN" );
	}

}
