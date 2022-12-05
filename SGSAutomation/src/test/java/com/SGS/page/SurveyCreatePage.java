package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resourses.Constant;

public class SurveyCreatePage {
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
	
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_TAG_XPATH)
	public WebElement WelcomeTag;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_XPATH)
	public WebElement WelcomeAddTag;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_XPATH)
	public WebElement WelcomeAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement WelcomeAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement WelcomeAddTagNonSelectedAutomationApply;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH)
	public WebElement WelcomeAddTagNonSelectedAutomationCancel;

	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH)
	public WebElement WelcomeTagDelete;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH)
	public WebElement WelcomeTagConfirmDelete;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH)
	public WebElement AddNonselectedAutomationApplyClose;
	
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_SURVEY_XPATH)
	public WebElement Duplicateanexistingsurvey;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE_XPATH)
	public WebElement DuplicateanexistingsurveyTitle;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE)
	public WebElement DuplicateanexistingsurveyTitleName;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_SELECT_SURVEY_XPATH)
	public WebElement DuplicateanexistingSelectsurvey;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_CREATE_BUTTON_XPATH)
	public WebElement  DuplicateanexistingCreateButton;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_CANCEL_BUTTON_XPATH)
	public WebElement  DuplicateanexistingCancelButton;
	
	@FindBy(xpath = Constant.PICK_QUESTIONS_FROM_OTHER_SURVEY_XPATH)
	public WebElement  PickQuestionsFromOtherSurvey;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_SURVEY_XPATH)
	public WebElement  SearchCriteriaSelectSurvey;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_SURVEY_AUTOMATION_XPATH)
	public WebElement SearchCriteriaSelectSurveyAutomation;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_CLICK_TO_ADD_TAG_XPATH)
	public WebElement SearchCriteriaClickToAddTag;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_SURVEY_RETRIVE_QUESTIONS_XPATH)
	public WebElement SearchCriteriaRetriveQuestions;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_XPATH)
	public WebElement SearchCriteriaSelectNonSelectedTag;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_SELECT_AUTOMATION_XPATH)
	public WebElement SearchCriteriaSelectNonSelectedTagClickAutomation;
	
	@FindBy(xpath = Constant.SELECT_TAG_NON_SELECTED_CLICK_TO_ADD_XPATH)
	public WebElement SearchCriteriaSelectNonSelectedTagAdd;
	
	@FindBy(xpath = Constant.DUPLICATE_OF_AN_EXITING_SURVEY_RETRIVE_QUESTIONS_XPATH)
	public WebElement SearchCriteriaSelectNonSelectedTagCancel;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_SURVEY_XPATH)
	public WebElement pickFromOthersurvey;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_SURVEY_PROCEED_XPATH)
	public WebElement pickFromOthersurveyProceed;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_SURVEY_CANCEL_XPATH)
	public WebElement pickFromOthersurveyCancel;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_SURVEY_TITLE_XPATH)
	public WebElement pickFromOthersurveyTitle;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_SURVEY_SELECT_SURVEY_XPATH)
	public WebElement pickFromOthersurveySelectSurvey;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_SURVEY_SELECT_AUTOMATION_XPATH)
	public WebElement pickFromOthersurveySelectSurveyAutomation;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_SELECT_AUTOMATION_XPATH)
	public WebElement pickFromOthersurveySelectnonSelectedAutomation;
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_SELECT_AUTOMATION_ADD_XPATH)
	public WebElement pickFromOthersurveySelectnonSelectedAutomationAdd;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_TAG_XPATH)
	public WebElement DuplicateanexistingWelcomeTag;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_XPATH)
	public WebElement DuplicateanexistingWelcomeAddTag;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_XPATH)
	public WebElement DuplicateanexistingWelcomeAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement DuplicateanexistingWelcomeAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement DuplicateanexistingWelcomeAddTagNonSelectedAutomationApply;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH)
	public WebElement DuplicateanexistingWelcomeAddTagNonSelectedAutomationCancel;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH)
	public WebElement DuplicateanexistingWelcomeTagDelete;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH)
	public WebElement DuplicateanexistingWelcomeTagConfirmDelete;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_SAVE_IFRAME)
	public WebElement saveiframe;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_SAVE_XPATH)
	public WebElement save;
	
	@FindBy(xpath = Constant.INTERACTIVE_GROUPING_SAVE_XPATH)
	public WebElement groupingsave;
	
	
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
	
	@FindBy(xpath = Constant.CONFIGURATION_XPATH)
	public WebElement configuration;
	
	@FindBy(xpath = Constant.SECURE_DATABASE_XPATH)
	public WebElement secureDatabase;
	
	@FindBy(xpath = Constant.SAVE_GENERAL_SETTINS_XPATH)
	public WebElement saveGeneralSettins;
	
	@FindBy(xpath = Constant.ASSESSMENT_XPATH)
	public WebElement assessment;
	
	@FindBy(xpath = Constant.ASSESSMENT_TITLE_XPATH)
	public WebElement assessmentTitle;
	
	@FindBy(xpath = Constant.ASSESSMENT_CANCEL_XPATH)
	public WebElement assessmentCancel;
	
	@FindBy(xpath = Constant.ASSESSMENT_CREATE_XPATH)
	public WebElement assessmentCreate;
	
	@FindBy(xpath = Constant.WELCOME_LOGO_XPATH)
	public WebElement welcomeLogo;
	
	
	
	@FindBy(xpath = Constant.SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_XPATH)
	public WebElement selectNonselected;
	
	@FindBy(xpath = Constant.INTERACTIVE_GROUPING_XPATH)
	public WebElement groupingFrom;
	
	@FindBy(xpath = Constant.INTERACTIVE_DRAGANDDROP_GROUPING_XPATH)
	public WebElement groupingTo;
	
	@FindBy(xpath = Constant.INTERACTIVE_GROUPING_IFRAME_XPATH)
	public WebElement iframegrouping;
	
	@FindBy(xpath = Constant.INTERACTIVE_GROUPING_TITLE_XPATH)
	public WebElement iframegroupingTitle;
	
	@FindBy(xpath = Constant.GROUPING_CHOICES_XPATH)
	public WebElement groupingChoices;
	
	@FindBy(xpath = Constant.GROUPING_CHOICES1_XPATH)
	public WebElement groupingChoices1;
	
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
	
	
	@FindBy(xpath = Constant.GROUPING_TAG_XPATH)
	public WebElement groupingTag;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_XPATH)
	public WebElement groupingAddTag;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_NONSELECTED_XPATH)
	public WebElement groupingAddNonselectedTag;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement groupingAddNonselectedAutomation;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement groupingAddNonselectedAutomationApply;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH)
	public WebElement groupingAddNonselectedAutomationApplyDelete;
	
	@FindBy(xpath = Constant.GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH)
	public WebElement groupingAddNonselectedAutomationApplyClose;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_DELETE_XPATH)
	public WebElement welcomeDelete;
	
	@FindBy(xpath = Constant.WELCOME_IMAGE_VIDEO_OTHERCONTENT_OFF_XPATH)
	public WebElement imageVideoOtherContent;
	
	@FindBy(xpath = Constant.COURTESY_WELCOME_DELETE_QUESTIONS_XPATH)
	public WebElement welcomeDeleteQuestion;
	
	@FindBy(xpath = Constant.PICK_FROM_OTHER_ASSESSMENT_XPATH)
	public WebElement pickfromOtherAssessment;
	
	@FindBy(xpath = Constant.PREVIEW_XPATH)
	public WebElement preview;
	
	@FindBy(xpath = Constant.PREVIEW_CLOSE_XPATH)
	public WebElement previewClose;
	
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
	
	@FindBy(xpath = Constant.INFORMATION_SAVE_XPATH)
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
	
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_XPATH)
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
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_XPATH)
	public WebElement questionGroupFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_DRAG_AND_DROP_XPATH)
	public WebElement questionGroupTo;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_IFRAME_XPATH)
	public WebElement iframequestionGroup;
	
	@FindBy(xpath = Constant.DATAENTRY_SHORT_TEXT_TITLE_XPATH)
	public WebElement questionGrouptitle;
	
	@FindBy(xpath = Constant.INFORMATION_SAVE_XPATH)
	public WebElement questionGroupSave;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_TAG_XPATH)
	public WebElement questionGroupTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_XPATH)
	public WebElement questionGroupAddTag;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_XPATH)
	public WebElement questionGroupAddTagNonSelected;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELED_AUTOMATION_XPATH)
	public WebElement questionGroupAddTagNonSelectedAutomation;
	
	@FindBy(xpath = Constant.COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH)
	public WebElement questionGroupAddTagNonSelectedApply;
	
	
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
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_XPATH)
	public WebElement locationFrom;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_DRAG_AND_DROP_XPATH)
	public WebElement locationTo;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_IFRAME_XPATH)
	public WebElement iframelocation;
	
	@FindBy(xpath = Constant.DATAENTRY_LOCATION_TITLE_XPATH)
	public WebElement locationttitle;
	
	@FindBy(xpath = Constant.INTERACTIVE_RANKING_XPATH)
	public WebElement rankingFrom;
	
	@FindBy(xpath = Constant.INTERACTIVE_DRAGANDDROP_RANKING_XPATH)
	public WebElement rankingTo;
	
	@FindBy(xpath = Constant.INTERACTIVE_RANKING_TITLE_XPATH)
	public WebElement rankingttitle;
	

	@FindBy(xpath = Constant.INTERACTIVE_RANKING_IFRAME_XPATH)
	public WebElement iframeranking;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_XPATH)
	public WebElement matchingFrom;
	
	@FindBy(xpath = Constant.INTERACTIVE_DRAGANDDROP_MATCHING_XPATH)
	public WebElement matchingTo;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_TITLE_XPATH)
	public WebElement matchingtitle;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement iframematching;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset1first;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset1second;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset2first;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset2second;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset1image1;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset1image2;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement matchingoptionset2image1;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_MULTIPLE_CHOICE_XPATH)
	public WebElement multipleChoiceFrom;
	
	@FindBy(xpath = Constant.MULTIPLE_CHOICE_PASSWORD_DRAG_AND_DROP_XPATH)
	public WebElement multipleChoiceTo;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_MULTIPLE_CHOICE_TITLE_XPATH)
	public WebElement multipleChoicetitle;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement iframemultipleChoice;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_XPATH)
	public WebElement imageChoiceFrom;
	
	@FindBy(xpath = Constant.IMAGE_CHOICE_DRAG_AND_DROP_XPATH)
	public WebElement imageChoiceTo;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_TITLE_XPATH)
	public WebElement imageChoicetitle;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_IFRAME_XPATH)
	public WebElement iframeimageChoice;
	
	@FindBy(xpath = Constant.LONGTEXT_DELETE_XPATH)
	public WebElement longTextDelete;
	
	@FindBy(xpath = Constant.LONGTEXT_DELETE_QUESTIONS_XPATH)
	public WebElement longTextDeleteQuestion;
	
	
	
	@FindBy(xpath = Constant.DELETE_XPATH)
	public WebElement Delete;
	
	@FindBy(xpath = Constant.DELETE_QUESTIONS_XPATH)
	public WebElement DeleteQuestion;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH)
	public WebElement imagechoicerandomoptionOff;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_DROPDOWN_XPATH)
	public WebElement dropdownFrom;
	
	@FindBy(xpath = Constant.DRAG_AND_DROP_DROPDOWN_XPATH)
	public WebElement dropdownTo;
	
	@FindBy(xpath = Constant.DROPDOWN_TITLE_XPATH)
	public WebElement dropdowntitle;
	
	@FindBy(xpath = Constant.DROPDOWN_IFRAME_XPATH)
	public WebElement iframedropdown;
	
	@FindBy(xpath = Constant.DROPDOWN_IAMAGE_VIDEO_OTHERCONTENT_OFF_XPATH)
	public WebElement imagevideoOtherContentOff;
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SurveyCreatePage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	

}
