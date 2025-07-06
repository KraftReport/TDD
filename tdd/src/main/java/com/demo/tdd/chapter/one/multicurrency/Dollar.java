package com.demo.tdd.chapter.one.multicurrency;

public class Dollar {

	public Dollar(double amount) {
		this.amount = Math.round(amount);
	} 
	
	private double amount;
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = Math.round(amount);
	}
	
	public void times(int times) {
		this.amount = Math.round(this.amount * times);
	}
}
