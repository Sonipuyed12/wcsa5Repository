package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib 

{
	
	//it is use to open and close the browser
	//no need to write the all the implementation of open browser we call openbrowser methos
	static WebDriver driver;
	public void openBrowser() throws IOException, InterruptedException
	{
		//we neeed to read data from property file and the method readpropertydata method present in flib class so sw create the object of flib cls nd call the method
		Flib flib = new Flib();
		
		//using readproprty mrthod no need to implement the each componanat just call the method
		String browserValue = flib.readPropertyData("./data/config.properties","Browser");//config.properties file main browser ki value chrome se save ki hain so chrome open hoga agar hamane edge se save kiya hota to edge hoga open
		String url = flib.readPropertyData("./data/config.properties","Url");//yaha hamne actitime ka url dala hain to actime open hoga

		
		Thread.sleep(2000);

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}

		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

		else
		{
			System.out.println("enter valid browser");

		}

	}
	public void closeBrowser()
	{

		driver.quit();
	}
}


