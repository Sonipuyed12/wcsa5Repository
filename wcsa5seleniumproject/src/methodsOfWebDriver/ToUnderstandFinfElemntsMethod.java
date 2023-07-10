package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFinfElemntsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
		WebElement bikes = driver.findElement(By.xpath("//div[@class='wM6W7d']"));
		//for(int i=0;i<bikes.size();i++)
		//{
			//String bikesOption = bikes.get(i).getText();
			//System.out.println(bikesOption );
			//Thread.sleep(2000);
		//}
		for(WebElement we: bikes)
		{
			String bikeOptions = we.getText();
			System.out.println(bikeOptions );
			Thread.sleep(2000);
		}
	}

}
