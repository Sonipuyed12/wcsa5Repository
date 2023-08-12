package qsp;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		//to take input use Scanner class
		Scanner sc =new Scanner(System.in);
		System.out.println("which browser you want to open");
		String browservalue = sc.next();

		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		if(browservalue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
	}
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
}
