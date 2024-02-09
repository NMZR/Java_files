package com.Class.practice;

public class Laptop extends Class_practice {
	double screenSize;
	int RAM;
	int SSD;
	String processor;
	@Override
	public String toString() {
		return "["+id+" "+name+" "+Price+" "+screenSize+" "+RAM+" "+SSD+" "+processor+"]";
	}
	
	
	public boolean equals(Laptop obj) {
		
		return this.id == obj.id && this.name == obj.name;
	}
	
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getSSD() {
		return SSD;
	}
	public void setSSD(int sSD) {
		SSD = sSD;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	
	
	
	public void checkCharging() {
		
	}
	public void checkLogin() {
		
	}

}
