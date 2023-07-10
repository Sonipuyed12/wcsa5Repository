package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethod {
	//returntype boolean

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://soni/login.do");
    boolean ustextbox = driver.findElement(By.name("username")).isDisplayed();
    System.out.println(ustextbox);//if element is present it gives true or false
    
   
   // System.out.println(driver.findElement(By.name("username")).isDisplayed());//true

	}

}
