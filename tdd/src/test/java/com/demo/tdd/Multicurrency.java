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
		Money five = Money.dollar(5);
		Sum sum =(Sum) five.sum(five);
		Bank bank = new Bank();
		var reduced = bank.reduce(sum,"USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
	@Test
	void testPlusMethod() {
		Money four = Money.dollar(4);
		Money three = Money.dollar(3);
		Expression sum = four.sum(three);
		Sum result = (Sum)sum;
		assertEquals(result.getAugend(), four);
		assertEquals(result.getAddend(), three);
	}
	
	@Test
	void testReduceMoney() {
		Money one = Money.dollar(1);
		Bank bank = new Bank();
		Money result = bank.reduce(one, "USD");
		assertEquals(Money.dollar(1),result);
	}
	
	@Test
	void testRate() {
		Bank bank = new Bank();
		bank.setRate("CHF","USD",2);
		Money result = bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1),result);
	}
	
	@Test
	void testPair() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}
	
	@Test
	void testMixCurrencies() {
		Expression fiveBucks = Money.dollar(5);
		Expression tenFrancs = Money.franc(10);
		Bank bank = new Bank();
		bank.setRate("CHF", "USD", 2);
		Money result = bank.reduce(fiveBucks.sum(tenFrancs),"USD");
		assertEquals(Money.dollar(10), result);
	}
	
	@Test
	void testSumPlusMoney() {
		Expression fiveBucks = Money.dollar(5);
		Expression tenFrancs = Money.franc(10);
		Bank bank = new Bank();
		bank.setRate("CHF", "USD", 2);
		Expression sum = new Sum(fiveBucks,tenFrancs).sum(fiveBucks);
		Money result = bank.reduce(sum, "USD"); 
		assertEquals(result, Money.dollar(15));
	}
	
	@Test
	void testTimesMoney() {
		Expression fiveBucks = Money.dollar(5);
		Expression fiveFrancs = Money.franc(5);
		Bank bank = new Bank();
		bank.setRate("CHF", "USD", 2);
		Expression sum = new Sum(fiveBucks,fiveFrancs).times(2);
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(15), result);
	}
	
	@Test
	void testPlusSameCurrencyReturnsMoney() {
		Expression result = Money.dollar(1).sum(Money.dollar(1));
		assertTrue(result instanceof Sum);
	}
	
	
}
