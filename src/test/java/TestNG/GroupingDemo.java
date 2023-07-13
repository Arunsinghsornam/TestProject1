package TestNG;
import org.libglobal.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingDemo extends LibGlobal{
	
	@Test(groups="Toyota")
	private void tc_01() {
		System.out.println("Hi its innova crysta");

	}
	@Test(groups="Toyota")
	private void tc_02() {
		System.out.println("Hi its Etios Liva");

	}
	@Test(groups="Toyota")
	private void tc_03() {
		System.out.println("Hi this is Fortuner");

	}
	@Test(groups="Hyundai")
	private void tc_04() {
		System.out.println("Hi this is all new verna");

	}
	@Test(groups="Hyundai")
	private void tc_05() {
		System.out.println("Hi this is creta");

	}
	@Test(groups="Hyundai")
	private void tc_06() {
		System.out.println("hi this i10");
	}
	@Test(groups="Maruthi")
	private void tc_07() {
		System.out.println("Hi this is zen");

	}
	@Test(groups="Maruthi")
	private void tc_08() {
		System.out.println("Hi this is Ciaz");

	}
	@Test(groups="Maruthi")
	private void tc_09() {
		System.out.println("Hi this is Breeza");

	}

}
