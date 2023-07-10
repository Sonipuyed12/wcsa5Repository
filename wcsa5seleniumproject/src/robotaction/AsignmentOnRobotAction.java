package robotaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AsignmentOnRobotAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch blue stone
		driver.get("https://www.bluestone.com/");


		//handle hidden pop up
		driver.findElement(By.id("denyBtn")).click();


		//move to watch jewellerry
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery'] "));
		act.moveToElement(target).perform();

		driver.findElement(By.xpath("//a[text()='Band']"));
		Thread.sleep(4000);

		//click and hold the filter by text
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));


		for(int i=1;i<=2;i++)
		{
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		}
		Thread.sleep(4000);


		//copy the filter by text

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);


		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

		driver.findElement(By.xpath("//input[@placeholder='Search for Jewellery']")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);


		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);


		//hit enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		//verify 1 design displayed or not
		if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
		{

		}
		else
		{
			System.out.println("exception");
		}


	}
}









