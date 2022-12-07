package com.SGS.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.SGS.page.SurveyCreatePage;

import resourses.Constant;

public class SurveyCreateGroupsTest extends BaseTest{
	FileWriter writer;
	Properties property;

	
	
	@BeforeClass
	public void setupClass(ITestContext method) {
		super.setup(method);
	}

	@AfterClass
	public void closeClass(ITestContext method) {
		super.tearDown();
	}

	SurveyCreateGroupsTest() {
		try {
			writer = new FileWriter("E:\\PROJECTS\\SGS-Automation\\SGSAutomation\\src\\test\\java\\resourses\\login.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
		property = new Properties();
		property.setProperty("baseURL", "https://stg.surveygamez.com/");
		try {
			property.store(writer, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void SelectAutomation() {
		Select auto = new Select(driver.findElement(By.xpath(Constant.DUPLICATE_OF_AN_EXITING_SELECT_SURVEY_XPATH)));
		auto.selectByVisibleText("AUTOMATIONN");
	}

	public void SelectAutomationPickFromOtherSurvey() {
		Select auto = new Select(driver.findElement(By.xpath(Constant.SEARCH_CRITERIA_SELECT_SURVEY_AUTOMATION_XPATH)));
		auto.selectByVisibleText("AUTOMATIONN");
	}

	private void scrollDown() {
		// movetoCreate();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	private void movetoout() {
		Actions a = new Actions(driver);
		a.moveByOffset(10, 20).perform();
		a.click().perform();
		// move to an element
	}

	public void login() {
		// driver.get(property.getProperty("baseURL"));
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		SurveyCreateobj.signin.click();
		SurveyCreateobj.email.sendKeys(Constant.EMAIL);
		SurveyCreateobj.password.sendKeys(Constant.PASSWORD);
		SurveyCreateobj.login.click();
	}
	public void logout() {
		// driver.get(property.getProperty("baseURL"));
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		SurveyCreateobj.subhrakantSahoo.click();
		SurveyCreateobj.logout.click();
	}
	
	
	@Test(priority = 1)
	public void DuplicateAnexistingsurveyWelcome(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		driver.get("https://stg.surveygamez.com/");
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.Duplicateanexistingsurvey.click();
		SurveyCreateobj.DuplicateanexistingsurveyTitle.clear();
		SurveyCreateobj.DuplicateanexistingsurveyTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		SurveyCreateobj.DuplicateanexistingSelectsurvey.click();
		SelectAutomation();
		scrollDown();
		SurveyCreateobj.DuplicateanexistingCreateButton.click();
		SurveyCreateobj.expand.click();
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.welcomeFrom, SurveyCreateobj.welcomeTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iFrameWelcome);
		SurveyCreateobj.iFrameWelcomeTitle.sendKeys("hello");
		

		driver.switchTo().defaultContent();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		if (explicitElementWait(SurveyCreateobj.save))
			SurveyCreateobj.save.click();
		
		logout();
	}
	@Test(priority = 2)
	public void pickfromothersurvey(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.pickFromOthersurvey.click();

		SurveyCreateobj.pickFromOthersurveyTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		SurveyCreateobj.pickFromOthersurveyProceed.click();
		SurveyCreateobj.pickFromOthersurveySelectSurvey.click();
		SurveyCreateobj.pickFromOthersurveySelectSurveyAutomation.click();
		movetoout();
		SurveyCreateobj.SearchCriteriaClickToAddTag.click();
		SurveyCreateobj.SearchCriteriaSelectNonSelectedTag.click();
		SurveyCreateobj.pickFromOthersurveySelectnonSelectedAutomation.click();
		SurveyCreateobj.pickFromOthersurveySelectnonSelectedAutomationAdd.click();
		SurveyCreateobj.SearchCriteriaRetriveQuestions.click();
		logout();

		
	}

	@Test(priority = 3)
	public void createAssessmentAutoScoredcreateTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.assessment.click();
		SurveyCreateobj.assessmentTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		scrollDown();
		SurveyCreateobj.assessmentCreate.click();
		logout();
	}

	@Test(priority = 4)
	public void AssessmentAutoScoredCancelTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		driver.get("https://stg.surveygamez.com/");
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.assessment.click();
		SurveyCreateobj.assessmentTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		scrollDown();
		SurveyCreateobj.assessmentCancel.click();
		logout();
	}

	@Test(priority = 5)
	public void configureTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		driver.get("https://stg.surveygamez.com/");
		login();
		SurveyCreateobj.createsurveysearch.sendKeys(Constant.CREATE_TITLE_XPATH);
		SurveyCreateobj.automation.click();
		SurveyCreateobj.expand.click();
		SurveyCreateobj.configuration.click();
		SurveyCreateobj.secureDatabase.click();
		SurveyCreateobj.saveGeneralSettins.click();
		logout();
		
	}



	
	@Test(priority = 6)
	public void pickfromassessmentTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		driver.get("https://stg.surveygamez.com/");
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.assessment.click();
		scrollDown();

		SurveyCreateobj.pickFromOthersurveyTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		SurveyCreateobj.pickFromOthersurveyProceed.click();
		SurveyCreateobj.pickFromOthersurveySelectSurvey.click();
		SurveyCreateobj.pickFromOthersurveySelectSurveyAutomation.click();
		movetoout();
		SurveyCreateobj.SearchCriteriaClickToAddTag.click();
		SurveyCreateobj.SearchCriteriaSelectNonSelectedTag.click();
		SurveyCreateobj.pickFromOthersurveySelectnonSelectedAutomation.click();
		SurveyCreateobj.pickFromOthersurveySelectnonSelectedAutomationAdd.click();
		SurveyCreateobj.SearchCriteriaRetriveQuestions.click();
		logout();
		
	}

	@Test(priority = 7)
	public void createQBsTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		driver.get("https://stg.surveygamez.com/");
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.Duplicateanexistingsurvey.click();
		SurveyCreateobj.DuplicateanexistingsurveyTitle.clear();
		SurveyCreateobj.DuplicateanexistingsurveyTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		SurveyCreateobj.DuplicateanexistingSelectsurvey.click();
		SelectAutomation();
		scrollDown();
		SurveyCreateobj.DuplicateanexistingCreateButton.click();
		logout();
		
	}
	@Test(priority = 8)
	public void newtabtest(Method method) {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://stg.surveygamez.com/");

		logout();
	

}
	}
