package org.a;
import java.util.ArrayList;
import java.util.List;
public class F1 {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		a.add(10);
	
		int b =a.size();
		System.out.println(b);
		
		int c1 = a.indexOf(10);
		System.out.println(c1);
		
		int c2 = a.indexOf(10);
		System.out.println(c2);
		
		int c = a.lastIndexOf(10);
		System.out.println(c);
		
	}

}
