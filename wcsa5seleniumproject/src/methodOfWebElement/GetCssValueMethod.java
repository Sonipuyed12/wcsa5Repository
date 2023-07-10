package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		//returntype string
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//System.out.println(driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color"));
	WebElement getcssvalue = driver.findElement(By.xpath("//button[text()=' Login ']"));
	String getcssvalue1 = getcssvalue.getCssValue("color");
	System.out.println(getcssvalue1);
	
	//driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color");we shoudld not write like this because we want to print the so we take in sys
	
	
	}

}
