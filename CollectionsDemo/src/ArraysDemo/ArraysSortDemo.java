package ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		
		//primitive DNS
		int[] a= {4,1,3,9,10};
		System.out.println("Elements before sorting...");
		for(int x:a) {
			System.out.println(x);
		}
		Arrays.sort(a);
		System.out.println("Elements after sorting...");
		for(int x:a) {
			System.out.println(x);
		}
		
		
		//Object DNS
		String[] b= {"X","A","Z"};
		System.out.println("Elements before sorting...");
		for(String x:b) {
			System.out.println(x);
		}
		Arrays.sort(b);
		System.out.println("Elements after sorting...");
		for(String x:b) {
			System.out.println(x);
		}
		
		//Object Customized sorting
		String[] c= {"L","C","D"};
		System.out.println("Elements before sorting...");
		for(String x:c) {
			System.out.println(x);
		}
		Arrays.sort(c,new MyCompart());
		System.out.println("Elements after sorting...");
		for(String x:c) {
			System.out.println(x);
		}
		
		

	}

}

class MyCompart implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=arg0.toString();
		String s2=arg1.toString();
		return -s1.compareTo(s2);
	}
	
}
