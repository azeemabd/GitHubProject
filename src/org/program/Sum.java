package org.program;

public class Sum {

	int mainValue = 200;

	int featureValue = 500;

	int arun = 100;

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			
			sum=sum+i;
		}
		
		System.out.println("Sum:"+sum);
	}
}
// i=0   0<=10 t   sum=0+0=0    i=0+1=1
// i=1   1<=10 t   sum=0+1=1    i=1+1=2
// i=2   2<=10 t   sum=1+2=3    i=2+1=3
// i=3   3<=10 t   sum=3+3=6    i=3+1=4
// i=4   4<=10 t   sum=6+4=10   i=4+1=5
// i=5   5<=10 t   sum=10+5=15  i=5+1=6
// i=6   6<=10 t   sum=15+6=21  i=6+1=7
// i=7   7<=10 t   sum=21+7=28  i=7+1=8
// i=8   8<=10 t   sum=28+8=36  i=8+1=9
// i=9   9<=10 t   sum=36+9=45  i=9+1=10
// i=10  10<=10 t  sum=45+10=55 i=10+1=11
// i=11  11<=10 f  ---- loop stop
