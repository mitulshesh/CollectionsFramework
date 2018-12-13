package com.mapdemo;

import java.util.IdentityHashMap;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
		
		IdentityHashMap m=new IdentityHashMap();
		
		//identity hashmap uses == operator to compare keys instead of .equals method in normal hashmap
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		m.put(i1,"Ravi");
		m.put(i2, "Vaidya");
		System.out.println(i1==i2);
		System.out.println("printing map....." + m);

	}

}
