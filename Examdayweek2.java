package com.exam.week2;

public class Examdayweek2 {

	public static void main(String[] args) {
		//1.create a veriable animal count int and type cast it to double
		int animalcount = 20;
		double typecast1 = (animalcount);
		System.out.println(typecast1);
		// 2.write if condition to check if givin number is divisable by 9 and 27 and check if the number is even or not?
		int x = 81;
        if (x % 9 == 0 && x % 27 == 0) {
            System.out.println(x + " is divisible by both 9 and 27.");
            if (x % 2 == 0) {
                System.out.println(x + " is even.");
            } else {
                System.out.println(x + " is odd.");
            }
        } else {
            System.out.println(x + " is not divisible by both 9 and 27.");
        }
		//3. use switch statement print if course is Cs print CS, print if course is EEE print EEE,print if course is MECH print MECH
		String switchQ = "EEE";
		switch(switchQ) {
		case "EEE":
			System.out.println("EEE");
			break;
		case "CS":
			System.out.println("CS");
			break;
		case "MECH":
			System.out.println("MECH");
			break;
		default:
			System.out.println("there is nothing in the database");
		
		}
		
	}

	
}


	

//4.write what is the difference between double and int?
//intiger is used to store number, it can store 4 byte and double is 8 byte and it is used to stor fractional numberm, after the fractional  we are allowed to have 15 decimal point 
//5.how many dtatypes we have?
//we have 2 datatypes: permitive and non permitive data type: permitive datatype have 8 datatypes: 
//byte, int, short,long,float,double,boolean,char
//6.Difference between static and non static
//static members belong to the class itself and are shared among all instances, but non static members belong to individual instances and have instance specific data or behavior
//7.how many access modifiers we have, and what are those?
//we have 4 types of the access modifiers:
// public,private,default,protected

