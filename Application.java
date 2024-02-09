package com.Class.practice;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name1 = name.nextLine();
		
		Scanner id = new Scanner(System.in);
		System.out.println("Enter ID:");
		String id1 = id.nextLine();
		
		
		Scanner Price = new Scanner(System.in);
		System.out.println("Enter Price:");
		String Price1 = Price.nextLine();
		
		Scanner RAM = new Scanner(System.in);
		System.out.println("Enter RAM:");
		String RAM1 = RAM.nextLine();
		
		Scanner screenSize = new Scanner(System.in);
		System.out.println("Enter Screen Size:");
		String screenSize1 = screenSize.nextLine();
		
		Scanner SSD = new Scanner(System.in);
		System.out.println("Enter SSD:");
		String SSD1 = SSD.nextLine();
		
		
		Scanner processor = new Scanner(System.in);
		System.out.println("enter the processor:");
		String p1 = processor.nextLine();
		
		System.out.println("Name: " + name1.toUpperCase() );
		System.out.println("ID: " + id1.toUpperCase() );
		System.out.println("Price: " + Price1);
		System.out.println("RAM: " + RAM1.toUpperCase() );
		System.out.println("SSD : "+ SSD1);
		System.out.println("Screen Size: " + screenSize1);
		System.out.println("Processor: " + p1);
	}

}
