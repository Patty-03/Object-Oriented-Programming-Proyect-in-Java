package Pruebas;

import logica.Docente;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DocenteTestCase{
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
	public void setIDNoNull(){
		assertNotNull(doc.getiD());
	}
	
	@Test
	public void salarioValido(){
		assertNotNull(doc.getSalario());
	}
}
