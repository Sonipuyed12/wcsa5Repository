package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://soni/login.do");


		WebElement usnTB = driver.findElement(By.name("username"));
		//	usnTB.sendKeys("admin");
		WebElement pssTB = driver.findElement(By.name("pwd"));
		//pssTB.sendKeys("manager");


		Thread.sleep(2000);
		driver.navigate().refresh();

		//here after the refresh the page if we perform any action on reference variable of webelelemet then we get 
		//staleelementreferenceexception so avoid this we use pom class which is java design pattern in which contains we use @findby annotation
		//any cls which contain @findby is called pom
		usnTB.sendKeys("admin");
		pssTB.sendKeys("manager");


	}

}
