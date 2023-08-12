package testNGAnnotationFlags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ActiTimeDataProvider {

	@Test(dataProvider = "actitimedata")//@test annotation method is mandatory
	public void invalidLoginMethod(String usn,String pss)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://soni/login.do");//return type of get method is void //it is use to launch the webpage
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pss);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
	}


	@DataProvider(name="actitimedata")//it execute before @test annotation //to execute data driven testing
	//using this no need to call data from excel sheet we can directly use this
	//invalid login
	public Object[][] testdata() {

		Object[][] testdata1 = new Object [5][2];//create two dimensional array //object=datatype

		testdata1[0][0]="ad_min";//first braces is for row and second is for coloum
		testdata1[0][1]="man_ager";

		testdata1[1][0]="manager";
		testdata1[1][1]="admin";

		testdata1[2][0]="@admin";
		testdata1[2][1]="@manager";

		testdata1[3][0]="admin123";
		testdata1[3][1]="manager123";

		testdata1[4][0]="123admin";
		testdata1[4][1]="123manager";

		return testdata1;





	}
}
