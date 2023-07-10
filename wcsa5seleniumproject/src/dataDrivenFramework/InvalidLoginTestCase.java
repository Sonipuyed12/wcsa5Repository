package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://soni/login.do");


		//read the data from excel file and test the login page

		Flib flib = new Flib();


		//to read multiple data for loop
//itbis use to get last count of row	
		int rc = flib.getLastRowCount("./data/ActiTimeTestdata.xlsx", "invalidCreads");
	
		for(int i=1;i<=7;i++) {
			
		

		String invalidUsername = flib.readExcelData("./data/ActiTimeTestdata.xlsx","invalidCreads", i, 0);

		String invalidPassword = flib.readExcelData("./data/ActiTimeTestdata.xlsx","invalidCreads", i, 1);

		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		}








	}


}
