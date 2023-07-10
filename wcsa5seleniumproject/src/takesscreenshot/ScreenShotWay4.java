package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		
		//upcast into remotewebdriver
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		//upcasting into remotewebdriver
		File src = driver.getScreenshotAs(OutputType.FILE);//return type of getscreenshotas method is file
		File dest = new File("./screenshot/screensht4.png");//returntype of file class is file
		Files.copy(src, dest);//fies is third party class
		
		
		
	}

}
