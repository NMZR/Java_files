package com.Class.practice;


public class Execution {

	public static void main(String[] args) {
		Car ca1 = new Car();
		ca1.name = "car";
		ca1.id = 76727;
		ca1.mod = "sudan";
		
		
		Vehcile va1 = new Vehcile();
		va1.name = "vehcile";
		va1.id = 76727;
		va1.mod = "sudan";
		
		Truck truk = new Truck();
		
		truk.name = "truck";
		truk.id = 76727;
		truk.mod = "sudan";
		
		
		ca1.start_engine();
		va1.start_engine();
		truk.start_engine();
	}
	
}
