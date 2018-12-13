package com.collectionsSortSearch;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("k");
		l.add("p");
		l.add("x");
		l.add("a");
		//l.add(10); CCException
		//l.add(null); NPException
		
		System.out.println("before sorting........."+l);
		
		Collections.sort(l);
		
		System.out.println("After Sorting........"+l);
	}

}
