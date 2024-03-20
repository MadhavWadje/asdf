package Com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Com.hrms.utility.Baseclass;

public class LogoutPage extends Baseclass{
static By logoutbtn = By.linkText("Logout");	
	
public static void logout() {
	driver.findElement(logoutbtn).click();
	Reporter.log("logout complete");
}
}
