package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionINTesNG {
  @Test
  public void verificationMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://soni/login.do");
	 String actualtitle = driver.getTitle();
	 
	 //non critical feature
	 
//	 if(driver.getTitle().equalsIgnoreCase(actualtitle))
//	 {
//		 driver.findElement(By.name("username")).sendKeys("admin");
//		 driver.findElement(By.name("pwd")).sendKeys("manager");
//		 driver.findElement(By.id("loginbutton")).click();
//		 System.out.println("title matchedtest case failed");
//	 }
//	 
//	 else
//	 {
//		 System.out.println("title not matched test case fasiled");
//	 }
//	 
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(driver.getTitle(),actualtitle);
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginbutton")).click();
	 System.out.println("title matched test case failed");
	 sa.assertAll();
	 
	 //critical features
	 
	// if(driver.getTitle().equalsIgnoreCase("tcndbvkk"))
//			{
//				System.out.println("Home page title matched test case passed!!!");
//			}
		//	
//			else 
//			{
//				System.out.println("title no matched test case failed!!!");
//			}
	 
	 String actualTitleOfHomePage = driver.getTitle();
	 Assert.assertEquals(driver.getTitle(),"soni");
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("logout")).click();
  }
}
