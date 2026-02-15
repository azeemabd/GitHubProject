package org.program;

public class StringOccurance {

	public static void main(String[] args) {
		
		String a ="Java Class Java Session";
		int count=0;
		String b="Java";
		
		String[] s=a.split(" ");
		
		for (String x : s) {
			
			if (b.equals(x)) {
              
				count++;
			} 
		}
		System.out.println("Java:"+count);
	}
}
// a="Java Class Java Session"
// b="Java"
// s[]={"Java","Class","Java","Session"}
// count=0

// x="Java"    Java==Java t   count=0+1=1
// x="Class"   Class==Java f  count=1
// x="Java"    Java==Java t   count=1+1=2
// x="Session" Session==Java f count=2