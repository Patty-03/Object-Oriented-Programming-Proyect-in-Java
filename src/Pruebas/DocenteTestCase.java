package Pruebas;

import junit.framework.TestCase;
import logica.Docente;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DocenteTestCase extends TestCase{
	private Docente doc;
	
	@Before
	public void setUp() throws Exception {
		this.doc = new Docente("63041918976", "Sonia Perez", "Disponible", 5000, 30, "Profesor Titular", "Doctor en Ciencias");
	}

	@After
	public void tearDown() throws Exception {
		this.doc = null;
	}
	
	@Test
	public void catDocNoNull(){
		assertNotNull(doc.getCatDoc());
	}
	
	@Test
	public void catDocNoVacio(){
		assertEquals(false, doc.getCatDoc().isEmpty());
	}
}
