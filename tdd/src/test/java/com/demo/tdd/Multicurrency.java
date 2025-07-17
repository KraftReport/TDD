package com.demo.tdd;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
 

public class Multicurrency {
 
	
	@Test
	void testDollarMultiplication() { 
		Money dollar = Money.dollar(5);
		assertEquals(Money.dollar(10),dollar.times(2));  
	}
	
	@Test
	void TestFrancMultiplication() {
		Money franc = Money.franc(5);
		assertEquals(Money.franc(10),franc.times(2));
	}
	
	@Test
	void testDollarEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(2)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}
	
	@Test
	void testFrancEquality() {
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(2)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	void testCurrency() {
		assertEquals(Money.franc(8).currency(),"CHF");
		assertEquals(Money.dollar(8).currency(), "USD");
	}
	 
	@Test
	void simpleAdditionTest() {
		var five = Money.dollar(5);
		var sum = five.sum(five);
		var bank = new Bank();
		var reduced = bank.reduce(sum,"USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
}
