package testNGAnnotationFlags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest{
	
	//@beforemethod then @test then @aftermethod executation 
	//no need to write the implementation of open browser just extends the basetest class and no need to create the 
	//obj of basetest
  @Test
  public void search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test
  public void search2() throws InterruptedException
  {
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test
  public void search3() throws InterruptedException
  {
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
	  Thread.sleep(2000);
  }
}
