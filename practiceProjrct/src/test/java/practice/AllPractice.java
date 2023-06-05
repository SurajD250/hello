package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllPractice {
	@Test(priority=1)
	void scrollDownToPerticularElement() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
		Point l = news.getLocation();
		int yaxis = l.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+yaxis+")");
		String text = news.getText();
		System.out.println(text);
		driver.quit();
	}
	
	
	@Test(priority=2)
	void getDimentionsOfElement() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement di = driver.findElement(By.id("selenium_webdrive"));
		Rectangle r=di.getRect();
		int h = r.getHeight();
		int w = r.getWidth();
		System.out.println("height is  "+h);
		System.out.println("weidth is  "+w);
	}

}
