package TestNG;

import org.libglobal.LibGlobal;
import org.testng.annotations.Test;

public class Depends extends LibGlobal{
	@Test(dependsOnMethods="meeraArunsingh",invocationCount=5)
	private void arunSingh() {
		System.out.println("Arun singh");

	}
	@Test
	private void meeraArunsingh() {
		System.out.println("Meera");
		
		

	}

}
