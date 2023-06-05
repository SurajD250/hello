package practice;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDownHandleing {
	@Test
	public void testDropDown() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/selenium/suraj/singleselectdropdown.html");
		WebElement singleDropDown=driver.findElement(By.id("menu"));
		Select sl= new Select(singleDropDown);
		 List<WebElement> op = sl.getOptions();
		 TreeSet<String> t=new TreeSet();
		 int k=0;
		 
		 for(WebElement m:op) {
			 
			String string=m.getText();
			t.add(string);
			
		 }
		 for(String d:t) {
			 k++;
			 
		 }
		// System.out.println(t);
//		 for(WebElement w:op) {
//			 k++;
//		 }
		System.out.println(k);
		driver.close();
		
		
		
		
	}

}
