package org.program;

public class EvenAndAddCount {

	public static void main(String[] args) {
		
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i < 50; i++) {
			
			if (i%2==0) {
				
				evenCount = evenCount+1;
			}
			else {
				oddCount=oddCount+1;
			}
		}
		System.out.println("Even Count:"+evenCount);
		System.out.println("Odd Count:"+oddCount);
	}
	 // i=0   0<10 t   0%2==0 t   even=0+1=1   odd=0
	 // i=1   1<10 t   1%2==0 f   odd=0+1=1    even=1
	 // i=2   2<10 t   2%2==0 t   even=1+1=2   odd=1
	 // i=3   3<10 t   3%2==0 f   odd=1+1=2    even=2
	 // i=4   4<10 t   4%2==0 t   even=2+1=3   odd=2
	 // i=5   5<10 t   5%2==0 f   odd=2+1=3    even=3
	 // i=6   6<10 t   6%2==0 t   even=3+1=4   odd=3
	 // i=7   7<10 t   7%2==0 f   odd=3+1=4    even=4
	 // i=8   8<10 t   8%2==0 t   even=4+1=5   odd=4
	 // i=9   9<10 t   9%2==0 f   odd=4+1=5    even=5
	 // i=10  10<10 f  ----       loop stop
}
