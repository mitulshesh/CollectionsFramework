package com.collectionsSortSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("k");
		l.add("p");
		l.add("x");
		l.add("a");
		//l.add(10); CCException
		//l.add(null); NPException
		
		System.out.println("before sorting........."+l);
		
		Collections.sort(l,new MyComparator());
		
		System.out.println("After Sorting........"+l);
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1= String.valueOf(o1);
		String s2=String.valueOf(o2);
		return -s1.compareTo(s2);
	}
	
}
