package Pruebas;

import junit.framework.TestCase;
import logica.Dpto;

import org.junit.Test;

public class DptoTestCase extends TestCase{
	private Dpto dpto;

	@Test
	public void testDptoNoNulo(){
		this.dpto = new Dpto("Ingenieria de Software", "Sonia Perez Lovelle", "Facultad de Informatica");
		assertNotNull(dpto);
	}
	
	@Test
	public void testDptoNulo(){
		this.dpto = new Dpto("Ingenieria de Software", "Sonia Perez Lovelle", "Facultad de Informatica");
		assertNull(dpto);
	}
	
	
	
}
