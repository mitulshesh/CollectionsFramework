package com.queuedemo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue(15,new MyComparator());
		q.offer("D");
		q.offer("A");
		q.offer("K");
		q.offer("Z");
		q.offer("P");
		
		System.out.println(q);
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		String s1= arg0.toString();
		String s2=arg1.toString();
		return -s2.compareTo(s1);
	}
	
}
