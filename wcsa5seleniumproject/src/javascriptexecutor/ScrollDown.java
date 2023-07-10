package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");


		//to perform scrolling operations
		JavascriptExecutor jse = (JavascriptExecutor)driver;//typecast to javascriptexecutor
		Thread.sleep(2000);

		//scroll down

		jse.executeScript("window.scrollBy(0,1000)");





	}

}
