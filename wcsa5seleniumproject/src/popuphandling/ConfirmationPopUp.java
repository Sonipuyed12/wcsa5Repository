package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	
	//it has two button only one difference

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/puyed/OneDrive/Desktop/wcsa5/WebElement/confirmation.html");
		//driver.findElement(By.xpath("file:///C:/Users/puyed/OneDrive/Desktop/wcsa5/WebElement/confirmation.html"));
		
		//create confirmation popup
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
		
		//handle confirmation popup
		
		Alert al = driver.switchTo().alert();
		//al.accept();
		//al.dismiss();
		System.out.println(al.getText());
	}

}
