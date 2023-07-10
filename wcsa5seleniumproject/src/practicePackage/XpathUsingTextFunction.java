package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("9898989898");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("tonu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();	

}
}