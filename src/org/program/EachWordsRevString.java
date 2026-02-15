package org.program;

public class EachWordsRevString {

	public static void main(String[] args) {
		
		String s="Welcome to Java Class";
		String res="";
		
		String[] a= s.split(" ");
		
		for (String x : a) {
			
			String rev="";
			for (int i =x.length()-1; i>=0; i--) {
				
				char b = x.charAt(i);
				
				rev=rev+b;
			}
			res=res+rev+" ";
		}
			System.out.println("Reverse Words:"+res);
		}
	}
	
//1st Iteration emoclew  res=emoclew
//2nd Iteration ot       res=emoclew ot
//3rd Iteration avaj     res=emoclew ot avaj
