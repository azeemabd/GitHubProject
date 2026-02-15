package org.program;

public class Amstrong {

	public static void main(String[] args) {
		
		int num=153;
		int n=num;
		int rem=0;
		int res=0;
		
		while (num>0) {
			
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
			
		}
		
		System.out.println(""+res);
		
		if (n==res) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not Amstrong");
		}
	}
}
// num=153>0 t  rem=153%10=3  res=0+(3*3*3)=27   num=153/10=15
// num=15>0 t   rem=15%10=5   res=27+(5*5*5)=152 num=15/10=1
// num=1>0 t    rem=1%10=1    res=152+(1*1*1)=153 num=1/10=0
// num=0>0 f  ---- loop stop



