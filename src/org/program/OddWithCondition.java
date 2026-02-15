package org.program;

public class OddWithCondition {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			
			if(i%2==1) {
				
				
				System.out.println(i);
			}
		}
		 // i=0   0<=10 t   0%2==1 f   ----      i=0+1=1
		 // i=1   1<=10 t   1%2==1 t   print 1   i=1+1=2
		 // i=2   2<=10 t   2%2==1 f   ----      i=2+1=3
		 // i=3   3<=10 t   3%2==1 t   print 3   i=3+1=4
		 // i=4   4<=10 t   4%2==1 f   ----      i=4+1=5
		 // i=5   5<=10 t   5%2==1 t   print 5   i=5+1=6
		 // i=6   6<=10 t   6%2==1 f   ----      i=6+1=7
		 // i=7   7<=10 t   7%2==1 t   print 7   i=7+1=8
		 // i=8   8<=10 t   8%2==1 f   ----      i=8+1=9
		 // i=9   9<=10 t   9%2==1 t   print 9   i=9+1=10
		 // i=10  10<=10 t  10%2==1 f  ----      i=10+1=11
		
	}
}
