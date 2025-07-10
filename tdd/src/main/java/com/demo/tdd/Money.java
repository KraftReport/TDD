package com.demo.tdd;

public class Money {

	protected int amount;
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public boolean equals(Object obj) {
		var money = (Money)obj; 
		return this.amount == money.getAmount() &&
				this.getClass().equals(money.getClass());
	}
}
