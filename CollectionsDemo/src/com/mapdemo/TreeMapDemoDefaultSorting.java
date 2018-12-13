package com.mapdemo;

import java.util.TreeMap;

public class TreeMapDemoDefaultSorting {

	public static void main(String[] args) {
		
		TreeMap m=new TreeMap();
		m.put(1, "mitul");
		m.put(5, "ravan");
		m.put(3, "gupta ji ka beta");
		//m.put(null, "some value"); //NPE
		//m.put("A", "yash"); //CC exception
		
		System.out.println("printing tree map....."+m);

	}

}
