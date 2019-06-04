package stm.filrouge.test.horloge;

import static org.junit.Assert.*;

import org.junit.Test;

import stm.filrouge.objet.horloge.Horloge;
import stm.filrouge.objet.horloge.HorlogeZarbi;

public class HorlogeTest {

	@Test
	public void testVarStatique() {
		
		System.out.println( Short.MAX_VALUE );
	}
	
//	@Test
	public void test() {
		new HorlogeZarbi(100, 100, 100);
	}
	
//	@Test
//	public void avanceAPartir0h0m59sOK() {
//		
//		Horloge h = new Horloge(0, 0, 59);
//		h.avance();
//		assertEquals("00:01:00", h.toString());
//	}
//	
//	@Test(expected=Exception.class)
//	public void constructeurInvalideKO() {
//		
//		Horloge h = new Horloge(46, 1, 1);
//		
//		// Manouel
////		try {
////			Horloge h = new Horloge(46, 1, 1);
////			fail("Constuction pas OK");
////		} catch(Exception e) {
////			
////		}
//	}

}
