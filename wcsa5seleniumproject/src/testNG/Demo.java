package testNG;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void f() throws InterruptedException {
		//syssout gives always console report output html report not display
		//console main print hoga bss
		// System.out.println("this is demo testNG class");

		// msg print in html report only not console report
		// Reporter.log("this is demo testNG class");
		System.setProperty("webdriver.driver.chrome","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
		Reporter.log("this is demo testNG class", true);



	}
}
