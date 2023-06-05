package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class PPP {
	
	//@Test
	public void string() {
		
		
		String s="suraj",rev="";
		char temp;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			temp=s.charAt(i);
			rev=rev+temp;
		}
		
		System.out.println(rev);
	}
	
	
	//@Test
	public void string2() {
		
		String s="asdfgfdsa";
		int i=0;
		int j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("Not a pallindrome string");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("pallindrome string");
	}
	
	//@Test
	public void list() {
		String a[]= {"red","yellow"};
		
		  List<String> list = Arrays.asList(a);
		  System.out.println(list);
	}
	
	//@Test(invocationCount=4)
	public void random() {
		//System.out.println(Math.random());
		Random random=new Random();
		int num
			=random.nextInt(9999);
			System.out.println(num);		
		
}
	@Test
	public void randomString() {
		
	
		int lenght=5;
		boolean useLetters=true;
		boolean useNumbers=true;
		String generate=RandomStringUtils.random(lenght,useLetters,useNumbers);
		System.out.println(generate);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
