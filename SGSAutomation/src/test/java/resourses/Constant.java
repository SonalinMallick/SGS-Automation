package resourses;


public class Constant {
	//Login & Signup xpath

	public static final String BASE_URL= "https://stg.surveygamez.com/";
	public static final String EMAIL_XPATH = "//input[@id='email']";
	public static final String PASSWORD_XPATH = "//input[@id='password']";
	public static final String SIGNIN_XPATH = "//a[@id='btnSignin']";
	public static final String LOGIN_XPATH = "//span[@id='signin-text']";
	public static final String EMAIL = "subhrakanta.sahoo@sevyait.com";
	public static final String PASSWORD = "Subhra@12";
	public static final String CONFIRM_PASSWORD = "Subhra@12";
	
	
	
	public static final String CONFIRM_PASSWORD_XPATH = "//input[@id='confirmPassword']";
	public static final String NAME_XPATH = "//input[@id='uname']";
	public static final String NAME = "SonalinMallick";
	public static final String SIGNUP_SUBMIT_XPATH= "//button[@id='signupFormSubmit']";
	public static final String SIGNUP_XPATH = "//a[@id='btnRequestAccess']";
	public static final String WRONG_ALPHANUMERIC_EMAIL= "XYZ";
	public static final String WRONG_ALPHANUMERIC_PASSWORD= "ABC";
	public static final String WRONG_NUMERIC_EMAIL= "123";
	public static final String WRONG_NUMERIC_PASSWORD= "1234";
	public static final String WRONG_SPECIAL_CHARACTER_EMAIL= "@@";
	public static final String WRONG_SPECIAL_CHARACTER_PASSWORD= "%%$";
	
	public static final String PASSWORD_IS_REQUIRES_XPATH= "//small[contains(text(),'Password is required.')]";
	public static final String EMAIL_IS_REQUIRES_XPATH= "//small[contains(text(),'Email is required.')]";
	public static final String ENTER_VALID_EMAIL_ADRESS_XPATH= "//small[contains(text(),'Please enter a valid email address')]";
	public static final String AUTHENTICATION_FAILED_XPATH= "//small[contains(text(),'Email is required.')]";
	public static final String SURVEY_XPATH= "//body/nav[1]/div[1]/div[2]/div[2]/div[1]/a[1]/img[1]";
	public static final String FORGOT_PASSWORD_XPATH= "//body/nav[1]/div[1]/div[2]/div[2]/div[1]/a[1]/img[1]";
	
//Signout xpath
	public static final String SIGNOUT_XPATH= "//a[contains(text(),'Sign out')]";
	
//Final Result
	public static final String LOGIN_FINAL_RESULT_XPATH= "//body/nav[1]/div[1]/div[2]/div[3]/ul[1]/li[2]";
	public static final String AUTOMATION_FINAL_RESULT_XPATH= "//span[@id='survey-name']";
	public static final String SIGNUP_FINAL_RESULT= "//body/nav[1]/div[1]/div[2]/div[3]/ul[1]/li[2]";
	public static final String CREATE_SURVEY_FINAL_RESULT= "//body/nav[1]/div[1]/div[2]/div[3]/ul[1]/li[2]";
	public static final String CREATE_SURVEY_WELCOME_FINAL_RESULT= "//body/nav[1]/div[1]/div[2]/div[3]/ul[1]/li[2]";
	public static final String DEVELOPEROPTION_FINAL_RESULT_XPATH= "//span[@id='appKey']";
	public static final String EMAIL_IS_REQUIRED_XPATH= "//small[contains(text(),'Email is required.')]";
	public static final String WITHOUT_SIGNIN_XPATH= "//h5[contains(text(),'or sign in with your social account')]";
	public static final String PERSONALIZATION_FINAL_RESULT_XPATH= "//h3[contains(text(),'Sub Domain Settings')]";
	public static final String AUTHENTICATIONFAILED_XPATH= "/html[1]/body[1]/div[1]/div[2]/form[1]/div[7]/div[1]/p[1]/strong[1]";
	public static final String USER_ALREADY_REGISTER_XPATH= "//a[contains(text(),'Forgot Password ?')]";
	public static final String NAME_IS_REQUIRED_XPATH= "//small[contains(text(),'Name is required.')]";
	public static final String UPDATE_SUCCESSFUL_XPATH= "//p[contains(text(),'Updated successfully.')]";
	public static final String CONFIRM_PASSWORD_REQUIRED_XPATH= "//small[contains(text(),'Confirm password is required.')]";
	public static final String DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[5]/i[1]";
	public static final String DELETE_QUESTIONS_XPATH="//body/div[@id='list-questions']/div[@id='deleteQuestion']/div[1]/div[1]/div[3]/button[1]";
//HomePage xpath	
	public static final String SUBHRAKANTSAHOO_XPATH= "//body/nav[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]";
	public static final String PROFILE_XPATH= "//a[contains(text(),'Profile')]";
	public static final String PERSONALIZATION_XPATH= "//a[@id='subDomain']";
	public static final String SUBDOMAIN_CHECKBOX_XPATH= "//input[@id='subDomainCheck']";
	public static final String SUBDOMAIN_REQUIRED_XPATH= "//input[@id='subDomainId']";
	public static final String SUBDOMAIN_REQUIRED_NAME= "Automation";
	public static final String SAVE_XPATH= "//span[contains(text(),'Save')]";
	
	
	public static final String CHANGE_PASSWORD_XPATH= "//a[@id='changePwd']";
	public static final String CHANGE_CURRENT_PASSWORD_XPATH= "//input[@id='currentPassword']";
	public static final String CHANGE_NEW_PASSWORD_XPATH= "//input[@id='password']";
	public static final String CHANGE_CONFIRMED_PASSWORD_XPATH= "//input[@id='confirmPassword']";
	public static final String CHANGE_CURRENT_PASSWORD= "Subhra@12";
	public static final String CHANGE_NEW_PASSWORD= "Sona@123";
	public static final String CHANGE_CONFIRMED_PASSWORD= "Sona@123";
	public static final String CHANGE_PASSWORD_UPDATE_XPATH= "//span[contains(text(),'Update')]";
	public static final String CHANGE_PASSWORD_CANCEL_XPATH= "//button[@id='changePasswordCancelButton']";
	public static final String CHANGE_PASSWORD_FINAL_RESULTXPATH= "//body/nav[1]/div[1]/div[2]/div[3]/ul[1]/li[2]";
	public static final String SURVEYNAME_XPATH= "//tbody/tr[8]/td[1]/a[1]";
	public static final String DEVLOPER_OPTION_XPATH= "//a[@id='developerOptionId']";
	public static final String COPY_API_ID_XPATH= "//button[@id='copyApiId']";
	public static final String COPY_API_SECRET_XPATH= "//button[@id='copyApiSecret']";
	public static final String TAG_XPATH= "//a[@id='tagsId']";
	public static final String CREATE_TAG_XPATH= "//button[@id='createTagButton']";
	public static final String TAG_NAME_XPATH= "//body/div[7]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]";
	public static final String TAG_CHECKBOX_XPATH= "//button[@id='saveNewTagData']";
	public static final String TAG_NAME="AutomationNN";
	public static final String TAG_SAVE_XPATH="//button[@id='saveNewTagData']";
	public static final String FREE_TEXT_XPATH= "//button[@id='saveNewTagData']";
	public static final String ALLOW_MULTIPLE_VALUES_XPATH= "//button[@id='saveNewTagData']";
	public static final String TAG_VALUE_XPATH= "//input[@id='']";
	public static final String ADD_TAG_VALUE_XPATH= "//body[1]/div[7]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String SAVE_TAGNAME_XPATH= "//button[@id='saveNewTagData']";
	public static final String TAG_VALUE_UPDATE_XPATH= "//button[@id='updateTagData']";
	public static final String TAG_VALUE_CANCEL_XPATH= "//body/div[7]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[3]/button[2]";
	public static final String REMOVE_TAG_VALUE_XPATH= "//body[1]/div[7]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String SEARCH_XPATH= "//button[@id='saveNewTagData']";
	public static final String EDIT_TAG_XPATH= "//tbody/tr[1]/td[3]/button[1]/i[1]";
	
	
	public static final String CREATE_NEW_SURVEY_XPATH= "//button[@id='createNewSurvey']";
	//public static final String CREATE_SURVEY_XPATH= "//tbody/tr[1]/td[3]/button[1]/i[1]";
	public static final String CREATE_SURVEY_TITLE_XPATH= "//input[@id='surveyTitle']";
	public static final String CREATE_TITLE_XPATH= "AUTOMATION";
	public static final String CREATE_SURVEY_BUTTON_XPATH= "//button[@id='createSurveyBtn']";
	public static final String CREATE_SURVEY_BUTTON_CANCEL_XPATH= "//button[@id='cancelButton']";
	public static final String CREATE_SURVEY_EXPAND_ALL_XPATH= "//button[contains(text(),'Expand All')]";
	public static final String CREATE_SURVEY_COLLAPSE_ALL_XPATH= "//button[contains(text(),'Collapse All')]";
	public static final String CREATE_SURVEY_SEARCH_XPATH= "//body/div[8]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
	public static final String CREATE_SURVEY_BACK_TO_HOME_XPATH= "//*[@id='Layer_1']";
	public static final String SEARCH_AUTOMATION_XPATH= "//a[contains(text(),'AUTOMATIONN')]";
	public static final String AUTOMATION_XPATH= "//tbody/tr[2]/td[1]/a[1]";
	
//COURTESY MODULE:WELCOME
	public static final String COURTESY_WELCOME_XPATH= "//body/div[@id='list-questions']/div[1]/div[1]/div[1]/img[1]";	
	public static final String EXPAND= "//button[contains(text(),'Expand All')]";
	public static final String COURTESY_WELCOME_SAVE_XPATH= "(//div[@class='saveAndCancelQuestion']//button[@onclick='WelcomeQuestion.saveWelcomeQuestion(this)'])[1]";
	public static final String COURTESY_WELCOME_SAVE_IFRAME= "//iframe[@id='question-verbiage_ifr']";
	public static final String COURTESY_WELCOME_TAG_CLOSE_XPATH= "//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	
	
	public static final String DRAG_AND_DROP_WELCOME_XPATH= "//body/div[@id='list-questions']/div[2]/div[2]/div[1]";
	public static final String WELCOME_XPATH= "//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]";
	public static final String WELCOME_IFRAME_XPATH= "//iframe[@id='question-verbiage_ifr']";
	public static final String WELCOME_TITLE_XPATH= "/html[1]/body[1]";
	public static final String WELCOME_DESCRIPTION_IFRAME_XPATH="//iframe[@id='question-description_ifr']";
	public static final String WELCOME_DESCRIPTION_XPATH="/html[1]/body[1]";
	public static final String WELCOME_IMAGE_VIDEO_OTHERCONTENT_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String WELCOME_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String WELCOME_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String COURTESY_WELCOME_TAG_XPATH= "//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";	
	public static final String COURTESY_WELCOME_ADD_TAG_XPATH= "//button[@id='applyTag-questionLevel']";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELECTED_XPATH= "//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELED_AUTOMATION_XPATH= "//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[4]/i[1]";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH="//button[@id='conformDeleteApplyTag']";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="//body/div[@id='deleteApplyTag-popup']/div[1]/div[1]/div[3]/button[2]";
	public static final String COURTESY_WELCOME_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	public static final String COURTESY_WELCOME_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[4]/i[1]";
	public static final String COURTESY_WELCOME_DELETE_QUESTIONS_XPATH="//body/div[@id='list-questions']/div[@id='deleteQuestion']/div[1]/div[1]/div[3]/button[1]";
	//COURTESY MODULE:INFORMATION
	public static final String COURTESY_INFORMATION_XPATH= "//body/div[@id='list-questions']/div[1]/div[1]/div[2]/img[1]";
	public static final String DRAG_AND_DROP_INFORMATION_XPATH= "//small[contains(text(),'Drag & drop questions here.')]";
	public static final String COURTESY_INFORMATION_IFRAME_XPATH= "//iframe[@id='question-verbiage_ifr']";
	public static final String COURTESY_INFORMATION_TITLE_XPATH= "/html[1]/body[1]";
	public static final String COURTESY_INFORMATION_HELLOPAGE_XPATH= "//iframe[@id='questionpreviewiframe']";
	public static final String COURTESY_INFORMATION_CONTINUE_XPATH= "/html[1]/body[1]/div[4]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]";
	
	public static final String COURTESY_INFORMATION_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String COURTESY_INFORMATION_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]";
	public static final String COURTESY_INFORMATION_REMOVE_QUOTATIONS_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String COURTESY_INFORMATION_REMOVE_QUOTATIONS_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]";
	public static final String COURTESY_INFORMATION_HIDE_BUTTON_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String COURTESY_INFORMATION_HIDE_BUTTON_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]";
	public static final String COURTESY_INFORMATION_BUTTON_TEXT_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[3]/div[1]/div[2]/input[1]";
	public static final String COURTESY_INFORMATION_SAVE_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String COURTESY_INFORMATION_TAG_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";
    public static final String COURTESY_INFORMATION_ADD_TAG_XPATH="//button[@id='applyTag-questionLevel']";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELECTED_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELED_AUTOMATION_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH="//tbody/tr[1]/td[3]/button[2]/i[1]";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH="//button[@id='conformDeleteApplyTag']";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="//body/div[@id='deleteApplyTag-popup']/div[1]/div[1]/div[3]/button[2]";
	public static final String COURTESY_INFORMATION_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	public static final String COURTESY_INFORMATION_LOGIC_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[2]/i[1]";
	public static final String COURTESY_INFORMATION_CHOOSE_NEXT_LOGIC_JUMP_XPATH="//select[@id='else-target']";
	public static final String COURTESY_INFORMATION_CHOOSE_NEXT_LOGIC_JUMP_AAA_XPATH="//select[@id='else-target']";
	public static final String COURTESY_INFORMATION_LOGIC_SAVE_XPATH="//button[@id='question-logic-modal']";
	public static final String COURTESY_INFORMATION_LOGIC_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='logic-modal']/div[1]/div[1]/div[3]/button[2]";
	public static final String COURTESY_INFORMATION_LOGIC_COPY_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[4]/i[1]";
	public static final String COURTESY_INFORMATION_LOGIC_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/span[1]/span[5]/i[1]";
	public static final String INFORMATION_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String INFORMATION_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[5]/i[1]";
	public static final String INFORMATION_DELETE_QUESTIONS_XPATH="//body/div[@id='list-questions']/div[@id='deleteQuestion']/div[1]/div[1]/div[3]/button[1]";
	
	//COURTESY MODULE:THANKYOU
	public static final String COURTESY_THANKYOU_XPATH="//body/div[@id='list-questions']/div[1]/div[1]/div[3]/img[1]";
	public static final String THANKYOU_IFRAME_XPATH= "//iframe[@id='question-verbiage_ifr']";
	public static final String THANKYOU_DRAGANDDROP_XPATH= "//small[contains(text(),'Drag & drop Thank you screen here')]";
	public static final String THANKYOU_TITLE_XPATH= "/html[1]/body[1]";
	public static final String COURTESY_THANKYOU_DESCRIPTION_XPATH= "";
	public static final String COURTESY_THANKYOU_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String COURTESY_THANKYOU_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String COURTESY_THANKYOU_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String COURTESY_THANKYOU_TAG_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";
    public static final String COURTESY_THANKYOU_ADD_TAG_XPATH="//button[@id='applyTag-questionLevel']";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELECTED_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELED_AUTOMATION_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH="";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH="";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="";
	public static final String COURTESY_THANKYOU_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	public static final String COURTESY_THANKYOU_TAG__LOGIC_CANCEL_XPATH="";
	public static final String COURTESY_THANKYOU_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/span[1]/span[4]/i[1]";
	public static final String COURTESY_THANKYOU_DELETE_QUESTIONS_XPATH="//body/div[@id='list-questions']/div[@id='deleteQuestion']/div[1]/div[1]/div[3]/button[1]";
	
	
	//DATAENTRY MODULE:SHORT TEXT
	public static final String DATAENTRY_SHORT_TEXT_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[1]/img[1]";
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String DATAENTRY_SHORT_TEXT_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
	public static final String DATAENTRY_SHORT_TEXT_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String DATAENTRY_SHORT_TEXT_TITLE_XPATH="/html[1]/body[1]";
	public static final String DATAENTRY_SHORT_TEXT_TAG_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";
    public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_XPATH="//button[@id='applyTag-questionLevel']";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELED_AUTOMATION_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH="";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH="";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="";
	public static final String DATAENTRY_SHORT_TEXT_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	public static final String DATAENTRY_SHORT_TEXT_TAG__LOGIC_CANCEL_XPATH="";
	public static final String DATAENTRY_SHORT_TEXT_ANSWER_GOES_HERE_XPATH="/html[1]/body[1]/div[4]/div[1]/ul[1]/li[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]";
	
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_MANDATORY_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String DATAENTRY_SHORT_TEXT_QUESTIONS_MANDATORY_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String DATAENTRY_SHORT_TEXT_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String DATAENTRY_SHORT_TEXT_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
	
	
	//DATAENTRY MODULE:LONG TEXT
		public static final String DATAENTRY_LONG_TEXT_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[2]/img[1]";
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_LONG_TEXT_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
		public static final String DATAENTRY_LONG_TEXT_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_LONG_TEXT_TITLE_XPATH="/html[1]/body[1]";
		
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_MANDATORY_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
		public static final String DATAENTRY_LONG_TEXT_QUESTIONS_MANDATORY_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
		public static final String DATAENTRY_LONG_TEXT_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
		public static final String DATAENTRY_LONG_TEXT_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
		public static final String LONGTEXT_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[5]/i[1]";
		public static final String LONGTEXT_DELETE_QUESTIONS_XPATH="//body/div[@id='list-questions']/div[@id='deleteQuestion']/div[1]/div[1]/div[3]/button[1]";
		public static final String LONGTEXT_IMAGE_VIDEO_OTHER_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
		
		//DATAENTRY MODULE: NUMBER
	    public static final String DATAENTRY_NUMBER_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[4]/img[1]";
	    public static final String DATAENTRY_NUMBER_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_NUMBER_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
		public static final String DATAENTRY_NUMBER_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_NUMBER_TITLE_XPATH="/html[1]/body[1]";
				
		public static final String DATAENTRY_NUMBERT_MINIMUM_VALUE_XPATH="/html[1]/body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
		public static final String DATAENTRY_NUMBER_MAXIMUM_VALUE_XPATH= "//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
		public static final String DATAENTRY_NUMBERT_MINIMUM_VALUE="2";
		public static final String DATAENTRY_NUMBER_MAXIMUM_VALUE="3";
		public static final String DATAENTRY_NUMBER_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
		public static final String DATAENTRY_NUMBER_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
		
		//DATAENTRY MODULE: DATE
	    public static final String DATAENTRY_DATE_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[5]/img[1]";
	    public static final String DATAENTRY_DATE_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_DATE_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
		public static final String DATAENTRY_DATE_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_DATE_TITLE_XPATH="/html[1]/body[1]";
				
		public static final String DATAENTRY_DATE_MINIMUM_VALUE_XPATH="/html[1]/body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
		public static final String DATAENTRY_DATE_MAXIMUM_VALUE_XPATH= "//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
		public static final String DATAENTRY_DATE_MINIMUM_VALUE="2";
		public static final String DATAENTRY_DATE_MAXIMUM_VALUE="3";
		public static final String DATAENTRY_DATE_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
		public static final String DATAENTRY_DATE_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
	
		//DATAENTRY MODULE: UPLOAD
	    public static final String DATAENTRY_UPLOAD_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[6]/img[1]";
		public static final String DATAENTRY_UPLOAD_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
		public static final String DATAENTRY_UPLOAD_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_UPLOAD_TITLE_XPATH="/html[1]/body[1]";
				
		
		public static final String DATAENTRY_UPLOAD_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
		public static final String DATAENTRY_UPLOAD_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
		
		//DATAENTRY MODULE: LOCATION
	    public static final String DATAENTRY_LOCATION_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[7]/img[1]";
		public static final String DATAENTRY_LOCATION_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
		public static final String DATAENTRY_LOCATION_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_LOCATION_TITLE_XPATH="/html[1]/body[1]";
				
		
		public static final String DATAENTRY_LOCATION_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
		public static final String DATAENTRY_LOCATION_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
	
		//DATAENTRY MODULE: PASSWORD
	    public static final String DATAENTRY_PASSWORD_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[4]/img[1]";
		public static final String DATAENTRY_PASSWORD_DRAG_AND_DROP_XPATH="//body/div[@id='list-questions']/div[1]/div[2]/div[8]/img[1]";
		public static final String DATAENTRY_PASSWORD_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
		public static final String DATAENTRY_PASSWORD_TITLE_XPATH="/html[1]/body[1]";
		public static final String DATAENTRY_PASSWORD_ENTER_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
		public static final String DATAENTRY_PASSWORD_ENTER="Subhra@12";
		public static final String DATAENTRY_PASSWORD_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
		public static final String DATAENTRY_PASSWORD_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
	
		public static final String PASSWORD_TAG_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";
	    public static final String PASSWORD_ADD_TAG_XPATH="//button[@id='applyTag-questionLevel']";
		public static final String PASSWORD_ADD_TAG_NONSELECTED_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
		public static final String PASSWORD_ADD_TAG_NONSELED_AUTOMATION_XPATH="//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
		public static final String PASSWORD_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
		public static final String DATAENTRY_PASSWORD_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="";
		public static final String DATAENTRY_PASSWORD_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
		
		//CHOICE MODULE:MULTIPLE CHOICE
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_XPATH="//body/div[@id='list-questions']/div[1]/div[3]/div[1]/img[1]";
	public static final String MULTIPLE_CHOICE_PASSWORD_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_TITLE_XPATH="/html[1]/body[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_CHOICES_ACTIONS_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_CHOICES_ACTIONS_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_CHOICE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_ONE_OPTION_PER_ROW_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_ONE_OPTION_PER_ROW_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_ADD_OTHER_OPTION_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_ADD_OTHER_OPTION_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_ALLOW_MORE_THAN_ONE_ANSWER_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_ALLOW_MORE_THAN_ONE_ANSWER_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_MANDATORY_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SETTINGS_MANDATORY_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String CHOICE_MODULE_MULTIPLE_CHOICE_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
	
	
	//CHOICE MODULE MODULE:IMAGE CHOICE
	public static final String CHOICE_MODULE_IMAGE_CHOICE_XPATH="//body/div[@id='list-questions']/div[1]/div[3]/div[3]/img[1]";
	public static final String IMAGE_CHOICE_DRAG_AND_DROP_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_TITLE_XPATH="/html[1]/body[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_CHOICES_ACTIONS_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_CHOICES_ACTIONS_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_CHOICE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_ONE_OPTION_PER_ROW_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_ONE_OPTION_PER_ROW_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_ADD_OTHER_OPTION_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_ADD_OTHER_OPTION_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_ALLOW_MORE_THAN_ONE_ANSWER_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_ALLOW_MORE_THAN_ONE_ANSWER_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_MANDATORY_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SETTINGS_MANDATORY_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String CHOICE_MODULE_IMAGE_CHOICE_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
	
	
	//CHOICE MODULE MODULE:RATING SCALE
	public static final String CHOICE_MODULE_RATING_SCALE_XPATH="//body/div[@id='list-questions']/div[1]/div[3]/div[1]/img[1]";
	public static final String CHOICE_MODULE_RATING_SCALEQUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String CHOICE_MODULE_RATING_SCALE_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
	public static final String CHOICE_MODULE_RATING_SCALE_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_RATING_SCALE_CHOICES_ACTIONS_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String CHOICE_MODULE_RATING_SCALECHOICES_ACTIONS_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_RANDOMIZE_OPTIONS_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_CHOICE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_ONE_OPTION_PER_ROW_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_ONE_OPTION_PER_ROW_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_ADD_OTHER_OPTION_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_ADD_OTHER_OPTION_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_ALLOW_MORE_THAN_ONE_ANSWER_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_ALLOW_MORE_THAN_ONE_ANSWER_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_MANDATORY_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String CHOICE_MODULE_RATING_SCALE_SETTINGS_MANDATORY_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String CHOICE_MODULE_RATING_SCALE_CANCEL_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";
//CHOICE MODULE : DROPDOWN
	public static final String CHOICE_MODULE_DROPDOWN_XPATH="//body/div[@id='list-questions']/div[1]/div[3]/div[7]/img[1]";
	
	public static final String DROPDOWN_SAVE_XPATH= "(//div[@class='saveAndCancelQuestion']//button[@onclick='WelcomeQuestion.saveWelcomeQuestion(this)'])[1]";
	public static final String DROPDOWN_SAVE_IFRAME= "//iframe[@id='question-verbiage_ifr']";
	
	
	public static final String DRAG_AND_DROP_DROPDOWN_XPATH= "//small[contains(text(),'Drag & drop questions here.')]";
	
	public static final String DROPDOWN_IFRAME_XPATH= "//iframe[@id='question-verbiage_ifr']";
	public static final String DROPDOWN_TITLE_XPATH= "/html[1]/body[1]";
	public static final String DROPDOWN_DESCRIPTION_IFRAME_XPATH="//iframe[@id='question-description_ifr']";
	public static final String DROPDOWN_DESCRIPTION_XPATH="/html[1]/body[1]";
	public static final String DROPDOWN_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String DROPDOWN_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String DROPDOWN_ACTION_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String DROPDOWN_ACTION_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String DROPDOWN_ACTION_CHOICES1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String DROPDOWN_ACTION_CHOICES2_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]";
	public static final String DROPDOWN_QUESTION_DESCRIPTION_ONN_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String DROPDOWN_QUESTION_DESCRIPTION_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String DROPDOWN_IAMAGE_VIDEO_OTHERCONTENT_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String DROPDOWN_IAMAGE_VIDEO_OTHERCONTENT_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	
	
	public static final String DROPDOWN_TAG_XPATH= "//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";	
	public static final String DROPDOWNADD_ADD_TAG_XPATH= "//button[@id='applyTag-questionLevel']";
	public static final String DROPDOWN_ADD_TAG_NONSELECTED_XPATH= "//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String DROPDOWN_ADD_TAG_NONSELED_AUTOMATION_XPATH= "//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
	public static final String DROPDOWN_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
	public static final String DROPDOWN_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH="//tbody/tr[1]/td[3]/button[2]/i[1]";
	public static final String DROPDOWN_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH="//button[@id='conformDeleteApplyTag']";
	public static final String DROPDOWN_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="//body/div[@id='deleteApplyTag-popup']/div[1]/div[1]/div[3]/button[2]";
	public static final String DROPDOWN_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	public static final String DROPDOWN_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]";
	
//INTERACTIVE MODULE:GROUPING
	public static final String INTERACTIVE_GROUPING_XPATH="//body/div[@id='list-questions']/div[1]/div[4]/div[1]/img[1]";
	public static final String INTERACTIVE_DRAGANDDROP_GROUPING_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
	public static final String INTERACTIVE_GROUPING_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String INTERACTIVE_GROUPING_TITLE_XPATH="/html[1]/body[1]";
	public static final String INTERACTIVE_GROUPING_SAVE_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]";
	public static final String GROUPING_QUESTIONS_DESCRIPTION_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String GROUPING_CHOICES_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String GROUPING_CHOICES="1";
	public static final String GROUPING_CHOICES1="2";
	public static final String GROUPING_COLLECTORS="1";
	public static final String GROUPING_COLLECTORS1="3";
	public static final String GROUPING_CHOICES_IMAGE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/img[1]";
	public static final String GROUPING_CHOICES1_IMAGE1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]/img[1]";
	public static final String GROUPING_COLLECTORS_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String GROUPING_COLLECTORS1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[2]/td[1]/input[1]";
	public static final String GROUPING_CHOICES1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]";
	public static final String GROUPING_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String GROUPING_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String GROUPING_CHOICES_ACTIONS_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String GROUPING_CHOICES_ACTIONS_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String GROUPING_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String GROUPING_SETTINGS_RANDOMIZE_OPTIONS_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String GROUPING_CHOICE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String GROUPING_SETTINGS_ONE_OPTION_PER_ROW_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String SURVEYGAMEZ_GALLERY_XPATH="/html[1]/body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/a[1]/img[1]";
	public static final String SURVEYGAMEZ_GALLERY1_XPATH="/html[1]/body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/a[2]/img[1]";
	public static final String SURVEYGAMEZ_GALLERY1_FRAME_XPATH="/html[1]/body[1]/div[4]/div[1]/ul[1]/li[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/img[1]";
	
	
	
	public static final String GROUPING_TAG_XPATH= "//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/i[1]";	
	public static final String GROUPING_ADD_TAG_XPATH= "//button[@id='applyTag-questionLevel']";
	public static final String GROUPING_ADD_TAG_NONSELECTED_XPATH= "//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String GROUPING_ADD_TAG_NONSELED_AUTOMATION_XPATH= "//body/div[@id='applyTag-popup']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/label[1]/input[1]";
	public static final String GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_APPLY_TAG_XPATH="//button[@id='applyTags']";
	public static final String GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_TAG_XPATH="//tbody/tr[1]/td[3]/button[2]/i[1]";
	public static final String GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_DELETE_CONFIRM_TAG_XPATH="//button[@id='conformDeleteApplyTag']";
	public static final String GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_CANCEL_TAG_XPATH="//body/div[@id='deleteApplyTag-popup']/div[1]/div[1]/div[3]/button[2]";
	public static final String GROUPING_ADD_TAG_NONSELECTED_AUTOMATION_CLOSE_XPATH="//body/div[@id='list-questions']/div[@id='questionLevelTags-modal']/div[1]/div[1]/div[3]/button[1]";
	public static final String GROUPING_DELETE_XPATH="//body/div[@id='list-questions']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]";
	
	//INTERACTIVE MODULE:RANKING 
	public static final String INTERACTIVE_RANKING_XPATH="//body/div[@id='list-questions']/div[1]/div[4]/div[2]/img[1]";
	public static final String INTERACTIVE_DRAGANDDROP_RANKING_XPATH="//small[contains(text(),'Drag & drop questions here.')]";
	public static final String INTERACTIVE_RANKING_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String INTERACTIVE_RANKING_TITLE_XPATH="/html[1]/body[1]";
	public static final String RANKING_CHOICES="1";
	public static final String RANKING_CHOICES1="2";
	public static final String INTERACTIVE_RANKING_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String RANKING_IMAGE_CHOICE_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String RANKING_IMAGE_CHOICE_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
	public static final String RANKING_IMAGE_CHOICE_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String RANKING_IMAGE_CHOICE_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String RANKING_IMAGE_CHOICE_CHOICES_ACTIONS_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String RANKING_IMAGE_CHOICE_CHOICES_ACTIONS_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String RANKING_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String RANKING_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String RANKING_IMAGE_CHOICE_CHOICE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String RANKING_IMAGE_CHOICE_SETTINGS_ONE_OPTION_PER_ROW_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	
	//INTERACTIVE MODULE:MATCHING
	
	public static final String INTERACTIVE_MATCHING_XPATH="//body/div[@id='list-questions']/div[1]/div[4]/div[1]/img[1]";
	public static final String INTERACTIVE_DRAGANDDROP_MATCHING_XPATH="//body/div[@id='list-questions']/div[1]/div[4]/div[1]/img[1]";
	public static final String INTERACTIVE_MATCHING_IFRAME_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String INTERACTIVE_MATCHING_TITLE_XPATH="/html[1]/body[1]";
	public static final String INTERACTIVE_MATCHING_QUESTIONS_XPATH="//iframe[@id='question-verbiage_ifr']";
	public static final String MATCHING_IMAGE_CHOICE_QUESTIONS_ADD_VARIABLES_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]";
	public static final String MATCHING_IMAGE_CHOICE_QUESTIONS_DESCRIPTION__XPATH="//iframe[@id='question-description_ifr']";
	public static final String MATCHING_IMAGE_CHOICE_QUESTIONS_DESCRIPTION_ON_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]";
	public static final String MATCHING_IMAGE_CHOICE_QUESTIONS_DESCRIPTION_OFF_XPATH= "//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String MATCHING_IMAGE_CHOICE_CHOICES_ACTIONS_ADD_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]";
	public static final String MATCHING_IMAGE_CHOICE_CHOICES_ACTIONS_REMOVE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[2]/span[1]";
	public static final String MATCHING_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String MATCHING_IMAGE_CHOICE_SETTINGS_RANDOMIZE_OPTIONS_ON_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]";
	public static final String MATCHING_IMAGE_CHOICE_CHOICE_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String MATCHING_IMAGE_CHOICE_SETTINGS_ONE_OPTION_PER_ROW_OFF_XPATH="//body/div[@id='list-questions']/div[@id='editPreviewQuestionPopup']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[3]";
	public static final String MATCHING_OPTION_SET1_1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String MATCHING_OPTION_SET1_2_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]";
	public static final String MATCHING_OPTION_SET2_1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/input[1]";
	public static final String MATCHING_OPTION_SET2_2_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[2]/td[1]/input[1]";
	public static final String MATCHING_SET1_IMAGE1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/img[1]";
	public static final String MATCHING_SET1_IMAGE2_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]/img[1]";
	public static final String MATCHING_SET2_IMAGE1_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/a[1]/img[1]";
	public static final String MATCHING_SET2_IMAGE2_XPATH="//body[1]/div[7]/div[14]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[2]/td[2]/a[1]/img[1]";
	//GROUPS MODULE:QUESTIONS GROUP
	public static final String GROUPS_QUESTIONS_MODULE_XPATH="//body/div[@id='list-questions']/div[1]/div[5]/div[1]/img[1]";
	
	
	public static final String COURTESY_QUESTIONS_SAVE_XPATH= "(//div[@class='saveAndCancelQuestion']//button[@onclick='WelcomeQuestion.saveWelcomeQuestion(this)'])[1]";
	public static final String COURTESY_QUESTIONS_SAVE_IFRAME= "//iframe[@id='question-verbiage_ifr']";
	
	
	public static final String DRAG_AND_DROP_QUESTIONS_XPATH= "//small[contains(text(),'Drag & drop questions here.')]";
	
	public static final String QUESTIONS_IFRAME_XPATH= "//iframe[@id='question-verbiage_ifr']";
	public static final String QUESTIONS_TITLE_XPATH= "/html[1]/body[1]";
	public static final String QUESTIONS_DESCRIPTION_IFRAME_XPATH="//iframe[@id='question-description_ifr']";
	public static final String QUESTIONS_DESCRIPTION_XPATH="/html[1]/body[1]";

	//DUPLICATE OF AN EXITING SURVEY
	public static final String DUPLICATE_OF_AN_EXITING_SURVEY_XPATH="//body/div[11]/div[6]/div[1]/div[1]/div[2]/label[1]";
	public static final String DUPLICATE_OF_AN_EXITING_SURVEY_TITLE_XPATH="//input[@id='surveyTitle']";
	public static final String DUPLICATE_OF_AN_EXITING_SURVEY_TITLE="AUTOMATION";
	public static final String DUPLICATE_OF_AN_EXITING_SELECT_SURVEY_XPATH="//select[@id='dropDownListSurvey']";
	public static final String DUPLICATE_OF_AN_EXITING_CREATE_BUTTON_XPATH="//button[@id='createSurveyBtn']";
	public static final String DUPLICATE_OF_AN_EXITING_CANCEL_BUTTON_XPATH="//button[@id='cancelButton']";
	public static final String PICK_QUESTIONS_FROM_OTHER_SURVEY_XPATH="//body/div[6]/nav[1]/div[1]/div[1]/div[3]/a[1]/img[1]";
	public static final String SEARCH_CRITERIA_SELECT_SURVEY_XPATH="//button[@class='multiselect dropdown-toggle btn btn-default']";
	public static final String SEARCH_CRITERIA_SELECT_SURVEY_AUTOMATION_XPATH="//body/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/label[1]/input[1]";
	public static final String SEARCH_CRITERIA_CLICK_TO_ADD_TAG_XPATH="//div[@id='tags-pillbox']";
	public static final String SEARCH_CRITERIA_CLICK_TO_CANCEL_TAG_XPATH="//button[contains(text(),'Cancel')]";
	public static final String SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_XPATH="//body/div[7]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
	public static final String SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_SELECT_AUTOMATION_XPATH="//body/div[7]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/label[1]/input[1]";
	public static final String SEARCH_CRITERIA_SELECT_TAG_NON_SELECTED_SELECT_AUTOMATION_ADD_XPATH="//button[@id='addToPillBox']";
	public static final String DUPLICATE_OF_AN_EXITING_SURVEY_RETRIVE_QUESTIONS_XPATH="//button[text()='Retrieve Questions']";
	public static final String SELECT_TAG_NON_SELECTED_CLICK_TO_ADD_XPATH="//button[@id='addToPillBox']";
	
	public static final String PICK_FROM_OTHER_SURVEY_XPATH="//div[@class='createSurveyOptionSelector radio-div']//input[@value='pickQuestions']";
	public static final String PICK_FROM_OTHER_SURVEY_PROCEED_XPATH="//button[@id='pickQuestions']";
	public static final String PICK_FROM_OTHER_SURVEY_CANCEL_XPATH="//button[@id='cancelButton']";
	public static final String PICK_FROM_OTHER_SURVEY_TITLE_XPATH="//input[@id='surveyTitle']";
	public static final String PICK_FROM_OTHER_SURVEY_SELECT_SURVEY_XPATH="//body/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]";
	public static final String PICK_FROM_OTHER_SURVEY_SELECT_AUTOMATION_XPATH="//body/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/label[1]/input[1]";
	public static final String CONFIGURATION_XPATH="//a[@id='configureSurvey']";
	public static final String SECURE_DATABASE_XPATH="//input[@id='secureDatabase']";
	public static final String SAVE_GENERAL_SETTINS_XPATH="//a[@id='configureSurvey']";
	
	public static final String ASSESSMENT_XPATH="//body/div[11]/div[2]/ul[1]/li[2]/div[1]/a[1]/img[1]";
	public static final String ASSESSMENT_TITLE_XPATH="//input[@id='assessmentTitle']";
	public static final String ASSESSMENT_CREATE_XPATH="//button[@id='createSurveyBtn']";
	public static final String ASSESSMENT_CANCEL_XPATH="//button[@id='cancelButton']";
	
	//welcome
	
	public static final String WELCOME_LOGO_XPATH="//div[contains(text(),'hello')]";
	
//INTERACTIVE MODULE:GROUPING
	
	//PICK FROM OTHER ASSESSMENT:
	public static final String PICK_FROM_OTHER_ASSESSMENT_XPATH="/html[1]/body[1]/div[11]/div[7]/div[1]/div[1]/form[1]/div[3]/label[1]/span[1]";
	
	public static final String PREVIEW_XPATH="//tbody/tr[1]/td[6]/ul[1]/li[1]/a[1]/i[1]";
	public static final String PREVIEW_CLOSE_XPATH="//body/div[@id='surveyPreviewPopup']/div[1]/div[1]/div[1]/button[1]";
	public static final String PREVIEW_MOBILE_XPATH="";
	public static final String PREVIEW_TABLET_XPATH="";
	public static final String PREVIEW_DESKTOP_XPATH="";
	public static final String PREVIEW_EXTERNAL_WINDOW_XPATH="";
	public static final String PREVIEW_COPY_URL_XPATH="";
	public static final String PREVIEW_COPY_SURVEY_URL_XPATH="";
}





