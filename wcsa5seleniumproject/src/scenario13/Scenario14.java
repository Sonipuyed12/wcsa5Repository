package scenario13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Coins '] "))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='1 gram'])[1]")).click();
		Thread.sleep(2000);
		WebElement traget = driver.findElement(By.id("5920"));
		if(traget.isDisplayed())
		{
			System.out.println("is displayed");
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.out.println("exception");
		}

		
	}

}
