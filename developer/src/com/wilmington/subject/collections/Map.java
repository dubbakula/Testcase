package com.wilmington.subject.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
		hmap.put("bhanu", 1);
		hmap.put("anu", 2);
		hmap.put("prava", 3);
		System.out.println(10);
		System.out.println(hmap.containsKey("bhanu"));
		System.out.println(hmap.size());
		
		TreeMap<Integer, String> Tmap = new TreeMap<Integer, String>();
		Tmap.put(4, "sandy");
		Tmap.put(5, "moni");
		Tmap.put(6, "mahesh");
		System.out.println("Tmap");
		System.out.println(Tmap.size());
		System.out.println(Tmap.get(2));

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "rose");
		ht.put(2, "lilly");
		ht.put(3, "jasmine");
		System.out.println(ht);
		System.out.println(Tmap);
		}
	

}
