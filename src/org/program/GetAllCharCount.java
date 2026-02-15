package org.program;

public class GetAllCharCount {

	public static void main(String[] args) {
		
		String s = "Java Class @ 123";
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
		int spaceCount=0;
		int specialCount=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c =s.charAt(i);
			
			if (c>=65 && c<=90) {
				
				upperCount++;
				
			}
			else if (c>=97 && c<=122) {
				
				lowerCount++;
				
			}
			else if (c>=48 && c<=57) {
				
				digitCount++;
				
			}
			else if (c==32) {
				
				spaceCount++;
				
			}
			else {
				
				specialCount++;
				
			}
			
		}
		System.out.println("UpperCase Count:"+upperCount);
		System.out.println("LowerCase Count:"+lowerCount);
		System.out.println("Number Count:"+digitCount);
		System.out.println("Space Count:"+spaceCount);
		System.out.println("Special Character Count:"+specialCount);
	}
}
