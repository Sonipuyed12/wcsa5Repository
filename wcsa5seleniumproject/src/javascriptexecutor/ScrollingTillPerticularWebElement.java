package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTillPerticularWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		//identify the webelement

		WebElement newselement = driver.findElement(By.xpath("//h2[text()='News']"));
		//to perform scrolling operation for newselement
		//location of newselement
		//Point loc = newselement .getLocation();
		//int xaxis = loc.getX();
		//int yaxis = loc.getY();

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");	
		jse.executeScript("argument[0].scrollIntoView(false)",newselement);

	}

}
