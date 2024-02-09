package com.training.java;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Nadia");
		set.add("Nadia");
		set.add("Cap");
		
		System.out.println(set);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(4);
		set2.add(7);
		set2.add(2);
		System.out.println(set2);
		System.out.println(set2.size());
		
		
		TreeSet<Integer> set3 = new TreeSet<Integer>();
		
		set3.add(2);
		set3.add(11);
		set3.add(4);
		set3.add(12);
		set3.add(7);
		set3.add(5);
		set3.add(2);
		System.out.println(set3);
		System.out.println(set3.size());

	}

}
