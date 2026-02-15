package org.program;

public class Factorial {
	public static void main(String[] args) {
		
	
	
	int n = 5;
	
	int fact = 1;
	
	for(int i =1; i<=n;i++) {
		fact=fact*i;
	}
    System.out.println("Factorial:"+fact);
}
	 // i=1   1<=5   fact=1*1=1     i=1+1=2
	 // i=2   2<=5   fact=1*2=2     i=2+1=3
	 // i=3   3<=5   fact=2*3=6     i=3+1=4
	 // i=4   4<=5   fact=6*4=24    i=4+1=5
	 // i=5   5<=5   fact=24*5=120  i=5+1=6
	 // i=6   6<=5      ----        loop stop
}
