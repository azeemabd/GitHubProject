package org.program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="silent";
		String s2="listen";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String a = String.valueOf(c1);
		String b = String.valueOf(c2);
		
		System.out.println(a);
		System.out.println(b);
		
		if (a.equals(b)) {
			
			System.out.println("Anagram");
			
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
}
