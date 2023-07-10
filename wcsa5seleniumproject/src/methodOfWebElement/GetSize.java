package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driveer","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();//void
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//i want to achive sychncronization
		driver.get("https://www.selenium.dev/");
		Dimension newselement = driver.findElement(By.xpath("//h2[text()='News']")).getSize();
		
		int xyz = newselement.height;
		int xyz1 = newselement.width;
		System.out.println(xyz);//38
		System.out.println(xyz1);//81
		
		//System.out.println(driver.findElement(By.xpath("//h2[text()='News']")).getSize());//81,313
		
	}
      
}
