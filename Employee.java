package com.training.java.day4;

public class Employee {
	public String name;
	public int age;
	public int Phonenum;
	private int slaray;
	private int bonus;
	protected int noofhours;
	
	
	public Employee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.slaray = salary;
    }
	public void employee1() {
		System.out.println(" this is non static method");
		
	}
	public void employee2() {
		System.out.println(" this is non static method");
	}
	private static void employee3(int Phonenum, int noofhours ) {
		System.out.println(" this is private static method");
	}
	public void employee3(int noofhours) {
		System.out.println(" this parameterized method");
	}
	public int employee4() {
		
		return this.bonus + this.slaray;
		
		
	}
	public String employee5() {
		return this.name;
	}
	
	
//	public static void main(String[] args) {
//		
//	}

}
