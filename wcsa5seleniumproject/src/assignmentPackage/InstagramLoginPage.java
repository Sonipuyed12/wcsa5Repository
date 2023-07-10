package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[name*='ur'] ")).sendKeys("admin@123");
		//Thread.sleep(2000);
		//driver.findElement(By.className("input[name='password']")).sendKeys("soni");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("qspiders");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='ap']")).click();

		
		
		
		
		
	}

}
