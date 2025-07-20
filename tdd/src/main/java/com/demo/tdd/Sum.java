package com.demo.tdd;

public class Sum implements Expression{

	private Expression augend;
	private Expression addend;
	
	public Sum(Expression augend,Expression addend) {
		this.addend = addend;
		this.augend = augend;
	}
	
	public void setAuged(Expression augend) {
		this.augend = augend;
	}
	
	public Expression getAugend() {
		return this.augend;
	}
	
	public void setAddend(Expression addend) {
		this.addend = addend;
	}
	
	public Expression getAddend() {
		return this.addend;
	}

	@Override
	public Money reduce(Bank bank,String to) {   
		return new Money(bank.reduce(this.augend,to).getAmount()+bank.reduce(this.addend, to).getAmount(),to);
	}
 
	@Override
	public Expression sum(Expression addend) { 
		return new Sum(this,addend);
	}

	@Override
	public Expression times(int mulipilier) { 
		return new Sum(this.augend.times(mulipilier),this.addend.times(mulipilier));
	}
	
}
