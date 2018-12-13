package com.concurrentLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListUpdationWhileIteratingDemo extends Thread{

	static CopyOnWriteArrayList l=new CopyOnWriteArrayList<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CHild Thread adding one element");
		l.add("C");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		ListUpdationWhileIteratingDemo t=new ListUpdationWhileIteratingDemo();
		t.start();
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			String s1=(String)itr.next();
			System.out.println("Main Thread iterating:::"+itr.next());
			Thread.sleep(3000);
		}
		
		System.out.println(l);
	}

}
