package com.collectionsSortSearch;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {
	
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Z");
		a.add("A");
		a.add("M");
		a.add("K");
		a.add("a");
		
		System.out.println("before reversing..."+a);
		
		Collections.reverse(a);
		
		System.out.println("after reversing..."+a);
	}

}
