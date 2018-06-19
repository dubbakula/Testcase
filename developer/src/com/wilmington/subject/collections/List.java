package com.wilmington.subject.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
public static void main(String[] args) {
		
		ArrayList<String> l= new ArrayList<String>();
		l.add("apple");
		l.add("strawberry");
		l.add("grapes");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(3));
		
		LinkedList<String>  ls= new LinkedList<String>();
		ls.add("mom");
		ls.add("dad");
		ls.add("bro");
		System.out.println(l);
		System.out.println(ls.size());
		System.out.println(ls.get(0));
		System.out.println(ls.remove(2));
		
		
		
	}

}
