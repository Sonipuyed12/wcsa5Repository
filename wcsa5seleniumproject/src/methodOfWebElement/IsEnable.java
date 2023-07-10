package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./divers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("svghbdbvhj");
	driver.findElement(By.name("password")).sendKeys("soni@123");
	driver.findElement(By.)
	
	}

}
