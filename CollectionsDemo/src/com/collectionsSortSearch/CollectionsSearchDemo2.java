package com.collectionsSortSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo2 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList<>();
		a.add(15);
		a.add(0);
		a.add(20);
		a.add(10);
		a.add(5);
		
		System.out.println("before sorting...."+a);
		
		//sorting is compulsory,coz if we donot do it, even though Z is present in the unsorted array,still it wont return the appropiate index
		Collections.sort(a,new CustomisedSortComparator());
		
		System.out.println("after sorting...."+a);
		
		System.out.println(Collections.binarySearch(a, 10, new CustomisedSortComparator()));
		System.out.println(Collections.binarySearch(a, 13 , new CustomisedSortComparator()));
		System.out.println(Collections.binarySearch(a, 17 )); //unexpected result

	}

}

class CustomisedSortComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return -i1.compareTo(i2);
	}
	
}
