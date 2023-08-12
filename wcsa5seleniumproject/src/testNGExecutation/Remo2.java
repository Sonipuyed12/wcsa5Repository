package testNGExecutation;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo2 {
  @Test
  public void remoexecutation() {
  
  System.setProperty("webdriver.driver.chrome","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	Reporter.log("this is demo testNG class", true);
}
}