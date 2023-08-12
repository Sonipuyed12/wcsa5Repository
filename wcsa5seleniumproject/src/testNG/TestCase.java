package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {
  @Test
  public void loginMethod() { 
	  SoftAssert sa = new SoftAssert();
		WebElement usn = driver.findElement(By.name("username"));
		sa.assertEquals(usn.isDisplayed(),true);
		usn.sendKeys("admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		sa.assertEquals(pass.isDisplayed(),true);
		pass.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
	
  }
  
  @Test
  public void createUser()
  {
	  SoftAssert sa = new SoftAssert();	 
	  WebElement usn = driver.findElement(By.name("username"));
	  //.sendKeys("admin");
	sa.assertEquals(usn.isDisplayed(), true);
	usn.sendKeys("admin");
	WebElement pss = driver.findElement(By.name("pwd"));
	sa.assertEquals(pss.isDisplayed(), true);
	pss.sendKeys("manager");
	driver.findElement(By.id("loginbutton")).click();
	sa.assertAll();
	String expectedtitle = driver.getTitle();
	Assert.assertEquals(driver.getTitle(),expectedtitle);
	driver.findElement(By.xpath("//div[text()='user'/ancestor::a/img")).click();
  }
  
  
  
  @Test
  public void logout() {
	  driver.findElement(By.partialLinkText("log")).click();
  }
}
