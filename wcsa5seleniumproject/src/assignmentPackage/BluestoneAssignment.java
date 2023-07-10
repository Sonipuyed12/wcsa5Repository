package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeOptions;

public class BluestoneAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//launch bluestone
		driver.get("https://www.bluestone.com/");

		//

		//handle hidden divisin popup
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);

		//identify frame by using xpath
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));

		//switch a control to handle the the 
		//driver.switchTo().frame(9);//handle frame by using index
		//driver.switchTo().frame("fc_widget");//handle frame by using (string name or id)
		driver.switchTo().frame(frameelement);

		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		chatbox.click();
		//explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("\"denyBtn\""))).click();


		//switch control again back to the main webpage

		driver.switchTo().defaultContent();//switch control to main frame or wabepage
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-name")).sendKeys("soni");
		driver.findElement(By.id("chat-fc-email")).sendKeys("soni@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("7447589878");
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();



	}

}
