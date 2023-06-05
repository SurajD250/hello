package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCSSValue {
 
	@Test
	void getCssValue() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement selenium = driver.findElement(By.id("Layer_1"));
		String value = selenium.getCssValue("color");
		System.out.println(value);
	}
}
