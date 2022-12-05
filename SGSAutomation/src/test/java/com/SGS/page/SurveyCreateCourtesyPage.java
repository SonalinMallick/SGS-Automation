package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resourses.Constant;

public class SurveyCreateCourtesyPage {
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
	
	@FindBy(xpath = Constant.CREATE_NEW_SURVEY_XPATH)
	public WebElement createsurvey;
	
	@FindBy(xpath = Constant.SIGNOUT_XPATH)
	public  WebElement logout;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_TITLE_XPATH)
	public WebElement createsurveytitle;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_BUTTON_XPATH)
	public WebElement createbutton;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_SEARCH_XPATH)
	public WebElement createsurveysearch;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_BACK_TO_HOME_XPATH)
	public WebElement backtohome;
	
	@FindBy(xpath = Constant.SEARCH_AUTOMATION_XPATH)
	public WebElement searchautomation;
	
	@FindBy(xpath = Constant.AUTOMATION_XPATH)
	public WebElement automation;
	
	@FindBy(xpath = Constant.DRAG_AND_DROP_WELCOME_XPATH)
	public WebElement dragAndDropWelcome;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_XPATH)
	public WebElement welcome;
	
	@FindBy(xpath = Constant.WELCOME_TITLE_XPATH)
	public WebElement welcomeTitle;
	
	@FindBy(xpath = Constant.WELCOME_DESCRIPTION_OFF_XPATH)
	public WebElement welcomeDescriptionOff;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_XPATH)
	public WebElement welcomeFrom;
	
	@FindBy(xpath = Constant.DRAG_AND_DROP_WELCOME_XPATH)
	public WebElement welcomeTo;
	
	
	@FindBy(xpath = Constant.EXPAND)
	public WebElement expand;
	

	@FindBy(xpath = Constant.WELCOME_IFRAME_XPATH)
	public WebElement iFrameWelcome;
	
	@FindBy(xpath = Constant.WELCOME_TITLE_XPATH)
	public WebElement iFrameWelcomeTitle;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_XPATH)
	public WebElement informationFrom;
	
	@FindBy(xpath = Constant.DRAG_AND_DROP_INFORMATION_XPATH)
	public WebElement informationTo;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_IFRAME_XPATH)
	public WebElement iframeinformation;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_TITLE_XPATH)
	public WebElement informationtitle;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_HELLOPAGE_XPATH)
	public WebElement informationhellopage;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_CONTINUE_XPATH)
	public WebElement informatiocontinuepage;
	
	@FindBy(xpath = Constant.INFORMATION_SAVE_XPATH)
	public WebElement informationSave;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_TAG_XPATH)
	public WebElement informationTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_XPATH)
	public WebElement informationAddTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_XPATH)
	public WebElement informationAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement informationAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement informationAddTagNonSelectedApply;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH)
	public WebElement informationAddTagNonSelectedClose;
	
	@FindBy(xpath = Constant.INFORMATION_DELETE_XPATH)
	public WebElement informationDelete;
	
	@FindBy(xpath = Constant.INFORMATION_DELETE_QUESTIONS_XPATH)
	public WebElement informationDeleteQuestions;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_LOGIC_COPY_XPATH)
	public WebElement informationCopy;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_LOGIC_XPATH)
	public WebElement informationLogic;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_CHOOSE_NEXT_LOGIC_JUMP_XPATH)
	public WebElement chooseNextLogicJump;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_LOGIC_SAVE_XPATH)
	public WebElement chooseNextLogicJumpSave;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_LOGIC_CLOSE_XPATH)
	public WebElement chooseNextLogicJumpClose;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_XPATH)
	public WebElement thankyouFrom;
	
	@FindBy(xpath = Constant.THANKYOU_DRAGANDDROP_XPATH)
	public WebElement thankyouTo;
	
	@FindBy(xpath = Constant.THANKYOU_IFRAME_XPATH)
	public WebElement iframethankyou;
	
	@FindBy(xpath = Constant.THANKYOU_TITLE_XPATH)
	public WebElement thankyoutitle;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_SAVE_XPATH)
	public WebElement thankyouSave;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_DELETE_XPATH)
	public WebElement thankyouDelete;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_DELETE_QUESTIONS_XPATH)
	public WebElement thankyouDeleteQuestions;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_TAG_XPATH)
	public WebElement thankyouTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_XPATH)
	public WebElement thankyouAddTag;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_ADD_TAG_NONSELECTED_XPATH)
	public WebElement thankyouAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement thankyouAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement thankyouAddTagNonSelectedApply;
	
	@FindBy(xpath = Constant.COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH)
	public WebElement thankyouAddTagNonSelectedClose;
	
	
	
	
	
	
	
	
	
	

}
