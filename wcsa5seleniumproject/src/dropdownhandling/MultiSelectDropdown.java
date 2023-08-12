package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver 	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///D:/wcsa5/WebElement/SingleSelectDropdown.html");
	
	WebElement dropdownelement = driver.findElement(By.id("menu"));//find webelement
	Select sel = new Select(dropdownelement);//import select class
	
	//read all options of dropdown
	
	List<WebElement> alloptions = sel.getOptions();
	
	//to read list use looping statement
	
	for(WebElement op:alloptions)
	{
		if(op.getText().equals("pani puri"))
		{
			Thread.sleep(2000);
			op.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
