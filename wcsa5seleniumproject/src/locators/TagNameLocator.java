package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.tagName("input"));
		usn.sendKeys("qspider");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.tagName("input"));
		pwd.sendKeys("soni123");
	
	}

}
