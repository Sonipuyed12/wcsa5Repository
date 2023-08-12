package testNGExecutation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGMethod {
  @Test
  public void TestNGMethod1() {
	  
	  //parallel executation methods
	  long threadId1 = Thread.currentThread().getId();
	  Reporter.log("thread of TestNGModule1:"+threadId1,true);
	  
  }
  @Test
  public void TestNGMethod2() {
	  long threadId1 = Thread.currentThread().getId();
	  Reporter.log("thread of TestNGModule2:"+threadId1,true);
	  
  }

}
