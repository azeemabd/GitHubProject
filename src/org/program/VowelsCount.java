package org.program;

public class VowelsCount {
	
	public static void main(String[] args) {
		
		String a="Welcome to Java Class";
		int b=0;
		
		for (int i = 0; i < a.length(); i++) {
		
			char c = a.charAt(i);
			
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				
				b++;
				
			}
			
		}
		System.out.println("Vowels Count:"+b);
	}

}
