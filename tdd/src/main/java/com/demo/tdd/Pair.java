package com.demo.tdd;

public class Pair {

	private String from;
	private String to;
	
	public Pair(String from,String to) {
		this.from = from;
		this.to = to;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getFrom() {
		return this.from;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getTo() {
		return this.to;
	}
	
	public boolean equals(Object object) {
		var pair = (Pair)object;
		return pair.from.equals(this.from) && pair.to.equals(this.to);
	}
	
	public int hashCode() {
		return 0;
	}
}
