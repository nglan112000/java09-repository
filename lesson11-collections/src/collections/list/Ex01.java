package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		//prior version 1.4
		//raw type each element is an object default =  Object[] a = new Object[0];
		List a = new ArrayList();
		List b = new LinkedList();
		
		//boxing, unboxing 1.5
		a.add(1);
		a.add("welcome");
		a.add(2f);
		
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		for(Object item:a) {
			System.out.println(Integer.parseUnsignedInt(item.toString()));
		}
		
		
	}

}
