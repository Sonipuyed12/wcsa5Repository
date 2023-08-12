package testNGAnnotationFlags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void loginmethod()
  {
	  System.out.println("it is use to perform login...!!");
  }
  
  @Test(dependsOnMethods = "loginmethod")
  public void createusermethod() 
  {
	  System.out.println("it is to create user");
  }
  
  
  @Test(dependsOnMethods ="createusermethod" )
  public void logoutethod()
  {
	  System.out.println("it is use to perform logout....!!");
  }
}
