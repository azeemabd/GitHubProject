package org.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		
	
	String s ="Hellojava";
	String res="";
	
	Set<Character> l = new LinkedHashSet<>();
	
	for (int i = 0; i < s.length(); i++) {
		
		char c = s.charAt(i);
		
		l.add(c);
		
	}
	for (Character x : l) {
		
		res=res+x;
	}
	System.out.println("Duplicate Removed:"+res);
	
	}	
}
