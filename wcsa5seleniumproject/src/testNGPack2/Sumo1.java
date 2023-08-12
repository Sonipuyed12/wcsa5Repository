package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo1 {
  @Test
  public void method5() {
	  Reporter.log("this is method5 class",true);
  }
  @Test
  public void method6() {
	  int a=3;
	  int b=15;
	  int c=b/a;
	  
	  Reporter.log("this is method6 class",true);
  }
}
