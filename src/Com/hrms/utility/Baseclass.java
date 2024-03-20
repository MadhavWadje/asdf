package Com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class Baseclass {
 public static WebDriver driver;

public static void openappln() {
driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Reporter.log("open app");
}
	
public static void closeappln() {
	driver.quit();
Reporter.log("app close");
}	
}
