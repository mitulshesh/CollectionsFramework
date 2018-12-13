package com.concurrentMaps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapUpdationWhileIteratingDemo extends Thread {

	static ConcurrentHashMap m= new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Adding to map via child thread");
		m.put(103, "Put via another thread");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		m.put(101,"A");
		m.put(102,"B");
		
		MapUpdationWhileIteratingDemo t=new MapUpdationWhileIteratingDemo();
		t.start();
		Set s=m.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Integer i= (Integer)itr.next();
			System.out.println("Printing key::"+i + " value:::" +m.get(i));
			Thread.sleep(2000);
			
		}
		
		System.out.println("Final Map:::" + m);
		

	}

}
