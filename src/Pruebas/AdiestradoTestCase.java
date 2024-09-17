package Pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import logica.Adiestrado;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdiestradoTestCase {
	private Adiestrado ad;
	
	@Before
	public void setUp() throws Exception {
		this.ad = new Adiestrado("00122158945", "Daniel Pardo", "Disponible", 3000, 1,"Adiestrado", "Ninguno", true);
	}

	@After
	public void tearDown() throws Exception {
		this.ad = null;
	}
	
	@Test
	public void NombreNoNull(){
		assertNotNull(ad.getNombre());
	}
	
	@Test
	public void disponibilidadValido(){
		assertNotNull(ad.getDisponibilidad());
	}
	
	
}
