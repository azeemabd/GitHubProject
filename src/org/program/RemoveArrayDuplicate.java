package org.program;

import java.util.Set;
import java.util.TreeSet;

public class RemoveArrayDuplicate {

	public static void main(String[] args) {
		
		int a[]= {10,20,10,30,20,40};
		
		Set<Integer> s= new TreeSet<Integer>();
		
		for (Integer x : a) {
			
			s.add(x);
		}
		System.out.println("Duplicate Removed:"+s);
	} 
	
}
// a[] = {10,20,10,30,20,40}
// s = {}  (empty set)

// x=10  add 10 →       s={10}
// x=20  add 20 →       s={10,20}
// x=10  duplicate →    s={10,20}
// x=30  add 30 →       s={10,20,30}
// x=20  duplicate →    s={10,20,30}
// x=40  add 40 →       s={10,20,30,40}