package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");

		//get handle or adress of current or parent window
		String parentHandle = driver.getWindowHandle();
		System.out.println("adress of parent window:"+parentHandle);
		
		//launch the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		//get the handle or adress of child window only
		Set<String> allHandles = driver.getWindowHandles();
		
		//read adress by using looping statement
		
		for(String wh:allHandles)
		{
			System.out.println(wh);
		}
		
	
		

	}

}
