package com.interfacepractice.javaPractice;

public class Marcedes implements  Car, Asset, Property, Loggable{

	public void drive() {
		System.out.println("Mar going strong");
	}
	
	public String message() {
		return "amar kinsi";
	}
	
	public String owner() {
		return "Sarwar bou";
	}
	
	public int value() {
		return 800000;
	}

}
