package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Functional TestCase")
  public void ft1() 
  { 
	  Reporter.log("FT1",true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st1() 
  { 
	  Reporter.log("ST1",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it1() 
  { 
	  Reporter.log("IT1",true);
  }
  //.......................................................................................//
  @Test(groups = "Functional TestCase")
  public void ft2() 
  { 
	  Reporter.log("FT2",true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st2() 
  { 
	  Reporter.log("ST2",true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it2() 
  { 
	  Reporter.log("IT2",true);
  }
  
  //......................................................................................//
}
