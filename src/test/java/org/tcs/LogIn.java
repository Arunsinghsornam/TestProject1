package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.libglobal.*;

public class LogIn extends LibGlobal {
	@FindBy(id="email")
	private WebElement txtUesrName;
	
	@FindBy(id="pass")
	private WebElement txtUserPass;
	
	public WebElement getTxtUesrName() {
		return txtUesrName;
	}

	public WebElement getTxtUserPass() {
		return txtUserPass;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

	@FindBy(name="login")
	private WebElement logInButton;
	
	public LogIn() {
		PageFactory.initElements(driver, this);
		
	}
	}

