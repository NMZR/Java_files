package com.java.week1;
import java.util.Scanner;
public class Scannerintro {

	public static void main(String[] args) {
		
		Scanner scannername = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = scannername.nextLine();
		
		Scanner id = new Scanner(System.in);
		System.out.println("Enter a ID:");
		String id1 = id.nextLine();
		
		
		Scanner mobile = new Scanner(System.in);
		System.out.println("Enter your Mobile number:");
		String mobile1 = mobile.nextLine();
		
		Scanner add = new Scanner(System.in);
		System.out.println("Enter your address:");
		String address = add.nextLine();
	
		
		
	
		System.out.println("Name: " + name.toUpperCase() );
		System.out.println("ID: " + id1.toUpperCase() );
		System.out.println("Mobile: " + mobile1);
		System.out.println("Address: " + address.toUpperCase() );
		
		

	}

}
//name id address