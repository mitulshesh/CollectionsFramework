package com.mapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemoCustomisedSorting {

	public static void main(String[] args) {
		
		TreeMap m=new TreeMap(new MyComparator());
		m.put("m", 100);
		m.put("a", 899);
		m.put("k", 1000);
		
		System.out.println("printng tree map....."+m);

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1= arg0.toString();
		String s2=arg1.toString();
		return s2.compareTo(s1);
	}
	
}
