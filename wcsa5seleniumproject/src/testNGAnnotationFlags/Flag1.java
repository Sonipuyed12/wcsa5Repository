package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//it is use to describe the method or test case
  @Test(description = "Login Method")
  public void method1() {
	  
	  Reporter.log("method1 from flag1",true);
  }
  @Test(description = "Logout Method")
  public void method2() {
	  
	  Reporter.log("method1 from flag1",true);
  }
}
