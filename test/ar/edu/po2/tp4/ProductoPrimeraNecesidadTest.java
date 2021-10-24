package ar.edu.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private Producto leche;
	
	@BeforeEach
	public void setUp() {
		leche = new Producto("Leche", 8d, true, 0.1);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
}
