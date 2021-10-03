import static org.junit.jupiter.api.Assertions.*;
import ar.edu.po2.tp3.Counter;
import junit.framework.Assert;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CounterTestCase {
	private Counter counter;
	
	
	
	@BeforeEach
	public void setUp() throws Exception{
	counter = new Counter(new int[]{1, 3, 5, 7, 9, 1, 1, 1, 1, 4});
	}
	
	@Test
	public void testEvenNumbers() {
		int amount = counter.cantidadPares();
		assertEquals (amount, 1);
	}
	
	@Test
	public void testUnevenNumbers() {
		int amount = counter.cantidadImpares();
		assertEquals (amount, 9);
	}
	
	@Test
	public void testMultiplesEven() {
		assertEquals (counter.cantidadMultiplos(4), 3);
		
	}
	@Test
	public void testMultiplesPrimeNumber() {
		assertEquals (counter.cantidadMultiplos(7), 2);
		
	}
	
	@Test
	public void testMultiplesUneven() {
		assertEquals (counter.cantidadMultiplos(21), 4);
		
	}
}
