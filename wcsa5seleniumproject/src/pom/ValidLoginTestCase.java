package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest 

//we extend the cls because we want the method setup which work like open the browser no need to implement just create the object of cls and cll the method
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();//it is nonstatic method
		
		
		//here we want the method of readpropertydata so create obj of flib
		Flib flib = new Flib();
		
		//to call the webelement of loginpage create the obj of login class
	LoginPage lp = new LoginPage(driver);
//	lp.getUsnTB().sendKeys(flib.readPropertyData(PROP_PATH,"Username"));
//	lp.getPssTB().sendKeys(flib.readPropertyData(PROP_PATH,"Password "));
//	lp.getLoginbutton().click();
	lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	//we call validlogin method which accept argument which means that validusername which is present in flib cls's method readpropertydatas file properties 
       HomePage hp = new HomePage(driver);
       hp.ClickLogoutLink();//it is present in homepage cls 
	}

}
