package com.exam.week2;

public class Movie {
// /// 10. create a Movie class with name, duration, no0fCast, make them private, create a getter and setter
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getNo0fCast() {
		return no0fCast;
	}
	public void setNo0fCast(int no0fCast) {
		this.no0fCast = no0fCast;
	}
	private int duration;
	private int no0fCast;
	
}
