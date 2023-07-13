package TestNG;
import java.util.Set;

import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class amazonSearch extends LibGlobal{
	@BeforeClass
	private void beforeClass() {
		LaunchChromeBrowser();
		maximizeWindow();
		

	}
	@AfterClass
	private void afterClass() {
		System.out.println("verified done");

	}
	@Test
	private void tc_01() {
		openAppUrl("http://www.amazon.in");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14 pro",Keys.ENTER);
		WebElement iphone14Pro = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black'])[1]"));
		iphone14Pro.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String eachWindow : allWindow) {
			if(!parentWindow.equals(allWindow)) {
				driver.switchTo().window(eachWindow);
			}
			
			
		}
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
	}
	

}
