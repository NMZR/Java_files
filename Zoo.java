package com.exam.week2;

public class Zoo {

	public static void main(String[] args) {
		// // 9. create 4 object of pets and call all the methods in the zooclass.
		
	        // Create four Pet objects
	        Pet pet1 = new Pet("zombo", "Dog","xyz",2);
	        Pet pet2 = new Pet("makci", "Cat","yyu",7);
	        Pet pet3 = new Pet("tommy", "Rabbit","gyt",6);
	        Pet pet4 = new Pet("zoro", "Parrot","uyui",8);
	        
	        pet1.sleep();
	        pet2.sound();
	        //pet3.eat();// we cannnot access the private methode outside of the class
	        


	}

}
