package org.program;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String s ="Banana";
		int count =0;
		char a='a';
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c==a) {
				
				count++;
			}
		}
		System.out.println("a:"+count);
	}
}
// s="Banana", a='a', count=0

// i=0   0<6 t   c='B'  B==a f   count=0       i=0+1=1
// i=1   1<6 t   c='a'  a==a t   count=0+1=1   i=1+1=2
// i=2   2<6 t   c='n'  n==a f   count=1       i=2+1=3
// i=3   3<6 t   c='a'  a==a t   count=1+1=2   i=3+1=4
// i=4   4<6 t   c='n'  n==a f   count=2       i=4+1=5
// i=5   5<6 t   c='a'  a==a t   count=2+1=3   i=5+1=6
// i=6   6<6 f   ---- loop stop