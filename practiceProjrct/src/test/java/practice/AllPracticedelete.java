package practice;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class AllPracticedelete {
	
	@Test
	void pallindromeNumber() {
		
		int a=153,org=a;
		int rev=0;
		int temp;
		while(a>0) {
			temp=a%10;
			rev=(int)(rev+Math.pow(temp, 3));
			a=a/10;
		}
		
		if(org==rev) {
			System.out.println("pallindrome number");
		}
		else {
			System.out.println("not pallindrome number");
		}
	}

}
