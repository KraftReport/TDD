package com.demo.tdd;

public interface Expression {

	public Money reduce(Bank bank,String to); 
	public Expression sum(Expression addend);
	public Expression times(int mulipilier);
}
