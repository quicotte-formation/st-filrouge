package stm.filrouge.test.montre;

import static org.junit.Assert.*;

import org.junit.Test;

import stm.filrouge.objet.montre.Montre;
import stm.filrouge.objet.montre.MontreAAiguilles;

public class MontreAAiguilleTest  {

	@Test
	public void avancerCasSpecifiqueOK() {
		
		Montre m1 = new MontreAAiguilles(0, 0, 59);
		Montre m2 = new MontreAAiguilles(0, 59, 59);
		Montre m3 = new MontreAAiguilles(23, 59, 59);

		m1.avance();
		m2.avance();
		m3.avance();
		
		assertEquals("00:01:00", m1.toString());
		assertEquals("01:00:00", m2.toString());
		assertEquals("00:00:00", m3.toString());
	}
	
	@Test
	public void avancerOK() {
		Montre m = new MontreAAiguilles(15, 4, 30);
		
		m.avance();
		
		assertEquals("15:04:31", m.toString());
	}

}
