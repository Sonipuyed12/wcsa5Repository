package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPooUp {

	//it has one button
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/puyed/OneDrive/Desktop/wcsa5/WebElement/Alert.html");
	
	//generate popup
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(2000);
	
	
	//handle Alert popup
	Alert al = driver.switchTo().alert();
	al.accept();//returntype void
	//al.dismiss();//returntype void
	//System.out.println(al.getText());//returntype string and gettext is the method which is present in alert cls thats why we called it object reference (al.gettext())in sopln statement
	
	
	
	}

}
