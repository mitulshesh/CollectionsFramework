package com.collectionsSortSearch;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList<>();
		a.add("Z");
		a.add("A");
		a.add("M");
		a.add("K");
		a.add("a");
		
		System.out.println("before sorting...."+a);
		
		//sorting is compulsory,coz if we donot do it, even though Z is present in the unsorted array,still it wont return the appropiate index
		Collections.sort(a);
		
		System.out.println("after sorting...."+a);
		
		System.out.println(Collections.binarySearch(a, "Z"));
		System.out.println(Collections.binarySearch(a, "J"));

	}

}
