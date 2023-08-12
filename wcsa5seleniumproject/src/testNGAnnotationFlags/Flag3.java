package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 1000)
  //if u want to execute test more than one time use this
  //no of executation happen 
  public void method1() {
	  Reporter.log("Method1",true);
  }
}
