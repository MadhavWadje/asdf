package Com.hrms.pages;
import org.testng.Reporter;
import Com.hrms.utility.Baseclass;

public class Verifypage extends Baseclass{
public static void  verifyTitle(String title) {
	if(driver.getTitle().equals(title)) {
		Reporter.log("Title Matched");
	}
	else {
		Reporter.log("title not matched");
		Reporter.log(driver.getTitle());
	}
}
}
