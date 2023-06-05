package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayToArryalist {
	
	//@Test
	void arrayToArrayList() {
		
		String color[]= {"red","white","black"};
		
		  List<String> list = Arrays.asList(color);
		  System.out.println(list);
		  
		  
		  
	}
	
	//@Test
	void stringReverse() {
		
		String s="suraj",rev="";
		char temp;
		
		for(int i=s.length()-1;i>=0;i--) {
			temp=s.charAt(i);
			rev=rev+temp;
			
		}
		System.out.println(rev);
		
	}
	
	//@Test
	void removeCharactersFromString() {
		
		String s="surajdalavi";
		
		String r = s.replaceAll("a", "");
		System.out.println(r);
	}
	
	
	@Test
	void findMaximumNumberFromArray() {
		
		int n[]= {1,2,5,9,8,96,10,15,30,2,55,25,94};
		
		int max= n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
		System.out.println(max);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
