package com.training.java;
import java.util.Scanner;


public class Exception_intro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value");
		int a = scanner.nextInt();
		
		System.out.println("enter value");
		int b = scanner.nextInt();
		
		int c = a + b;
		int d = a - b;
		
		
		
		try {
			int e = a/b;
			System.out.println("a/b: " + e);
		} catch (Exception e2) {
			System.out.println("you can not divid these two number");
		}
		
		int f = a*b;
		
		System.out.println("a + b: " + c);
		System.out.println("a - b: " + d);
	
		System.out.println("a*b: " + f);
		

	}

}
// exception is abnormal termination of a program
/// exceptions are cauesd by programmer mistake
// its programmer duty to handel those exception
///exception handeling inorder to stop the abnormal termination of a program we use exception handeling 
// the process that we convert the system error messages into user frednly eroor that will not interupt the program 
//types of exception: 2 types of exception
//1.checked exception: cused by compiler
//2. unchecked which is not caused by the compilers

// what is exception hirarcy:
//1. IO exception 
//2. SQL exception 
//3. class not found exception
//4.array index out of bound exception 


//errors:
//1. out of memory error 
//2. stackverflow error 
//3. vitrtual machine error
