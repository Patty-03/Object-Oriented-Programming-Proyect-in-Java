package Pruebas;

import junit.framework.TestCase;
import logica.Dpto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DptoTestCase extends TestCase{
	private Dpto dpto;

	@Before
	public void setUp() throws Exception {
		this.dpto = new Dpto("Ingenieria de Software", "Sonia Perez Lovelle", "Informatica");
	}

	@After
	public void tearDown() throws Exception {
		this.dpto = null;
	}

	@Test
	public void testFacultadNoNulo(){
		assertNotNull(dpto.getFacultad());
	}
	
	@Test
	public void testNombreJefeDptoNoVacio(){
		assertEquals(false, dpto.getNombreJefeDpto().isEmpty());
	}
}
