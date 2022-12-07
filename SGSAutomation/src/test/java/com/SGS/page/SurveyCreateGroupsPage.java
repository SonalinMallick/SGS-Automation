package com.SGS.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resourses.Constant;

public class SurveyCreateGroupsPage {
	WebDriver driver;
	
	
	@FindBy(xpath = Constant.GROUPS_QUESTIONS_MODULE_XPATH)
	public WebElement questiongroupFrom;
	
	@FindBy(xpath = Constant.MULTIPLE_CHOICE_PASSWORD_DRAG_AND_DROP_XPATH)
	public WebElement questiongroupTo;
	
	@FindBy(xpath = Constant.CHOICE_MODULE_MULTIPLE_CHOICE_TITLE_XPATH)
	public WebElement questiongrouptitle;
	
	@FindBy(xpath = Constant.INTERACTIVE_MATCHING_IFRAME_XPATH)
	public WebElement iframequestiongroupe;
	
	
	
	
	

}
