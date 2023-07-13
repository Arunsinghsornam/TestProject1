package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.libglobal.*;


public class Facebook extends LibGlobal {
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
	public void before() {
    long startTime = System.currentTimeMillis();
    System.out.println(startTime);

	}
	@After
	public void after() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
}
	@Ignore
	@Test
	public void tc_01() {
    openAppUrl("https://www.facebook.com/");
    
    LogIn l = new LogIn();
    l.getTxtUesrName().sendKeys("karthickarun@gmail.com");
    l.getTxtUserPass().sendKeys("Arunsingh@1988");
    l.getLogInButton().click();

	}
	//@Ignore
	@Test
	public void tc_02() {
		openAppUrl("https://www.facebook.com/");
		SignUp s = new SignUp();
		s.getButton().click();
		s.getFirstName().sendKeys("Arun");
		s.getLastName().sendKeys("Singh");
		s.getEmail().sendKeys("karthickarun@gmail.com");
		s.getNewPass().sendKeys("27101988");
		selectByIndex(s.getDate(),26);
		selectByIndex(s.getMonth(),9);
		selectByIndex(s.getYear(), 9);
		
		

	}
}
