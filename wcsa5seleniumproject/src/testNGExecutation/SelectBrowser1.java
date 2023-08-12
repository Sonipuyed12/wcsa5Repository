package testNGExecutation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser1 {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
	//i want to read data from xml file so we use @parameter annotation
//we pass data throw method to webelememnt
	public void chromemethod(String browservalue,String url,String usn,String pss) throws InterruptedException {
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			//suite file to testng class executation then we use @parameter annotation
			//we use parameters in suite file 
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pss);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.quit();

		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pss);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.quit();

		}
	}
}


