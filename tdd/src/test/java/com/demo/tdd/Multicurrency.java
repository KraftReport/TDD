package com.demo.tdd;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
 

public class Multicurrency {

	Dollar five = new Dollar(5);
	Franc six = new Franc(6);
	
	@Test
	void TestMultiplication() { 
		assertEquals(new Dollar(10),five.times(2)); 
		assertEquals(new Dollar(15),five.times(3));
		assertEquals(new Franc(12),six.times(2));
		assertEquals(new Franc(18),six.times(3));
	}
	
	@Test
	void TestEquality() {
		assertTrue(five.equals(new Dollar(5)));
		assertTrue(!five.equals(new Dollar(6)));
		assertTrue(six.equals(new Franc(6)));
		assertTrue(!six.equals(new Franc(5)));
	}
	
	
}
