package org.program;

import java.util.ArrayList;
import java.util.List;
public class DuplicateArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,20,30,40};
		
		List <Integer> l = new ArrayList<>();
		
		for (int i : a) {
			
			if (!l.contains(i)) {
				
				l.add(i);
			}
		}
		System.out.println("Duplicate Removed :"+l);
	}
}
