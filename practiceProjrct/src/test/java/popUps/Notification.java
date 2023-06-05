package popUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Notification {
	
	@Test
	void testNotoficationPopUp() {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notification");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/selenium/suraj/singleselectdropdown.html");
		
	}

}
