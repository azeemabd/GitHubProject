package org.program;

public class RevString {

	public static void main(String[] args) {
		
		String s="Welcome to Java";
		String res="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			char c =s.charAt(i);
			
			res=res+c;
		}
		System.out.println("String Reverse:"+res);
	}
	
}
// i=14>=0 t  c='a'  res=""+"a"                 i=14-1=13
// i=13>=0 t  c='v'  res="a"+"v"                i=13-1=12
// i=12>=0 t  c='a'  res="av"+"a"               i=12-1=11
// i=11>=0 t  c='J'  res="ava"+"J"              i=11-1=10
// i=10>=0 t  c=' '  res="avaJ"+" "             i=10-1=9
// i=9>=0 t   c='o'  res="avaJ "+"o"            i=9-1=8
// i=8>=0 t   c='t'  res="avaJ o"+"t"           i=8-1=7
// i=7>=0 t   c=' '  res="avaJ ot"+" "          i=7-1=6
// i=6>=0 t   c='e'  res="avaJ ot "+"e"         i=6-1=5
// i=5>=0 t   c='m'  res="avaJ ot e"+"m"        i=5-1=4
// i=4>=0 t   c='o'  res="avaJ ot em"+"o"       i=4-1=3
// i=3>=0 t   c='c'  res="avaJ ot emo"+"c"      i=3-1=2
// i=2>=0 t   c='l'  res="avaJ ot emoc"+"l"     i=2-1=1
// i=1>=0 t   c='e'  res="avaJ ot emocl"+"e"    i=1-1=0
// i=0>=0 t   c='W'  res="avaJ ot emocle"+"W"   i=0-1=-1
// i=-1>=0 f ---- loop stop