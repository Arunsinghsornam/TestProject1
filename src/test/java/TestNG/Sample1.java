package TestNG;
import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 extends LibGlobal{
	long startTime=0;
	long endTime=0;
	
	@BeforeClass
	private void beforeClass() {
		LaunchChromeBrowser();
		maximizeWindow();
		//elementWait();
		

	}
	@Test
	private void tc_01() throws InterruptedException {
		openAppUrl("https://www.facebook.com/");
		WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newAccount.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Arun");
		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Singh");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("karthickarun87@gmail.com");
		Thread.sleep(3000);
		WebElement newPass = driver.findElement(By.name("reg_passwd__"));
		newPass.sendKeys("27101988");
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByIndex(26);
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select ss = new Select(month);
		ss.selectByIndex(9);
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select s1 = new Select(year);
		s1.selectByValue("1988");
		Thread.sleep(3000);
		WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		sex.click();
		Thread.sleep(3000);
		WebElement signUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signUp.click();
		Thread.sleep(3000);
		WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
		reEmail.sendKeys("karthickarun87@gmail.com");
		WebElement signUp1 = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signUp1.click();
	}
	@AfterClass
	private void afterClass() {
		long sum = endTime - startTime;
		System.out.println(sum);
		
		//closeBrowser();
	}
	@BeforeTest
	private void beforeMethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}
	@AfterTest
	private void afterMethod() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}

}
