package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	
	@Test
	void testLinks() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=711460102298843355&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007783&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAx6ugBhCcARIsAGNmMbjjchGidLXXXBR7CchGNsRLhDacCo3CSS-NSh6Rsh3N9G2OCxLgPsEaAqXKEALw_wcB");
		List<WebElement> links = driver.findElements(By.tagName("img"));
		int count=0;
		for(WebElement wb:links) {
			String href = wb.getAttribute("src");
//			driver.get(href);
//			driver.quit();
			System.out.println(href);
			count++;
		}
		System.out.println(count);
		
	}
	
	
	
	

}
