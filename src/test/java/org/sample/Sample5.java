package org.sample;
import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample5 extends LibGlobal {
	public static void main(String[] args) {
		LaunchFirefoxBrowser();
		maximizeWindow();
		elementWait();
		openAppUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		enterValue(userName, "karthickarun87@gmail.com");
		WebElement userPass = driver.findElement(By.id("pass"));
		enterValue(userPass,"Arunsingh@1988");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}

}
