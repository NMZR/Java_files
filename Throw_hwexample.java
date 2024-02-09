package com.hom.works;

import java.util.Scanner;

public class Throw_hwexample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter age");
		int a = scanner.nextInt();
		if(a >=18) {
			System.out.println("your are above 18");
		}else {
			throw new ArithmeticException("your are less then 18");
		}
	}

}
