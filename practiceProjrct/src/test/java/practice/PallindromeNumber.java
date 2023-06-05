package practice;

import org.testng.annotations.Test;

public class PallindromeNumber {
	
	@Test
	void testPallindromeNumber() {
		int a=3006;
		int rev=0,temp,org=a;
		while(a>0) {
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		System.out.println(rev);
		
	}

}
