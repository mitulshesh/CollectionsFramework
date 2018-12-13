package com.queuedemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		
		System.out.println("printing q.peek()..."+q.peek());   //null
		//System.out.println(q.element()); // RE NPE
		
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		System.out.println("Printing queue....."+q);
		
		System.out.println("Printing q.poll()....."+q.poll());
		
		System.out.println("printing queue after poll....."+q);
		
		//q.offer(0);
		
		//System.out.println("printing queue after adding 5 again....."+q);
		

	}

}
