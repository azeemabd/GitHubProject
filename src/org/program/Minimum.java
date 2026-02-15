package org.program;

public class Minimum {

public static void main(String[] args) {
	
	int a[]= {5,4,3,7,2,1};
	
	int min = a[1];
	
	for (int i = 1; i < a.length; i++) {
		
		if (a[i]<min) {
			min=a[i];
			
		}
		
	}
	System.out.println("Minimum :"+min);
}
}
