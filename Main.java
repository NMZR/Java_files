package com.Class.practice;

public class Main {


	public static void main(String[] args) {
		Laptop ca1 = new Laptop();
		ca1.name = "dell";
		ca1.id = 76727;
		ca1.Price = 356948.4;
		ca1.rating = 5.5;
		ca1.screenSize = 5.5;
		ca1.RAM = 6;
		ca1.SSD = 6;
		ca1.processor = "1etwyu";
		
		Laptop lap2 = new Laptop();
		lap2.name = "dell";
		lap2.id = 76727;
		lap2.Price = 356948.4;
		lap2.rating = 5.5;
		lap2.screenSize = 5.5;
		lap2.RAM = 6;
		lap2.SSD = 6;
		lap2.processor = "1etwyu";
		
		
		Table tab1 = new Table();
		tab1.Height = 45;
		tab1.Width = 65;
		tab1.Length = 32;
		
		Table tab2 = new Table();
		tab2.Height = 35;
		tab2.Width = 45;
		tab2.Length = 31;
		
		
		Light lit1 = new Light();
		lit1.walt = 45;
		lit1.lumns = 32;
		
		Light lit2 = new Light();
		lit2.walt = 45;
		lit2.lumns = 32;
		
		
		ca1.getName();
		ca1.getId();
		ca1.getPrice();
		ca1.getRAM();
		ca1.getSSD();
		ca1.getProcessor();
		ca1.getScreenSize();
		
		System.out.println("This is the laptop information: " + ca1);
		System.out.println("This is the table information: " + tab1);
		System.out.println(ca1.equals(lap2));
		
		//hw
		// create electronics
		// different type of electronic
		

	}

}
