package Com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import Com.hrms.utility.Baseclass;

public class Loginpage extends Baseclass{
	//objets/elements
	static By untxt = By.name("txtUserName");
	static By lntxt = By.name("txtPassword");
	static By loginbtn = By.name("Submit");

	//fun
	public static void login(String un,String pw) {
		driver.findElement(untxt).sendKeys(un);
		driver.findElement(lntxt).sendKeys(pw);
driver.findElement(loginbtn).click();
Reporter.log("login complete");
	}
}
