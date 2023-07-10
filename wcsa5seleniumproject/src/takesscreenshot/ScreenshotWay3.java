package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//create the object of browser specific class
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cdriver.get("https://www.selenium.dev/");
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/screenshot3.png");
		Files.copy(src, dest);
		
	}

}

