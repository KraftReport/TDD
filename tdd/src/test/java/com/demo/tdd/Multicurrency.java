package com.demo.tdd;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
 

public class Multicurrency {
 
	
	@Test
	void TestDollarMultiplication() { 
		Money dollar = Money.dollar(5);
		assertEquals(Money.dollar(10),dollar.times(2));  
	}
	
	@Test
	void TestFrancMultiplication() {
		Money franc = Money.franc(5);
		assertEquals(Money.franc(10),franc.times(2));
	}
	
	@Test
	void TestDollarEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(2)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}
	
	@Test
	void TestFrancEquality() {
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(2)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	
}
