package com.mapdemo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		 Hashtable ht=new Hashtable<>();
		 ht.put(new GenHashcode(5), "xxxx00");
		 ht.put(new GenHashcode(95), "xxxx00");
		 ht.put(new GenHashcode(108), "xxxx00");
		 ht.put(new GenHashcode(4), "xxxx00");
		 ht.put(new GenHashcode(1), "xxxx00");

		 System.out.println(ht);

	}

}

class GenHashcode{
	
	int i;
	
	GenHashcode(int i){
		this.i=i;
	}
	
	public int hashcode() {
		return i;
	}
	
	public String toString() {
		return i+"";
	}
}
