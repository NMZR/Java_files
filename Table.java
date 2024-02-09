package com.Class.practice;

public class Table extends Class_practice{
	double Height;
	double Width;
	double Length;
	@Override
	public String toString() {
		return "["+id+" "+name+" "+Price+" "+Height+" "+Width+" "+Length+"]";
		
	}
	
	public boolean equals(Table obj) {
		
		return this.Height == obj.Height && this.Width == obj.Width;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		Width = width;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	
	public void area() {
		
	}
	public void volum() {
		
	}
	
	

}
