package TestNG;
import java.util.Set;

import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QRcode extends LibGlobal {
	
	@BeforeClass
	private void beforeClass() {
		LaunchChromeBrowser();
		maximizeWindow();
		elementWait();
		
		

	}
	@AfterClass
	private void afterClass() {
		System.out.println("===test done properly");
		

	}
	@Test
	private void tc_01() {
		openAppUrl("http://www.amazon.in/");
		WebElement logIn = driver.findElement(By.id("nav-link-accountList"));
		logIn.click();
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("9629662742");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement userPass = driver.findElement(By.id("ap_password"));
		userPass.sendKeys("Arunsingh@1988");
		WebElement signIn = driver.findElement(By.id("signInSubmit"));
		signIn.click();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14 pro",Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black'])[1]"));
		link.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String eachwindow : allWindow) {
			if(!parentWindow.equals(allWindow)) {
				driver.switchTo().window(eachwindow);
			}
			
		}
		//WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		//addCart.click();

	}

}
