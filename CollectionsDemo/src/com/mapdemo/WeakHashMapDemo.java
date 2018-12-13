package com.mapdemo;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//HashMap m=new HashMap();
		WeakHashMap m=new WeakHashMap();
		temp t=new temp();
		m.put(t, "mitul");
		System.out.println("Printing map before GC..."+m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("Printing map after gc....."+m);
	}

}

class temp{
	public String toString() {
		return "temp";
	}
	
	public void finalize() {
		System.out.println("finalize called");
	}
}
