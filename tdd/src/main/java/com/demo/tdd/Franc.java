package com.demo.tdd;

public class Franc extends Money{
 
	public Franc(int amount) {
		this.amount = amount;
	}
	  
	@Override
	public Money times(int times) {
		return new Franc(this.amount * times);
	} 
	
}
