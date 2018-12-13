package com.concurrentMaps;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapDemo {

	public static void main(String[] args) {
		
		
		ConcurrentHashMap m =new ConcurrentHashMap<>();
		m.put("101", "Mitul");
		m.putIfAbsent("101", "Rama");
		m.put("102", "Shyam");
		m.remove("102", "Shyam11");
		m.put("103", "Vigendra");
		m.replace("103", "Vigendra", "Raghuvendra");
		
		
		System.out.println(m);

	}

}
