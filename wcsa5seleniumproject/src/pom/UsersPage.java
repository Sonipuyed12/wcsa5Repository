package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {


	//store webelement of userspage

	@FindBy(xpath = "//input[@value='Create New User']")private WebElement userlistCreatenewUserbutton;
	@FindBy(name = "username")private WebElement usnTB;
	@FindBy(xpath = "//input[@name='passwordText']")private WebElement pssTB;
	@FindBy(xpath = "//input[@name='passwordTextRetype']") private WebElement retypePssTB;
	@FindBy(xpath = "//input[@name='firstName']") private WebElement firstNameTB;
	@FindBy(xpath = "//input[@name='lastName']")private WebElement lastNameTB;
	@FindBy(name = "rightGranted[12]")private WebElement modifyEnterTimeTrackCheckbox;
	@FindBy(name="rightGranted[2]") private WebElement manageCust_projectTB;
	@FindBy(name="rightGranted[1]") private WebElement generatesReportsCheckBox;
	@FindBy(name="rightGranted[5]") private WebElement manageUserCheckBox;
	@FindBy(name="rightGranted[7]")private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath = "//input[@type='submit']") private WebElement  createUserbutton;
	@FindBy(xpath = "/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancelButton;
	@FindBy(xpath = "//a[.='jadhav, ganesh (mannn4)']") private WebElement usersLink;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteThisUserButton;

	//@FindBy()
	//	public UsersPage(WebElement userlistCreatenewUserbutton, WebElement usnTB, WebElement pssTB, WebElement retypePssTB,
	//			WebElement firstNameTB, WebElement lastNameTB, WebElement modifyEnterTimeTrackCheckbox,
	//			WebElement manageCust_projectTB, WebElement generatesReportsCheckBox, WebElement manageUserCheckBox,
	//			WebElement manageBillingTypeCheckBox, WebElement createUserbutton) {
	//		super();
	//		this.userlistCreatenewUserbutton = userlistCreatenewUserbutton;
	//		this.usnTB = usnTB;
	//		this.pssTB = pssTB;
	//		this.retypePssTB = retypePssTB;
	//		this.firstNameTB = firstNameTB;
	//		this.lastNameTB = lastNameTB;
	//		this.modifyEnterTimeTrackCheckbox = modifyEnterTimeTrackCheckbox;
	//		this.manageCust_projectTB = manageCust_projectTB;
	//		this.generatesReportsCheckBox = generatesReportsCheckBox;
	//		this.manageUserCheckBox = manageUserCheckBox;
	//		this.manageBillingTypeCheckBox = manageBillingTypeCheckBox;
	//		this.createUserbutton = createUserbutton;
	//}
	//initialazation
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUserlistCreatenewUserbutton() {
		return userlistCreatenewUserbutton;
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPssTB() {
		return pssTB;
	}

	public WebElement getRetypePssTB() {
		return retypePssTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyEnterTimeTrackCheckbox() {
		return modifyEnterTimeTrackCheckbox;
	}

	public WebElement getManageCust_projectTB() {
		return manageCust_projectTB;
	}

	public WebElement getGeneratesReportsCheckBox() {
		return generatesReportsCheckBox;
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypeCheckBox() {
		return manageBillingTypeCheckBox;
	}

	public WebElement getCreateUserbutton() {
		return createUserbutton;
	}

	//then we have to create manager

	public void createManager(String username,String password,String fn,String ln) throws InterruptedException
	{
		//we create method nd directly call in validmanagertestcase no need to write all implementation just cl method
		userlistCreatenewUserbutton.click();
		Thread.sleep(1000);
		usnTB.sendKeys(username);//using ref vsriable then sendkeys method we pass 
		pssTB.sendKeys(password);
		retypePssTB.sendKeys(password);
		firstNameTB.sendKeys(fn);
		lastNameTB.sendKeys(ln);
		Thread.sleep(1000);
		modifyEnterTimeTrackCheckbox.click();
		manageCust_projectTB.click();
		generatesReportsCheckBox.click();
		manageUserCheckBox.click();
		manageBillingTypeCheckBox.click();
		Thread.sleep(1000);
		createUserbutton.click();

	}
	public void deleteManager()
	{
		usersLink.click();
		deleteThisUserButton.click();

	}

}
