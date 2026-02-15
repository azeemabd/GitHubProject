package org.program;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 1; i <=10; i++) {
			
			int c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
					
		}
	}
}
// a=0 
// b=1
// i=1   1<=10 t   c=0+1=1   print 1   a=1  b=1
// i=2   2<=10 t   c=1+1=2   print 2   a=1  b=2
// i=3   3<=10 t   c=1+2=3   print 3   a=2  b=3
// i=4   4<=10 t   c=2+3=5   print 5   a=3  b=5
// i=5   5<=10 t   c=3+5=8   print 8   a=5  b=8
// i=6   6<=10 t   c=5+8=13  print 13  a=8  b=13
// i=7   7<=10 t   c=8+13=21 print 21  a=13 b=21
// i=8   8<=10 t   c=13+21=34 print 34 a=21 b=34
// i=9   9<=10 t   c=21+34=55 print 55 a=34 b=55
// i=10  10<=10 t  c=34+55=89 print 89 a=55 b=89
// i=11  11<=10 f  ---- loop stop