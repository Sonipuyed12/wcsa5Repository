package testNGAnnotationFlags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  @Test
  public void loginmethod()
  {
	  System.out.println("it is use to perform login...!!");
  }
  
  @Test(dependsOnMethods = "loginmethod")
  public void createusermethod() 
  {
	  Assert.fail();
	  System.out.println("it is to create user");
  }
  
  
  @Test(dependsOnMethods ="createusermethod",alwaysRun = true )
  public void logoutethod()
  {
	 // Assert.fail();
	  System.out.println("it is use to perform logout....!!");
  }
}
