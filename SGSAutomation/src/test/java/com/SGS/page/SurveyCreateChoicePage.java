package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourses.Constant;

public class SurveyCreateChoicePage {
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

	
	@FindBy(xpath = Constant.CHOICE_MODULE_MULTIPLE_CHOICE_XPATH)
	public WebElement multipleChoiceFrom;
	
	@FindBy(xpath = Constant.MULTIPLE_CHOICE_PASSWORD_DRAG_AND_DROP_XPATH)
	public WebElement multipleChoiceTo;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_MULTIPLE_CHOICE_TITLE_XPATH)
	public WebElement multipleChoicetitle;
	
	@FindBy(xpath = Constant.EXPAND)
	public WebElement expand;
	

	@FindBy(xpath = Constant.GROUPING_CHOICES1_XPATH)
	public WebElement groupingChoices1;
	
	@FindBy(xpath = Constant.GROUPING_CHOICES_XPATH)
	public WebElement groupingChoices;
	
	
	@FindBy(xpath = Constant.CREATE_SURVEY_TITLE_XPATH)
	public WebElement createsurveytitle;
	
	@FindBy(xpath = Constant.CREATE_SURVEY_BUTTON_XPATH)
	public WebElement createbutton;
	
	@FindBy(xpath = Constant.DELETE_XPATH)
	public WebElement Delete;
	
	@FindBy(xpath = Constant.WELCOME_LOGO_XPATH)
	public WebElement welcomeLogo;
	
	
	@FindBy(xpath = Constant.DELETE_QUESTIONS_XPATH)
	public WebElement DeleteQuestion;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_XPATH)
	public WebElement imageChoiceFrom;
	
	@FindBy(xpath = Constant.IMAGE_CHOICE_DRAG_AND_DROP_XPATH)
	public WebElement imageChoiceTo;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_TITLE_XPATH)
	public WebElement imageChoicetitle;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_IFRAME_XPATH)
	public WebElement iframeimageChoice;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement iframemultipleChoice;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_MULTIPLE_CHOICE_SAVE_XPATH)
	public WebElement multipleChoicesave;
	
	@FindBy(xpath = Constant.GROUPING_CHOICES_IMAGE_XPATH)
	public WebElement groupingImage;
	
	@FindBy(xpath = Constant.GROUPING_COLLECTORS_XPATH)
	public WebElement groupingCollectors;
	
	@FindBy(xpath = Constant.GROUPING_CHOICES_IMAGE_XPATH)
	public WebElement groupingChoicesImage;
	
	@FindBy(xpath = Constant.GROUPING_CHOICES1_IMAGE1_XPATH)
	public WebElement groupingChoicesImage1;
	
	@FindBy(xpath = Constant.SURVEYGAMEZ_GALLERY_XPATH)
	public WebElement surveygamezGallery;
	
	@FindBy(xpath = Constant.SURVEYGAMEZ_GALLERY1_XPATH)
	public WebElement surveygamezGallery1;
	
	@FindBy(xpath = Constant.GROUPING_COLLECTORS_XPATH)
	public WebElement groupingCollector;
	
	@FindBy(xpath = Constant.GROUPING_COLLECTORS1_XPATH)
	public WebElement groupingCollector1;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_SAVE_XPATH)
	public WebElement imageChoiceSave;
	
	@FindBy(xpath = Constant.DATAENTRY_LONG_TEXT_XPATH)
	public WebElement longTextFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_DRAG_AND_DROP_XPATH)
	public WebElement longTextTo;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_IFRAME_XPATH)
	public WebElement iframelongText;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_TITLE_XPATH)
	public WebElement longTexttitle;
	
	@FindBy(xpath = Constant.INFORMATION_SAVE_XPATH)
	public WebElement longTextSave;
	
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
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_XPATH)
	public WebElement informationAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement informationAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement informationAddTagNonSelectedApply;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH)
	public WebElement informationAddTagNonSelectedClose;
	
	
	
	
	
	
	public SurveyCreateChoicePage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);

}
	}
