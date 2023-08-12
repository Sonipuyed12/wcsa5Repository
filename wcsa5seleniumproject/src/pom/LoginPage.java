package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locators.webElement;

public class LoginPage {


	// webelement repository

	//storing webleement in one cls it will easy to code resualibity and generalition so we directly create object of class and call all webelement

	//we private the webelement because it should not be reflectet

	//@findby it is use to get new or current adress of webelement it work like findelement
	//using this we can avoid the staleelementreferenceexception...if page geeting refreh then ntg will happen we dont get any exception

	//here we find webelement by using this syntax @findby(locator='locatorvalue')access specifier returntype elementname;

	@FindBy(xpath="//input[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//input[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath="//a[@class='initial']") private WebElement loginbutton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText =" Actimind Inc.") private WebElement actimindLink;

	// we should initialize because we wwant to use the data
	//so we make constructor



	//public LoginPage(WebElement usnTB, WebElement pssTB, WebElement loginbutton, WebElement checkBox,
	//	WebElement actimindLink) {
	//super();
	//this.usnTB = usnTB;
	//this.pssTB = pssTB;
	//this.loginbutton = loginbutton;
	//this.checkBox = checkBox;
	//this.actimindLink = actimindLink;
	//}
	//to avoid this much of implementation we use pagefacory.initelement() method
	//acually pagefacory is class so


	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//this keyword repesent the adress of current object
	}




	//we use getter method because we want the webelement which is private to access them we sue getter method

	//utilization


	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getActimindLink() {
		return actimindLink;
	}




	//operational
//if we want our testcase more generalise so we use this
	public void  validLoginMethod(String validUsername,String validPassword)
	
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		loginbutton.click();


	}
	public void inValidLoginMethod(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usnTB.sendKeys(invalidUsername);
		pssTB.sendKeys(invalidPassword);
		loginbutton.click();
		Thread.sleep(1000);
		usnTB.clear();
	}



}
