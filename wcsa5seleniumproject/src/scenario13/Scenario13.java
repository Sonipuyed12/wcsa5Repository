package scenario13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Scenario13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		//popup handle
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		Actions ac=new Actions(driver);
		//ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Offers '] "))).perform();
		//driver.findElement(By.xpath("//span[@class='prcs-d']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Up To 20% Off Making Charges']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Upto 20% Off On Making Charges']"));
		if(target.isDisplayed())
		{
			System.out.println("is displayed");
			driver.quit();
		}
		else
		{
			System.out.println("exception");

		}

	}
}

