package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourses.Constant;

public class SignupPage {
	WebDriver driver;
	Constant data;
	public SignupPage spage;

	@FindBy(xpath = Constant.NAME_XPATH)
	public WebElement name;

	@FindBy(xpath = Constant.EMAIL_XPATH)
	public WebElement email;

	@FindBy(xpath = Constant.PASSWORD_XPATH)
	public WebElement password;
	
	@FindBy(xpath = Constant.CONFIRM_PASSWORD_XPATH)
	public WebElement confirmPassword;

	@FindBy(xpath = Constant.SIGNUP_XPATH)
	public WebElement signUp;
	
	@FindBy(xpath = Constant.SIGNUP_SUBMIT_XPATH)
	public WebElement signUpSubmit;
	
	@FindBy(xpath = Constant.SURVEY_XPATH)
	public  WebElement 	survey;
	

	

	public SignupPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);

}
}
