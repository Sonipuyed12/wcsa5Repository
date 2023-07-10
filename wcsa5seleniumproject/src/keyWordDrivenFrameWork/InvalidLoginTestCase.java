package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();//open the browser

		bt.openBrowser();

		Flib flib = new Flib();//cal the method readexceldata

		// use to get last row cont

		int rc = flib.getLastRowCount("./data/ActiTimeTestdata.xlsx","invalidcreads");
		
		for(int i=1;i<=rc;i++)
		{

		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestdata.xlsx", "invalidcreads", i, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestdata.xlsx", "invalidcreads", i, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();

	}

	}
}
