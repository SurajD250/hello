package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertPopUp {
	@Test
	void testAlertPopUp() throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	Thread.sleep(3000);
	driver.findElement(By.id("runbtn")).click();
	Thread.sleep(4000);
	Alert a = driver.switchTo().alert();
	a.accept();
	Thread.sleep(4000);
	driver.quit();
	}

}
