package com.wilmington.subject.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		HashSet<Integer> s= new HashSet<Integer>();
		s.add(1);
		s.add(0);
		s.add(2);
		s.add(1);
		s.add(null);
		
		System.out.println(s.size());
		System.out.println(s.contains(null));
		System.out.println(s);
		
		LinkedHashSet<Float> lh = new LinkedHashSet<Float>();
		lh.add(10F);
		lh.add(2F);
		lh.add(null);
	
		System.out.println(lh.remove(2F));
		System.out.println(lh);
		
		

		TreeSet<Character> ts= new TreeSet<>();
		ts.add('A');
		ts.add('c');
		ts.add('b');
		ts.add('A');
	
		System.out.println(ts);
		System.out.println(ts.contains('c'));

}
}
	