package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//@enable it shows method pass or not if we give enable=true then method enable if we pass enable=false methpd will be disable
	@Test(description = "Login Method",enabled = true)
	public void method1() {
		Reporter.log("method1 from flag1",true);
	}


	@Test(description = "Logout Method",enabled = true)
	public void method2() {
		Reporter.log("method2 from flag1",true);
	}
}
