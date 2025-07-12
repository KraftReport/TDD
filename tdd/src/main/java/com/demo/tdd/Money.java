package com.demo.tdd;

public abstract class Money {

	protected int amount;
	
	public abstract Money times(int amount) ;
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Money franc(int amount) {
		return new Franc(amount);
	}
	
	public boolean equals(Object obj) {
		var money = (Money)obj; 
		return this.amount == money.getAmount() &&
				this.getClass().equals(money.getClass());
	}
}
