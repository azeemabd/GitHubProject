package org.program;

public class SumWithArray {

	public static void main(String[] args) {
		
		int sum = 0;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
				
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
			
			
		}
		System.out.println("Sum:"+sum);
		}
	 // i=0   0<10 t   sum=0+a[0]=1    i=0+1=1
	 // i=1   1<10 t   sum=1+a[1]=3    i=1+1=2
	 // i=2   2<10 t   sum=3+a[2]=6    i=2+1=3
	 // i=3   3<10 t   sum=6+a[3]=10   i=3+1=4
	 // i=4   4<10 t   sum=10+a[4]=15  i=4+1=5
	 // i=5   5<10 t   sum=15+a[5]=21  i=5+1=6
	 // i=6   6<10 t   sum=21+a[6]=28  i=6+1=7
	 // i=7   7<10 t   sum=28+a[7]=36  i=7+1=8
	 // i=8   8<10 t   sum=36+a[8]=45  i=8+1=9
	 // i=9   9<10 t   sum=45+a[9]=55  i=9+1=10
	 // i=10  10<10 f  ---- loop stop
}
