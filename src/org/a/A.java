package org.a;


public class A { // sum of the values
	public static void main(String[] args) {
		int [] a = new int [] {1,2,3,4,5,6,7,8,9,10};
		int l = a.length;
		System.out.println(l);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
		}
		System.out.println("Sum of the values of an array :"+" "+sum);
		}
}
