package com.Class.practice;

public class Light extends Class_practice{
	int walt;
	int lumns;
	
	
	@Override
	public String toString() {
		return "["+id+" "+name+" "+Price+" "+walt+" "+lumns+"]";
	}
	
	
	public boolean equals(Light obj) {
		
		return this.walt == obj.walt && this.lumns == obj.lumns;
	}
	
	public int getWalt() {
		return walt;
	}
	public void setWalt(int walt) {
		this.walt = walt;
	}
	public int getLumns() {
		return lumns;
	}
	public void setLumns(int lumns) {
		this.lumns = lumns;
	}
	
	
	public void no0fAmps() {
		
	}
	public void checkPowerUTil() {
		
	}

}
