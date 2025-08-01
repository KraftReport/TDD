package com.demo.tdd;

public class Money implements Expression{

	protected String currency;
	protected int amount;
	
	public String currency() {
		return this.currency;
	}
	
	@Override
	public Expression times(int multiplier) {
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
	
	@Override
	public Expression sum(Expression added) {
		return new Sum(this,added);
	}

	@Override
	public Money reduce(Bank bank,String to) {
		int rate = bank.rate(currency,to);
		return new Money(amount/rate,to);
	}
}
