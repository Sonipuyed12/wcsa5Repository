package pom;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browsers and application
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//perform invalid logintestcase
		
		//so we recuired webelement then create the object of login page
		
		LoginPage lp = new LoginPage(driver);
		
		//read data from excelsheet
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH,"invalidcreads");
		
		
		for(int i=1;i<=rc;i++)
		{
			lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 0),flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1));
		}
		
		
	}

}
