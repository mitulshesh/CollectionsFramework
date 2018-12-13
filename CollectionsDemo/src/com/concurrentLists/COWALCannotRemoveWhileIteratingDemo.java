package com.concurrentLists;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWALCannotRemoveWhileIteratingDemo {

	public static void main(String[] args) {
		
		//ArrayList l =new ArrayList<>();
		CopyOnWriteArrayList l =new CopyOnWriteArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			if(s.equals("B")) {
				itr.remove();
			}
		}
		
		System.out.println(l);

	}

}
