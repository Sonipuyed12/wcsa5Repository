package testNGExecutation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGMethod2 {
	@Test
	  public void TestNGMethod3() {
		  long threadId3 = Thread.currentThread().getId();
		  Reporter.log("thread of TestNGModule3:"+threadId3,true);
		  
	  }
	  @Test
	  public void TestNGMethod4() {
		  long threadId4 = Thread.currentThread().getId();
		  Reporter.log("thread of TestNGModule4:"+threadId4,true);
		  
	  }
}
