package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod1 {

	public static void main(String[] args) {
		//returntype String
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    System.out.println(driver.findElement(By.xpath("/p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getAttribute("class"));   

     WebElement getattributevalue = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
       
     String classvalue = getattributevalue.getAttribute("class");
     
     System.out.println(classvalue);//gives attribute value(oxd-text oxd-text--p orangehrm-login-forgot-header)
     
     
     
	}

}
