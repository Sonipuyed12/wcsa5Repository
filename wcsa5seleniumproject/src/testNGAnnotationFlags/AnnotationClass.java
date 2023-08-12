package testNGAnnotationFlags;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {
	@Test
	public void method1() {
		Reporter.log(" TestAnnotation",true);

	}
	@AfterMethod
	public void method2()
	{
		Reporter.log("AfterMthodAnnotation",true);
	}
//	@AfterMethod
//	public void method3()
//	{
//		Reporter.log("BeforeMethodAnnotation",true);
//	}
	@BeforeClass
	public void method4() {
		Reporter.log("BeforeclassAnnotation");
	}
	@AfterClass
	public void method5()
	{
		Reporter.log("AfterclassAnnotation");
	}
	@BeforeMethod
	public void method6()
	{
		Reporter.log("BeforemethodAnnotation",true);
	}
	@BeforeSuite
	public void method7() {
		Reporter.log("BeforesuiteAnnotation",true);
	}
	@AfterSuite
	public void method8() {
		Reporter.log("AftersuiteAnnotation",true);
	}
	@BeforeTest
	public void method9() {
		Reporter.log("BeforetesteAnnotation",true);
	}
	@AfterTest
	public void method10() {
		Reporter.log("AftertesteAnnotation",true);
	}
}
