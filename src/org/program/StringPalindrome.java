package org.program;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="malayalam";
		String c=s;
		String res="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			char a = s.charAt(i);
			res=res+a;
			
		}
		if(res.equals(c)) {
			
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
