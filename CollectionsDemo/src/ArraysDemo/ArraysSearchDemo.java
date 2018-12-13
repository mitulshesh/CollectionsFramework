package ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		
		int a[] = {5,15,10,99,12};
		
		Arrays.sort(a); //5,10,12,15,99
		System.out.println(Arrays.binarySearch(a, 15));
		System.out.println(Arrays.binarySearch(a, 14));
		
		String[] s = {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "K"));
		
		
		
		Arrays.sort(s,new C());
		System.out.println(Arrays.binarySearch(s, "Z",new C()));
		System.out.println(Arrays.binarySearch(s,"P",new C()));

	}

}

class C implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}
