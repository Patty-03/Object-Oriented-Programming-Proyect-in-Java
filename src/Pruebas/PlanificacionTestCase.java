package Pruebas;

import java.util.Date;

import junit.framework.TestCase;
import logica.AsigPorProf;
import logica.Planificacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlanificacionTestCase extends TestCase{

	private Planificacion planif;

	@Before
	public void setUp() throws Exception {
		this.planif = new Planificacion(new Date(2024, 7, 25), 2024, 1, new AsigPorProf(5, "Introducción a la Programación", "Conferencia", "Fermin Rivas", 11));
	}

	@After
	public void tearDown() throws Exception {
		this.planif = null;
	}

	@Test
	public void cursoNoNulo(){
		assertNotNull(planif.getCurso());
	}

	@Test
	public void cursoValorValido(){
		assertEquals(true, planif.getCurso() > 2010);
	}
}
