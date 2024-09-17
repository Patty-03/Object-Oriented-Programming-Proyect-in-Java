package Pruebas;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import logica.AsigPorProf;
import logica.Planificacion;

public class PlanificacionTestCase {

    private Planificacion planif;

    @SuppressWarnings("deprecation")
	@Before
    public void setUp() throws Exception {
        this.planif = new Planificacion("2024-7-25", 2024, 1, new AsigPorProf(5, "Introducción a la Programación", "Conferencia", "Fermin Rivas", 11));
    }

    @After
    public void tearDown() throws Exception {
        this.planif = null;
    }

    @Test
    public void cursoNoNulo() {
        assertNotNull(planif.getCurso());
    }

    @Test
    public void cursoValorValido() {
        assertTrue(planif.getCurso() > 2010);
    }

    @Test
    public void cursoValorNoValido() {
        assertFalse(planif.getCurso() < 2010);
    }
}
