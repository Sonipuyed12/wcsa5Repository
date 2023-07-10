package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/profile/sign-in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'number')]")).sendKeys("9898989898");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("soni@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-n6v787 r-1kfrs79 r-q4m81j']")).click();
		
		
		
		
		
	}

}
