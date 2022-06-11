package org.a;

public class B { // to find the average of given values
	public static void main(String[] args) {
		int [] a = new int [] {1,2,3,4,5,6,7,8,9,10};
		int b = a.length;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
			}
		float average = sum/b;
		System.out.println("Average value of array:"+average);
	}

}
