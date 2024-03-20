package Com.hrms.Testscript;

import org.testng.annotations.Test;

import Com.hrms.pages.Loginpage;
import Com.hrms.pages.LogoutPage;
import Com.hrms.pages.Verifypage;
import Com.hrms.utility.Baseclass;

public class TC001 {
@Test
public static void tc001() {
	Baseclass.openappln();
	Loginpage.login("nareshit","nareshit");
	Verifypage.verifyTitle("HRMS");
LogoutPage.logout();	
	Baseclass.closeappln();
	
	
}
}
