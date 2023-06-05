package practice;

import org.testng.annotations.Test;

public class PrimeNumber {
	
	//@Test
	void printPrimeNumber() {
		
		for(int i=3;i<50;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
	
	@Test
	void checkPrimeNumber() {
		int i=12;
		boolean flag=true;
		for(int a=2;a<i;a++) {
			if(i%a==0) {
				System.out.println("Not a prime number");
				System.exit(0);
			}
		}
		System.out.println("Prime Number");
	}

}
