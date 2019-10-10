package com.interfacepractice.javaPractice;

public class BMW implements Car, Asset, Property, Loggable{

	public void drive() {
		System.out.println("BMW going strong");
	}
	
	public String message() {
		return "amar gari";
	}
	
	public String owner() {
		return "Sarwar";
	}
	
	public int value() {
		return 800000;
	}
}
