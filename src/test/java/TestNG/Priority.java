package TestNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=50)
	private void searchHotel() {
		

	}
	@Test(priority=40)
	private void logIn() {
		

	}
	@Test(priority=30)
	private void selectHotel() {
		

	}
	@Test(priority=-50)
	private void bookHotel() {
		

	}
	@Test(priority=-40,invocationCount=5)
	private void bookingConformation() {



	}

}
