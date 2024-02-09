package com.training.java;

public class Day3Hw {
    // Attributes
    private int number;
    private String message;

    // Default Constructor
    public Day3Hw() {
        this.number = 0;
        this.message = "Default Message";
    }

    // Parameterized Constructor
    public Day3Hw(int number, String message) {
        this.number = number;
        this.message = message;
    }

    // Method
    public void display() {
        System.out.println("Number: " + number + ", Message: " + message);
    }

    // Static Method
    public static void staticDisplay() {
        System.out.println("this is static.");
    }

    // Main method to test our class
    public static void main(String[] args) {
        // Creating an object
    	Day3Hw obj = new Day3Hw(42, "hi I am roya");

        // Calling a method
        obj.display();

        // Calling a static method
        Day3Hw.staticDisplay();
    }
}

