import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Map m=new HashMap();
		m.put("mitul", "Sayan");
		System.out.println(m.get("mitul"));
		System.out.println(m.containsKey("mitul1")+ "............."+ m.size());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		HashMap mm=new HashMap<>();
		Map synchronisedMap = Collections.synchronizedMap(mm);
		
		
		String[] s= new String[10];
		for(int k=0;k<s.length;k++) {
			s[k] = k+"";
		}
		
		
		List<String> list=new ArrayList(Arrays.asList(s));
		List<String> unmodifiableList =Collections.unmodifiableList(list);
		//unmodifiableList.add("four");
		System.out.println(unmodifiableList);
		
		
		
		//hashcode
		Test t1=new Test();
		Test t2=(Test)t1.clone();
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		String s1=new String("predator");
		String s2=new String("predator");
		System.out.println("s1 hashcode:::"+s1.hashCode()+" s2 hashcode::::"+s2.hashCode());
		System.out.println(s1==s2);
				
		

	}

}
