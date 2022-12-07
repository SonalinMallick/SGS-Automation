package com.SGS.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SGS.page.SurveyCreateChoicePage;
import com.SGS.page.SurveyCreatePage;

import resourses.Constant;

public class SurveyCreateChoiceTest extends BaseTest{
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
	SurveyCreateChoiceTest() {
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

	public void login() {
		// driver.get(property.getProperty("baseURL"));
		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		SurveyCreateobj.signin.click();
		SurveyCreateobj.email.sendKeys(Constant.EMAIL);
		SurveyCreateobj.password.sendKeys(Constant.PASSWORD);
		SurveyCreateobj.login.click();
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

	public void logout() {
		// driver.get(property.getProperty("baseURL"));
		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		SurveyCreateobj.subhrakantSahoo.click();
		SurveyCreateobj.logout.click();
	}

	
	@Test(priority = 1)
	public void multipleChoiceTest(Method method) {
		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.createsurveytitle.sendKeys(Constant.CREATE_TITLE_XPATH);
		SurveyCreateobj.createbutton.click();
		SurveyCreateobj.expand.click();
		scrollDown();
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.multipleChoiceFrom, SurveyCreateobj.multipleChoiceTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframemultipleChoice);
		SurveyCreateobj.multipleChoicetitle.sendKeys("hello");
		driver.switchTo().defaultContent();
		SurveyCreateobj.groupingChoices.sendKeys(Constant.GROUPING_CHOICES);
		SurveyCreateobj.groupingChoices1.sendKeys(Constant.GROUPING_CHOICES1);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (explicitElementWait(SurveyCreateobj.multipleChoicesave))
			SurveyCreateobj.multipleChoicesave.click();
	}
	
	@Test(priority = 2)
	public void multipleChoiceTagTest(Method method) {
		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.longTextTag.click();
		if (explicitElementWait(SurveyCreateobj.longTextAddTag))
			SurveyCreateobj.longTextAddTag.click();
		SurveyCreateobj.longTextAddTagNonSelected.click();
		SurveyCreateobj.longTextAddTagNonSelectedAutomation.click();
		SurveyCreateobj.longTextAddTagNonSelectedApply.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (explicitElementWait(SurveyCreateobj.informationAddTagNonSelectedClose))
			SurveyCreateobj.informationAddTagNonSelectedClose.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 3)
	public void multipleChoiceLogicTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationLogic.click();
		SurveyCreateobj.chooseNextLogicJump.click();
		SurveyCreateobj.chooseNextLogicJumpClose.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 4)
	public void multipleChoiceCopyTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationCopy.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}
	
	@Test(priority = 5)
	public void multipleChoiceDeleteTest(Method method) {

		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}
	
	@Test(priority = 6)
	public void imageChoiceTest(Method method) {
		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		scrollDown();
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.imageChoiceFrom, SurveyCreateobj.imageChoiceTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframeimageChoice);
		SurveyCreateobj.imageChoicetitle.sendKeys("hello");
		driver.switchTo().defaultContent();
		SurveyCreateobj.groupingChoices.sendKeys(Constant.GROUPING_CHOICES);
		SurveyCreateobj.groupingChoices1.sendKeys(Constant.GROUPING_CHOICES1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (explicitElementWait(SurveyCreateobj.groupingChoicesImage))
			SurveyCreateobj.groupingChoicesImage.click();
		
		
		if (explicitElementWait(SurveyCreateobj.surveygamezGallery))
			SurveyCreateobj.surveygamezGallery.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (explicitElementWait(SurveyCreateobj.groupingChoicesImage1))
			SurveyCreateobj.groupingChoicesImage1.click();
		// SurveyCreateobj.groupingChoicesImage1.click();
		if (explicitElementWait(SurveyCreateobj.surveygamezGallery1))
			SurveyCreateobj.surveygamezGallery1.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (explicitElementWait(SurveyCreateobj.imageChoiceSave))
			SurveyCreateobj.imageChoiceSave.click();
	}
	
	@Test(priority = 7)
	public void imageChoiceTagTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.longTextTag.click();
		if (explicitElementWait(SurveyCreateobj.longTextAddTag))
			SurveyCreateobj.longTextAddTag.click();
		SurveyCreateobj.longTextAddTagNonSelected.click();
		SurveyCreateobj.longTextAddTagNonSelectedAutomation.click();
		SurveyCreateobj.longTextAddTagNonSelectedApply.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (explicitElementWait(SurveyCreateobj.informationAddTagNonSelectedClose))
			SurveyCreateobj.informationAddTagNonSelectedClose.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 8)
	public void imageChoiceLogicTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationLogic.click();
		SurveyCreateobj.chooseNextLogicJump.click();
		SurveyCreateobj.chooseNextLogicJumpClose.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 9)
	public void imageChoiceCopyTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationCopy.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}
	
	
	@Test(priority = 10)
	public void imageChoiceDeleteTest(Method method) {

		SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}
	
	@Test(priority = 11)
	public void dropdownTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		scrollDown();
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.dropdownFrom, SurveyCreateobj.dropdownTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframedropdown);
		SurveyCreateobj.dropdowntitle.sendKeys("hello");
		driver.switchTo().defaultContent();
		SurveyCreateobj.groupingChoices.sendKeys(Constant.GROUPING_CHOICES);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SurveyCreateobj.groupingChoices1.sendKeys(Constant.GROUPING_CHOICES1);
		SurveyCreateobj.imagevideoOtherContentOff.click();
		if (explicitElementWait(SurveyCreateobj.groupingsave))
			SurveyCreateobj.groupingsave.click();
	}
	@Test(priority = 12)
	public void dropDownDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		

	}
	
	


	
}
