package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//store all tthe homepage module

	@FindBy(xpath = "//div[text()='Time-Track']/../descendant::img")private WebElement timeTrackModule;
	@FindBy(xpath = "//div[text()='Tasks']/../descendant::img")private WebElement taskModule;
	@FindBy(xpath = "//div[text()='Reports']/../descendant::img")private WebElement reportModule;
	//we can write path this way or that way
	//div[text()='Reports']/../descendant::img[@src='/img/default/pixel.gif?hash=1692528820']
	@FindBy(xpath = "//div[text()='Users']/../descendant::img")private WebElement usermodule;
	@FindBy(xpath ="//div[text()='Work Schedule']/../descendant::img" )private WebElement workscheduleModule;
	@FindBy(xpath ="//div[text()='Settings']/../descendant::img" )private WebElement settingModule;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement logoutLink;
	//public HomePage(WebElement timeTrackModule, WebElement taskModule, WebElement reportModule, WebElement usermodule,
		//	WebElement workscheduleModule, WebElement settingModule, WebElement logoutLink) {
		//super();
		//this.timeTrackModule = timeTrackModule;
		//this.taskModule = taskModule;
		//this.reportModule = reportModule;
		//this.usermodule = usermodule;
		//this.workscheduleModule = workscheduleModule;
		//this.settingModule = settingModule;
		//this.logoutLink = logoutLink;
	//}
	
	
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}




	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}




	public WebElement getTaskModule() {
		return taskModule;
	}




	public WebElement getReportModule() {
		return reportModule;
	}




	public WebElement getUsermodule() {
		return usermodule;
	}




	public WebElement getWorkscheduleModule() {
		return workscheduleModule;
	}




	public WebElement getSettingModule() {
		return settingModule;
	}




	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	public void ClicktimeTrackModule()
	{
		timeTrackModule.click();
	}
	
	public void ClickTaskModule()
	{
		taskModule.click();
	}
	
	public void ClickReportModule()
	{
		reportModule.click();
		
	}
	
	public void ClickUserModule()
	{
		usermodule.click();
	}
	
	public void ClickWorkScheduleModule()
	{
		workscheduleModule.click();
	}
	
	public void ClicksettingModule()
	{
		settingModule.click();
	}
	public void ClickLogoutLink()
	{
		logoutLink.click();
	}
	
	
}
