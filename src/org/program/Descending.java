package org.program;

public class Descending {

public static void main(String[] args) {
		
		int a[]= {10,30,20,50,40};
		
		System.out.println("Before Sorting Array :");
		
		for (int i : a) {
			
			System.out.println(i);
			
		}
		for (int i = 0; i<a.length;i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]<a[j]) {
					
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("After Sorting Array :");
		
		for (int i : a) {
			
			System.out.println(i);
		}
	}
}
