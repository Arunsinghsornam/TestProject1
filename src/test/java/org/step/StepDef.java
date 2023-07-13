package org.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.libglobal.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StepDef extends LibGlobal {
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	  LaunchChromeBrowser();
	  maximizeWindow();
	  openAppUrl("https://www.facebook.com/");
	}

	@When("user enthe the username and password")
	public void user_enthe_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> list= dataTable.asMaps();
	   Map<String, String> map = list.get(2);
	   WebElement uName = driver.findElement(By.id("email"));
	   uName.sendKeys(map.get("username"));
	   WebElement uPass = driver.findElement(By.id("pass"));
	   uPass.sendKeys(map.get("password"));
	   
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	   System.out.println("hello");
	}

	@Then("user verify the home page")
	public void user_verify_the_home_page() {
	  System.out.println("bye");
	}




}
