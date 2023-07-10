package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");


		//get adresss of parent browser
		String parentHandled = driver.getWindowHandle();
		System.out.println(parentHandled);
		
		//get adress of child class
		//find element
		
	//	driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		//Set<String> allHandles = driver.getWindowHandles();
		
		//for(String wh:allHandles)
		//{
			//System.out.println(wh);
		//}




	}

}
