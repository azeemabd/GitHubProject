package org.program;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]= {10,20,70,40,60,30,50};
		
		int largest,secondLargest;
		
		if (a[0]>a[1]) {
			
			largest=a[0];
			secondLargest=a[1];
		} else {
			
			largest=a[1];
			secondLargest=a[0];

		}
		
		for (int i = 2; i < a.length; i++) {
			
			if(a[i]>largest) {
				
				secondLargest=largest;
				largest=a[i];
				
			}
			else  if (a[i]>secondLargest && a[i]!=largest){
				secondLargest=a[i];
			}
		}
		System.out.println("Second Largest Value:"+secondLargest);
	}
}
// a[0]=10, a[1]=20
// 10>20 f → largest=20, secondLargest=10

// i=2   a[2]=40
// 40>20 t → secondLargest=20, largest=40

// i=3   a[3]=30
// 30>40 f → secondLargest=40

// i=4   a[4]=50
// 50>40 t → secondLargest=40, largest=50

// i=5   5<5 f ---- loop stop