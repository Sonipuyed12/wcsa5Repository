package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/puyed/OneDrive/Desktop/wcsa5/WebElement/Disabled.html");

		//identify web element
		driver.findElement(By.id("i1")).sendKeys("admin");
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		//generate alert pop up
		//handle disable webelement
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementById('i2').value='manager'");
		//Thread.sleep(2000);
		//jse.executeScript("alert('Hello There||')");
		
		jse.executeScript("document.getElementById('i2').value='manager'");
	}

}
