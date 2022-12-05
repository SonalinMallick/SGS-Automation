package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourses.Constant;

public class ProfilePage {
WebDriver driver;

	
	@FindBy(xpath = Constant.EMAIL_XPATH)
	public WebElement email;

	@FindBy(xpath = Constant.PASSWORD_XPATH)
	public WebElement password;

	@FindBy(xpath = Constant.SIGNIN_XPATH)
	public WebElement signin;
	
	@FindBy(xpath = Constant.LOGIN_XPATH)
	public WebElement login;
	
	@FindBy(xpath = Constant.SUBHRAKANTSAHOO_XPATH)
	public WebElement subhrakantSahoo;

	@FindBy(xpath = Constant.PROFILE_XPATH)
	public WebElement profile;
	
	@FindBy(xpath = Constant.SIGNOUT_XPATH)
	public  WebElement logout;
	

	@FindBy(xpath = Constant.PERSONALIZATION_XPATH)
	public WebElement personalization;
	
	@FindBy(xpath = Constant.PERSONALIZATION_FINAL_RESULT_XPATH)
	public WebElement personalizationfinalresult;


	@FindBy(xpath = Constant.SUBDOMAIN_CHECKBOX_XPATH)
	public WebElement Subdomainrequired_checkbox;

	@FindBy(xpath = Constant.SUBDOMAIN_REQUIRED_XPATH)
	public WebElement Subdomainrequired;

	@FindBy(xpath = Constant.SAVE_XPATH)
	public WebElement save;

	@FindBy(xpath = Constant.DEVLOPER_OPTION_XPATH)
	public WebElement developerOptions;
	
	@FindBy(xpath = Constant.COPY_API_ID_XPATH)
	public WebElement copyApiId;
	
	@FindBy(xpath = Constant.COPY_API_SECRET_XPATH)
	public WebElement copyapiSecret;
	
	@FindBy(xpath = Constant.CHANGE_PASSWORD_XPATH)
	public WebElement changePassword;
	
	@FindBy(xpath = Constant.CHANGE_CURRENT_PASSWORD_XPATH)
	public WebElement currentpassword;
	
	@FindBy(xpath = Constant.CHANGE_NEW_PASSWORD_XPATH)
	public WebElement newpassword;
	
	@FindBy(xpath = Constant.CHANGE_CONFIRMED_PASSWORD_XPATH)
	public WebElement confirmnewpassword;
	
	@FindBy(xpath = Constant.CHANGE_PASSWORD_UPDATE_XPATH)
	public WebElement update;
	
	@FindBy(xpath = Constant.CHANGE_PASSWORD_CANCEL_XPATH)
	public WebElement cancel;
	
	@FindBy(xpath = Constant.TAG_XPATH)
	public WebElement tag;
	
	@FindBy(xpath = Constant.CREATE_TAG_XPATH)
	public WebElement Createtag;

	@FindBy(xpath = Constant.TAG_NAME_XPATH)
	public WebElement TagName;
	
	@FindBy(xpath = Constant.TAG_SAVE_XPATH)
	public WebElement Save;
	
	@FindBy(xpath = Constant.SURVEY_XPATH)
	public  WebElement 	survey;
	
	
	

	public ProfilePage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}


}
