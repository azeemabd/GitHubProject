package org.program;


public class OddWithoutCondition {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i=i+2) {
			
			System.out.println(i);
			
		}
			
		}
	}

// i=1   1<10 t   print 1   i=1+2=3
// i=3   3<10 t   print 3   i=3+2=5
// i=5   5<10 t   print 5   i=5+2=7
// i=7   7<10 t   print 7   i=7+2=9
// i=9   9<10 t   print 9   i=9+2=11
// i=11 11<10 f    ----     loop stop