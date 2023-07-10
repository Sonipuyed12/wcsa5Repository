package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
		//returntype boolean
		
		System.setProperty("webdriver.chrome.diver","./driver.chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://soni/login.do");
	//WebElement usnTextbox = driver.findElement(By.name("username"));
	//String usnTextbox1 = usnTextbox.getTagName();
	//System.out.println(usnTextbox1);
	
	System.out.println(driver.findElement(By.name("username")).getTagName());//input
	
	//String xyz = driver.findElement(By.name("username")).getTagName();
	
	  //System.out.println(xyz);//input //it also work

	}

}
