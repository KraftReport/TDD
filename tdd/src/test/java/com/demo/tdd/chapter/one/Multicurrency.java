package com.demo.tdd.chapter.one;
 
import static org.junit.Assert.assertEquals; 

import org.junit.jupiter.api.Test;

import com.demo.tdd.chapter.one.multicurrency.Dollar;

public class Multicurrency {

	@Test
	void TestMultiplication() {
		Dollar dollar = new Dollar(2.5);
		dollar.times(2);
		assertEquals(6.0,dollar.getAmount(),0.0001);
	}
}
