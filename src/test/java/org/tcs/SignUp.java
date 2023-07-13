package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.libglobal.*;

public class SignUp extends LibGlobal {
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement newPass;
	
	@FindBy(name="birthday_day")
	private WebElement date;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement radioFemale;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement radioMale;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement radioCustom;
	
	@FindBy(name="websubmit")
	private WebElement signUp;
	
	@FindBy(xpath="//a[text()='Already have an account?']")
	private WebElement alreadyAccount;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNewPass() {
		return newPass;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getRadioFemale() {
		return radioFemale;
	}

	public WebElement getRadioMale() {
		return radioMale;
	}

	public WebElement getRadioCustom() {
		return radioCustom;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getAlreadyAccount() {
		return alreadyAccount;
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement button;
	
	public WebElement getButton() {
		return button;
	}

	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
	}
