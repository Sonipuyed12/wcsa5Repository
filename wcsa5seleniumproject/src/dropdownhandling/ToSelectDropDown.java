
package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//using single select dropdown
	driver.get("file:///D:/wcsa5/WebElement/SingleSelectDropdown.html");
	
	//identify dropdown on webpage
	WebElement dropdownelement = driver.findElement(By.id ("menu"));
	//handle dropdown by creating obj of select
	Select sel = new Select(dropdownelement);
	
	//select the option from dropdown
	//use selection methods
	
	Thread.sleep(2000);
	sel.selectByIndex(2);//from single select dropdown
	
	//read all options of dropdown
//     List<WebElement> alloptions = sel.getOptions();//the returntype of getoptions is list<webelement>
//     
//     //to read list use looping statement
//     
//     for(WebElement op:alloptions)
//    {
//    	 if(op.getText().equals("pani puri"))
//    		 
//    	 {
//    		 Thread.sleep(2000);
//    		 op.click();
//    		 break;
//    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
    	 
    	 
	
	
	}

//}
