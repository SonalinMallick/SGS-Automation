package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourses.Constant;

public class LoginPage {
WebDriver driver;
	
	
    @FindBy(xpath = Constant.EMAIL_XPATH)
	public  WebElement email;

	@FindBy(xpath = Constant.PASSWORD_XPATH)
	public  WebElement password;

	@FindBy(xpath = Constant.SIGNIN_XPATH)
	public  WebElement signin;
	
	@FindBy(xpath = Constant.LOGIN_XPATH)
	public  WebElement login;
	
	@FindBy(xpath = Constant.SIGNOUT_XPATH)
	public  WebElement signout;
	
	@FindBy(xpath = Constant.SUBHRAKANTSAHOO_XPATH)
	public  WebElement subhrakantSahoo;
	
	@FindBy(xpath = Constant.WRONG_ALPHANUMERIC_EMAIL)
	public  WebElement wrongAlphanumericEmail;
	
	@FindBy(xpath = Constant.WRONG_ALPHANUMERIC_PASSWORD)
	public  WebElement wrongAlphanumericPassword;
	
	@FindBy(xpath = Constant.WRONG_NUMERIC_EMAIL)
	public  WebElement wrongNumericEmail;
	
	@FindBy(xpath = Constant.WRONG_NUMERIC_PASSWORD)
	public  WebElement wrongNumericPassword;
	
	@FindBy(xpath = Constant.WRONG_SPECIAL_CHARACTER_EMAIL)
	public  WebElement wrongSpecialCharacterEmail;
	
	@FindBy(xpath = Constant.WRONG_SPECIAL_CHARACTER_PASSWORD)
	public  WebElement wrongSpecialCharacterPassword;
	
	@FindBy(xpath = Constant.PASSWORD_IS_REQUIRES_XPATH)
	public  WebElement Passwordisrequired;
	
	@FindBy(xpath = Constant.EMAIL_IS_REQUIRES_XPATH)
	public  WebElement 	emailisrequired;
	
	@FindBy(xpath = Constant.SURVEY_XPATH)
	public  WebElement 	survey;
	


	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		

	}


}
