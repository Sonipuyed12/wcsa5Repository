package pom;

import java.io.IOException;

public class ValidManagerTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		//open browser
		BaseTest bt = new BaseTest();
		bt.setUp();


		//we nneed genericreusable method which is present in flib class		
		Flib flib = new Flib();

		//login page
		LoginPage lp = new LoginPage(driver);

		//home page
		HomePage hp = new HomePage(driver);

		//create manager //userclass
		UsersPage up = new UsersPage(driver);

		//perform valid lagin
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		//validlogin mathod is paramiterised so it accept argument proppath nd key so we should provide

		//click on user module
		hp.ClickUserModule();

		//create the manager
		//up.createManager(flib.readExcelData(EXCEL_PATH, "managercreads",1,0),flib.readExcelData(EXCEL_PATH, "managercreads",1,1));
		up.createManager(flib.readExcelData(EXCEL_PATH, "managercreads", 1, 0),flib.readExcelData(EXCEL_PATH, "managercreads", 1, 1),flib.readExcelData(EXCEL_PATH, "managercreads", 1, 2),flib.readExcelData(EXCEL_PATH, "managercreads", 1, 3));

		//delete user//manager

	up.deleteManager();
		









	}

}
