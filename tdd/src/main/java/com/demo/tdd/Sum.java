package com.demo.tdd;

public class Sum implements Expression{

	private Money augend;
	private Money addend;
	
	public Sum(Money augend,Money addend) {
		this.addend = addend;
		this.augend = augend;
	}
	
	public void setAuged(Money augend) {
		this.augend = augend;
	}
	
	public Money getAugend() {
		return this.augend;
	}
	
	public void setAddend(Money addend) {
		this.addend = addend;
	}
	
	public Money getAddend() {
		return this.addend;
	}

	@Override
	public Money reduce(String to) { 
		return new Money(this.augend.getAmount()+this.addend.getAmount(),to);
	}
	
}
