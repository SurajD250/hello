package practice;

import org.testng.annotations.Test;

public class Febonacci {
	//@Test
	public  void main() {
		int a=1;
		int b=2;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<20;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	
 
	//@Test
	void reverseString() {
		
		String s="Suraj",rev="";
		char temp;
		for(int i=s.length()-1;i>=0;i--) {
			temp=s.charAt(i);
			rev=rev+temp;
		}
		System.out.println(rev);
		
	}
	
	//@Test
	void removeNumbers() {
		String s="Su12ra54j";
		
		String string = s.replaceAll("[0-9]", "");
		String strig2= s.replaceAll("[A-z]", "");
		System.out.println(string);
		System.out.println(strig2);
	}
	
	
    //@Test
	void stringBuffer() {
		
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		
		
	}

    @Test
    void concatString() {
    	
    	String s1="suraj";
    	String s2="dalavi";
    	
    	//s2 +=s1;
//    	System.out.println(s2);
//    	String m=s1.concat(s2);
//    	System.out.println(m);
    	
    	boolean t = s1.equals(s2);
    	System.out.println(t);
    
    	
    }



























































}
