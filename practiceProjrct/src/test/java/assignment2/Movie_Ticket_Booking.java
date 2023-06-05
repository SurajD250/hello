package assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Movie_Ticket_Booking {
	
	@Test
	void book_Movie_Tickets() throws AWTException, InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
		driver.findElement(By.id("2")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Pathaan");
		Thread.sleep(2000);
		Thread.sleep(1000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("page-cta-container")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//a[@href='/booktickets/FMMA/152504']")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.id("pop_4")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		String title_of_the_page = driver.getTitle();
		Assert.assertEquals(title_of_the_page.contains("Pathaan 2D Movie, Showtimes in Mumbai & Online Ticket Booking"),true);
		
	}

}
