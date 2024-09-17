package Pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import logica.Asignatura;
import logica.TipoEnsenanza;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AsignaturaTestCase {
	private Asignatura a;
	
	@Before
	public void setUp() throws Exception {
		ArrayList<TipoEnsenanza> ensenanzasDpoo = new ArrayList<TipoEnsenanza>();
		
		TipoEnsenanza tp1 = new TipoEnsenanza("Conferencia", 7);
		TipoEnsenanza tp2 = new TipoEnsenanza("Clase Pr�ctica", 12);
		TipoEnsenanza tp3 = new TipoEnsenanza("Laboratorio", 6);
		
		ensenanzasDpoo.add(tp1);
		ensenanzasDpoo.add(tp2);
		ensenanzasDpoo.add(tp3);
		
		this.a = new Asignatura("Dise�o y Programaci�n Orientada a Objetos", "Programaci�n", 'E', 1, "Inform�tica", 1, "Evaluaci�n Final", ensenanzasDpoo);
	}

	@After
	public void tearDown() throws Exception {
		this.a = null;
	}
	
	@Test
	public void AnioValido(){
		assertEquals(true, a.getAnio() > 0);
	}
	
	@Test
	public void disciplinaValida(){
		assertFalse(a.getDisciplina().isEmpty());
	}
}
