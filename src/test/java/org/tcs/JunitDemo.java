package org.tcs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.libglobal.*;

public class JunitDemo extends LibGlobal{
	@BeforeClass
	public static void beforeClass() {
		LaunchChromeBrowser();
		maximizeWindow();

	}
	@AfterClass
	public static void afterClass() {
		//closeBrowser();

	}
	@Before
	public void beforeTest() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}
	@After
	public void afterTest() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}
	@Test
	public void test_01() {
		openAppUrl("https://www.facebook.com");
		WebElement userName = driver.findElement(By.id("email"));
		enterValue(userName, "karthickarun87@gmail.com");
		WebElement userPass = driver.findElement(By.id("pass"));
		enterValue(userPass, "Arunsingh@1988");
		WebElement button = driver.findElement(By.name("login"));
		elementClick(button);

	}
	
}
