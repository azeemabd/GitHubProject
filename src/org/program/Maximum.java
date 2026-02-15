package org.program;

public class Maximum {

	public static void main(String[] args) {
		
		int a[]= {5,4,3,7,2,1};
		
		int max = a[1];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>max) {
				max=a[i];
				
			}
			
		}
		System.out.println("Maximum :"+max);
	}
}
