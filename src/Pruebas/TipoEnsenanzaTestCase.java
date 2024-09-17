package Pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import logica.TipoEnsenanza;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TipoEnsenanzaTestCase {
	private TipoEnsenanza t;
	
	@Before
	public void setUp() throws Exception {
		this.t = new TipoEnsenanza("Clase Práctica", 12);
	}

	@After
	public void tearDown() throws Exception {
		this.t = null;
	}
	
	@Test
	public void horasClaseValidas(){
		assertEquals(true, t.getHoras() > 0);
	}
	
	@Test
	public void nombreValid(){
		assertFalse(t.getNombre().isEmpty());
	}
}
