package com.demo.tdd.chapter.one.multicurrency;

public class Dollar {

	public Dollar(int amount) {
		this.amount = amount;
	} 
	
	public int amount;
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void times(int times) {
		this.amount = this.amount * times;
	}
}
