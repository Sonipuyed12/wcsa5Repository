package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driveer","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();//void
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//i want to achive sychncronization
	driver.get("https://www.selenium.dev/");
	
	
	//System.out.println(driver.findElement(By.xpath("//h2[text()='News']")).getLocation().getX());
	//System.out.println(driver.findElement(By.xpath("//h2[text()='News']")).getLocation().getY());
	
	
	
	Point newsElement = driver.findElement(By.xpath("//h2[text()='News']")).getLocation();
	 
	int xaxis= newsElement.getX();
	int yaxis = newsElement.getY();
	
	System.out.println(xaxis);//719
	System.out.println(yaxis);//1528
	
	}

}
