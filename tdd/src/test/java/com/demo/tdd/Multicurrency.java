package com.demo.tdd;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
 

public class Multicurrency {

	Dollar five = new Dollar(5);
	
	@Test
	void TestMultiplication() { 
		assertEquals(new Dollar(10),five.times(2)); 
		assertEquals(new Dollar(15),five.times(3));
	}
	
	@Test
	void TestEquality() {
		assertTrue(five.equalsWith(5));
		assertTrue(!five.equalsWith(6));
	}
}
