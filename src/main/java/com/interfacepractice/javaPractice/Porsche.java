package com.interfacepractice.javaPractice;

public class Porsche implements  Car, Asset, Property, Loggable{

	public void drive() {
		System.out.println("poche going strong");
	}
	
	public String message() {
		return "joutuk paisi";
		
		
	}
	
	public String owner() {
		return "Sarwar Limited";
	}
	
	public int value() {
		return 800000;
	}

}
