package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resourses.Constant;

public class SurveyCreateDataEntryPage {
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
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_XPATH)
	public WebElement shortTextFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_DRAG_AND_DROP_XPATH)
	public WebElement shortTextTo;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_IFRAME_XPATH)
	public WebElement iframeshortText;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_TITLE_XPATH)
	public WebElement shortTexttitle;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_SAVE_XPATH)
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
	
	@FindBy(xpath = Constant.DATAENTRY_LONG_TEXT_SAVE_XPATH)
	public WebElement longTextSave;
	
	@FindBy(xpath = Constant.DATAENTRY_LONG_TEXT_XPATH)
	public WebElement longTextFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_DRAG_AND_DROP_XPATH)
	public WebElement longTextTo;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_IFRAME_XPATH)
	public WebElement iframelongText;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_TITLE_XPATH)
	public WebElement longTexttitle;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_TAG_XPATH)
	public WebElement longTextTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_XPATH)
	public WebElement longTextAddTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_XPATH)
	public WebElement longTextAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement longTextAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement longTextAddTagNonSelectedApply;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement longTextAddTagNonSelectedClose;
	
	@FindBy(xpath = Constant.LONGTEXT_IMAGE_VIDEO_OTHER_OFF_XPATH)
	public WebElement longTextImageVideoOther;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_XPATH)
	public WebElement numberFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_DRAG_AND_DROP_XPATH)
	public WebElement numberTo;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_IFRAME_XPATH)
	public WebElement iframenumber;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_TITLE_XPATH)
	public WebElement numberttitle;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_SAVE_XPATH)
	public WebElement numberSave;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_MAXIMUM_VALUE_XPATH)
	public WebElement numberMaxValue;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBERT_MINIMUM_VALUE_XPATH)
	public WebElement numberMinValue;
	
	@FindBy(xpath = Constant.DATAENTRY_DATE_XPATH)
	public WebElement dateFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_DATE_DRAG_AND_DROP_XPATH)
	public WebElement dateTo;
	
	@FindBy(xpath = Constant.DATAENTRY_DATE_IFRAME_XPATH)
	public WebElement iframedate;
	
	@FindBy(xpath = Constant.DATAENTRY_DATE_TITLE_XPATH)
	public WebElement datettitle;
	
	@FindBy(xpath = Constant.DATAENTRY_NUMBER_SAVE_XPATH)
	public WebElement dateSave;
	
	@FindBy(xpath = Constant.DATAENTRY_UPLOAD_XPATH)
	public WebElement uploadFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_UPLOAD_DRAG_AND_DROP_XPATH)
	public WebElement uploadTo;
	
	@FindBy(xpath = Constant.DATAENTRY_UPLOAD_IFRAME_XPATH)
	public WebElement iframeupload;
	
	@FindBy(xpath = Constant.DATAENTRY_UPLOAD_TITLE_XPATH)
	public WebElement uploadttitle;
	
	@FindBy(xpath = Constant.DATAENTRY_UPLOAD_SAVE_XPATH)
	public WebElement uploadSave;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_XPATH)
	public WebElement passwordFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_DRAG_AND_DROP_XPATH)
	public WebElement passwordTo;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_IFRAME_XPATH)
	public WebElement iframepassword;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_TITLE_XPATH)
	public WebElement passwordttitle;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_ENTER_XPATH)
	public WebElement dataentryPassword;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_SAVE_XPATH)
	public WebElement dataentryPasswordSave;
	
	@FindBy(xpath = Constant.PASSWORD_TAG_XPATH)
	public WebElement passwordTag;
	
	@FindBy(xpath = Constant.PASSWORD_ADD_TAG_XPATH)
	public WebElement passwordAddTag;
	
	@FindBy(xpath = Constant.PASSWORD_ADD_TAG_NONSELECTED_XPATH)
	public WebElement passwordAddTagNonSelected;
	
	@FindBy(xpath = Constant.PASSWORD_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement passwordAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.PASSWORD_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement passwordAddTagNonSelectedApply;
	
	@FindBy(xpath = Constant.DATAENTRY_PASSWORD_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH)
	public WebElement passwordAddTagNonSelectedClose;
	
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_XPATH)
	public WebElement locationFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_DRAG_AND_DROP_XPATH)
	public WebElement locationTo;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_IFRAME_XPATH)
	public WebElement iframelocation;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_TITLE_XPATH)
	public WebElement locationttitle;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_SAVE_XPATH)
	public WebElement locationSave;
	
	
	

	
	
}
