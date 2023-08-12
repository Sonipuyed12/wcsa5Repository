package testNG;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	@BeforeMethod(description = "open the browser")
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://soni/login.do");
	}

	///implementation of take screenshot
	//if we directly create the explict way of screenshot it will not allow so we need to create the method
	//method to take the screenshot
	public void failedMethod(String failedMethodName)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+failedMethodName+".png");
        
        try {
        	Files.copy(src,dest);
        }
        catch(Exception e) {
        	
        }
	}




	@AfterMethod(description = "close the browser")
	public void tearDown() {

		driver.quit();
	}









}
