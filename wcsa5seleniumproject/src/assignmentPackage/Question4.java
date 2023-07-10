package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	//how to close only child browse

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");

		//launch the child browser
		WebElement childwindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point elementlocation = childwindow.getLocation();
		int xaxis = elementlocation.getX();
		int yaxis = elementlocation.getY();

		//scroll till open a popup window
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		childwindow.click();

		//get the adress or handle the parent browser
		String parentHandle = driver.getWindowHandle();

		//get adress or handles parent and child browser
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles) {
			if(!parentHandle.equals(wh))
			{ 
				Thread.sleep(2000);
				driver.switchTo().window(wh).close();
				break;
			}
		}

	}

}
