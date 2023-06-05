package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flight_Booking {
	
	@Test
	void book_Spicejet_com() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("//span[text()=' Flights ']")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[text()=' Mumbai (BOM)']")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[text()=' Delhi (DEL)']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default' and @data-date='28']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='date_picker_id_2']/following-sibling::button[@type='button']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default' and @data-date='30']")).click();
		WebElement dp = driver.findElement(By.id("divpaxinfo"));
		dp.click();
		WebElement adult = driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT"));
		Select sl=new Select(adult);
		sl.selectByValue("3");
		Thread.sleep(2000);
		dp.click();
		dp.click();
		WebElement child=driver.findElement(By.xpath("//select[@name='ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_CHD']"));
		child.click();
		Select sl2=new Select(child);
		sl.selectByValue("2");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		WebElement DEPARTURE_FLIGHT = driver.findElement(By.xpath("//table[@id='availabilityTable0']/descendant::span[@class='bound-city uppercase']"));
		Assert.assertEquals(DEPARTURE_FLIGHT.isDisplayed(), true);
		
	}

}
