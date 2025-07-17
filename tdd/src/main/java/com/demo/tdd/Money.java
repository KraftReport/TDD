package com.demo.tdd;

public class Money implements Expression{

	protected String currency;
	protected int amount;
	
	public String currency() {
		return this.currency;
	}
	
	public Money times(int multiplier) {
		return new Money(this.amount * multiplier, currency);
	}
	
	public Money(int amount,String currency) {
		 this.amount = amount;
		 this.currency = currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public static Money dollar(int amount) {
		return new Money(amount,"USD");
	}
	
	public static Money franc(int amount) {
		return new Money(amount,"CHF");
	}
	
	public boolean equals(Object obj) {
		var money = (Money)obj; 
		return this.amount == money.getAmount() &&
				this.currency().equals(money.currency());
	}
	
	public Expression sum(Money added) {
		return new Money(this.amount+added.amount,currency);
	}
}
