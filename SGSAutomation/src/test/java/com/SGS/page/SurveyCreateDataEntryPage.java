package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resourses.Constant;

public class SurveyCreateDataEntryPage {
	WebDriver driver;
	
	@FindBy(xpath = Constant.PASSWORD_XPATH)
	public WebElement password;

	@FindBy(xpath = Constant.SIGNIN_XPATH)
	public WebElement signin;
	
	@FindBy(xpath = Constant.LOGIN_XPATH)
	public WebElement login;
	
	@FindBy(xpath = Constant.SUBHRAKANTSAHOO_XPATH)
	public WebElement subhrakantSahoo;
	
	@FindBy(xpath = Constant.CREATE_NEW_SURVEY_XPATH)
	public WebElement createsurvey;
	
	@FindBy(xpath = Constant.SIGNOUT_XPATH)
	public  WebElement logout;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_TITLE_XPATH)
	public WebElement createsurveytitle;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_BUTTON_XPATH)
	public WebElement createbutton;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_XPATH)
	public WebElement shortTextFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_DRAG_AND_DROP_XPATH)
	public WebElement shortTextTo;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_IFRAME_XPATH)
	public WebElement iframeshortText;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_TITLE_XPATH)
	public WebElement shortTexttitle;
	
	@FindBy(xpath = Constant.INFORMATION_SAVE_XPATH)
	public WebElement shortTextSave;
	
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_TAG_XPATH)
	public WebElement shortTextTag;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_ADD_TAG_XPATH)
	public WebElement shortTextAddTag;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_XPATH)
	public WebElement shortTextAddTagNonSelected;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement shortTextAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement shortTextAddTagNonSelectedApply;
	
	
}
