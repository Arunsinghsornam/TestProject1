package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultiData extends LibGlobal {
	String[][] data= {{"Arunsingh@gmail.com","27101988"},
	                  {"karthickarun@gmail.com","Arun@1988"},
	                   {"Arunkarthick@gmail.com","27101988"},
	                   {"karthickarun87@gmail.com","Arunsingh@1988"}};

	
	@DataProvider(name="login data")
	private String[][] logIn() {
		return data;
	}
		@Test(dataProvider="login data",retryAnalyzer=Rerun.class)
		private void faceBook(String uName,String uPass) {
			LaunchChromeBrowser();
			maximizeWindow();
			elementWait();
			openAppUrl("https://www.facebook.com/");
			WebElement uN= driver.findElement(By.id("email"));
			uN.sendKeys(uName);
			WebElement uP = driver.findElement(By.id("pass"));
			uP.sendKeys(uPass);
			driver.findElement(By.name("login")).click();
			
			 

		}

	}


