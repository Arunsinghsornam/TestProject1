package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.libglobal.*;
import org.openqa.selenium.By;

public class Parameter  extends LibGlobal{
	@Parameters({"username","password"})
	@Test
	private void logIn(String username,String password) {
		LaunchChromeBrowser();
		maximizeWindow();
		openAppUrl("https://www.facebook.com/");
		enterValue(driver.findElement(By.id("email")),username);
		enterValue(driver.findElement(By.id("pass")),password);

	}
	

}
