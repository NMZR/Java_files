package com.training.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array_List {

	public static void main(String[] args) {
		// create an array list
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<String> list2 = new LinkedList<String>();
		list.add(10);
		list.add(30);
		list.add(80);
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.remove(0));
		System.out.println(list);
		
		
		list2.addFirst("Hello");
		list2.addLast("Nadia");
		System.out.println(list2);
		System.out.println(list2.getFirst());
		System.out.println(list2.removeFirst());
		System.out.println(list2);
		

	}

}
