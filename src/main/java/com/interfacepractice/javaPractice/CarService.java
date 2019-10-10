package com.interfacepractice.javaPractice;

public class CarService {

	public void drive() {
		// TODO Auto-generated method stub		
		Car[] cars = {new BMW(), new Porsche(), new Marcedes(), };
		for(Car car: cars) {
			car.drive(); 			
		}
	}

	public void message() {
		// TODO Auto-generated method stub
		Loggable[] props = {new BMW(), new Porsche(), new Marcedes(), };
		for(Loggable prop: props) {
			prop.message(); 
	//		System.out.println(message());
		}

	}
}