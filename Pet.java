package com.hom.works;

public class Pet {
//	create a pet with name, and type, color,age and overide the tostring method the output name: type: color: age and creata methode called 
	String name;
	String type;
	String color;
	int age;
	
	public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	@Override
		public String toString() {
			
		return "["+name+" "+type+" "+color+" "+age+"]";
		}
	
}
