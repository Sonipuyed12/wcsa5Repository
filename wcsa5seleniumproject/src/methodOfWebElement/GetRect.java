package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driveer","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();//void
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//i want to achive sychncronization
		driver.get("https://www.selenium.dev/");
		Rectangle newselement = driver.findElement(By.xpath("\"//h2[text()='News']")).getRect();
		
				
		int height = newselement.height;
		int width = newselement.width;
		System.out.println(height);
		System.out.println(width);

	}

}
