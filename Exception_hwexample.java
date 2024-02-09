package com.hom.works;

public class Exception_hwexample {

	public static void main(String[] args) {
		///ArrayIndexOutOfBoundsException Example
		 int[] numbers = {1, 2, 3};
		 try {
		    System.out.println(numbers[3]); // Accessing index 3, which is out of bounds
		      } catch (ArrayIndexOutOfBoundsException e) {
		          System.out.println("Array index is out of bounds: " + e.getMessage());
		        }
		    }
		

	

}
