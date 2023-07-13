package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CrossBrowser extends LibGlobal{
	@Parameters({"browserName"})
	@Test(retryAnalyzer=Rerun.class)
	private void tc_01(String browserName) {
		if(browserName.equals("chrome")) {
			System.out.println("===chrome browser===");
			LaunchChromeBrowser();
			
		}else if(browserName.equals("firefox")) {
			System.out.println("===firefox browser===");
		   LaunchFirefoxBrowser();
			
		}if(browserName.equals("edge")) {
			System.out.println("===edge browser===");
			LaunchEdgeBrowser();
		}
		maximizeWindow();
		elementWait();
		openAppUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		enterValue(userName, "karthickarun87@gmail.com");
		WebElement userPass = driver.findElement(By.id("pass"));
		enterValue(userPass, "Arunsingh@1988");
		WebElement button = driver.findElement(By.name("login"));
		elementClick(button);
		

	}

}
