package Pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import logica.AsigPorProf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AsigPorProfTestCase {

	private AsigPorProf as;

	@Before
	public void setUp() throws Exception {
		this.as = new AsigPorProf(5, "Introducción a la Programación", "Conferencia", "Fermin Rivas", 11);
	}

	@After
	public void tearDown() throws Exception {
		this.as = null;
	}
	
	@Test
	public void horasClaseValidas(){
		assertEquals(true, as.getHorasClase() > 0);
	}
	
	@Test
	public void asignaturaValida(){
		assertFalse(as.getAsignatura().isEmpty());
	}
}
