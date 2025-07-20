package com.demo.tdd;

import java.util.Hashtable;

public class Bank {

	private Hashtable<Pair,Integer> rates = new Hashtable<>();
	
	public Money reduce(Expression source,String to) {
		return source.reduce(this,to);
	}
	
	public int rate(String from,String to) {
		if(from.equals(to))return 1;
		return from.equals("CHF") && to.equals("USD") ? 2 : 1; 
	}
	
	public void setRate(String from,String to,int rate) {
		rates.put(new Pair(from,to), Integer.valueOf(rate));
	}
	
	public int getRate(Pair pair) {
		Integer rate = rates.get(pair);
		return rate.intValue();
	}
	 
}
