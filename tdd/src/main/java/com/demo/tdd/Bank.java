package com.demo.tdd;

public class Bank {

	public Money reduce(Expression source,String to) {
		return source.reduce(to);
	}
}
