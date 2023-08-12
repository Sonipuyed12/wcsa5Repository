package testNGExecutation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGMethod3 {
	@Test
	  public void TestNGMethod5() {
		  long threadId5 = Thread.currentThread().getId();
		  Reporter.log("thread of TestNGModule5:"+threadId5,true);
		  
	  }
	  @Test
	  public void TestNGMethod6() {
		  long threadId6 = Thread.currentThread().getId();
		  Reporter.log("thread of TestNGModule6:"+threadId6,true);
		  
	  }
}
