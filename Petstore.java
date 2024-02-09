package com.hom.works;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Petstore {

	public static void main(String[] args) {
		//creating array list
		ArrayList<String> Petscolor = new ArrayList<String>();
		Petscolor.add("Black");
		Petscolor.add("red");
		Petscolor.add("green");
		Petscolor.add("Black");
		Petscolor.add("blue");
		
		Petscolor.add("white");
		
		System.out.println(Petscolor);
		System.out.println(Petscolor.get(1));
		System.out.println(Petscolor.remove(0));
		System.out.println(Petscolor);
		
		
		//creating Linked list
		LinkedList<Integer> Petsage = new LinkedList<Integer>();
		
		Petsage.add(12);
		Petsage.add(3);
		Petsage.add(4);
		Petsage.add(7);
		
		Petsage.add(6);
		System.out.println(Petsage);
		
		System.out.println(Petsage.getFirst());
		System.out.println(Petsage.removeFirst());
		System.out.println(Petsage);
		
		//creating hashset
		HashSet<String> Petstype = new HashSet<String>();
		Petstype.add("bulldog");
		Petstype.add("husky");
		Petstype.add("husky");
		Petstype.add("german shepered ");
		System.out.println(Petstype);
		System.out.println(Petstype.size());
		
		// creating tree set
		TreeSet<String> Petsname = new TreeSet<String> ();
		Petsname.add("Maggei");
		Petsname.add("Wisky");
		Petsname.add("Zumbo");
		Petsname.add("Maksy");
		Petsname.add("Bull");
		System.out.println(Petsname);
		System.out.println(Petsname.size());
		
	}
	

}
