package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("qspidere");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("soni@123");
		Thread.sleep(2000);

	}

}
