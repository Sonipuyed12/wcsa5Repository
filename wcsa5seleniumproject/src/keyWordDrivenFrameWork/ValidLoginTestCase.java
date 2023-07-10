package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();//all implementation present in thiscls so we call it no need to write all the implementation to open browser
		bt.openBrowser();//no  need to write all implementation

		Flib flib = new Flib();

		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData("./data/config.properties", "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData("./data/config.properties", "Password"));


		driver.findElement(By.id("loginbutton")).click();

		Thread.sleep(2000);
		bt.closeBrowser();
	}

}
