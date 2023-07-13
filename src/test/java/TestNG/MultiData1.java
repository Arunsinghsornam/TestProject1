package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultiData1 extends LibGlobal{
	@DataProvider(name="Test Data")
	 public String[][] data() {
	String[][] dataa= new String[][] {{"Arunsingh@gmail.com","27101988"},{"Karthickarun@gmail.com","Arun@1988"},
	                                  {"karthickkarthick@gmail.com","Singh@1234"},{"karthickarun87@gmail.com","Arunsingh@gmail.com"}};
	return dataa;

}
	@Test(dataProvider="Test Data")
	private void logIn(String x,String y) {
		LaunchChromeBrowser();
		maximizeWindow();
		openAppUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		enterValue(userName, x);
		WebElement userPass = driver.findElement(By.id("pass"));
		enterValue(userPass, y);
		driver.findElement(By.name("login")).click();
		
		

	}
	
}
