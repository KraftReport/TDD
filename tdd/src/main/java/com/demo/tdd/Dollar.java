package com.demo.tdd;

public class Dollar {

	public Dollar(int amount) {
		this.amount =amount;
	} 
	
	private int amount;
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Dollar times(int times) { 
		return new Dollar(this.amount * times);
	}

	public boolean equalsWith(Object obj) {
		return this.amount == (int)obj;
	}
}
