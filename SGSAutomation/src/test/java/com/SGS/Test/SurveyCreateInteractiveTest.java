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

public class SurveyCreateInteractiveTest extends BaseTest{
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

	SurveyCreateInteractiveTest() {
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
	
	// INTERACTIVE MODULE:GROUPING
		@Test(priority = 1)
		public void groupingTest(Method method) {
			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			login();
			SurveyCreateobj.createsurvey.click();
			SurveyCreateobj.createsurveytitle.sendKeys(Constant.CREATE_TITLE_XPATH);
			SurveyCreateobj.createbutton.click();
			SurveyCreateobj.expand.click();
			scrollDown();
			Actions act = new Actions(driver);
			act.dragAndDrop(SurveyCreateobj.groupingFrom, SurveyCreateobj.groupingTo).build().perform();
			driver.switchTo().frame(SurveyCreateobj.iframegrouping);
			SurveyCreateobj.iframegroupingTitle.sendKeys("hello");
			driver.switchTo().defaultContent();
			SurveyCreateobj.groupingChoices.sendKeys(Constant.GROUPING_CHOICES);
			SurveyCreateobj.groupingChoices1.sendKeys(Constant.GROUPING_CHOICES1);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// SurveyCreateobj.groupingChoicesImage.click();
			if (explicitElementWait(SurveyCreateobj.groupingChoicesImage))
				SurveyCreateobj.groupingChoicesImage.click();
			if (explicitElementWait(SurveyCreateobj.surveygamezGallery))
				SurveyCreateobj.surveygamezGallery.click();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// SurveyCreateobj.surveygamezGallery.click();
			if (explicitElementWait(SurveyCreateobj.groupingChoicesImage1))
				SurveyCreateobj.groupingChoicesImage1.click();
			// SurveyCreateobj.groupingChoicesImage1.click();
			if (explicitElementWait(SurveyCreateobj.surveygamezGallery1))
				SurveyCreateobj.surveygamezGallery1.click();
			// spage.surveygamezGallery1.click();
			SurveyCreateobj.groupingCollector.sendKeys(Constant.GROUPING_COLLECTORS);
			SurveyCreateobj.groupingCollector1.sendKeys(Constant.GROUPING_COLLECTORS1);
			driver.switchTo().defaultContent();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (explicitElementWait(SurveyCreateobj.groupingsave))
				SurveyCreateobj.groupingsave.click();
		}
		
		@Test(priority = 2)
		public void groupingTagTest(Method method) {
			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.informationTag.click();
			if (explicitElementWait(SurveyCreateobj.informationAddTag))
				SurveyCreateobj.informationAddTag.click();
			SurveyCreateobj.informationAddTagNonSelected.click();
			SurveyCreateobj.informationAddTagNonSelectedAutomation.click();
			SurveyCreateobj.informationAddTagNonSelectedApply.click();
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
		public void groupingLogicTest(Method method) {

			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.informationLogic.click();
			SurveyCreateobj.chooseNextLogicJump.click();
			SurveyCreateobj.chooseNextLogicJumpClose.click();

			WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
			Assert.assertEquals(register_text.getText(), "AUTOMATION");

		}

		@Test(priority = 4)
		public void groupingCopyTest(Method method) {

			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.informationCopy.click();

			WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
			Assert.assertEquals(register_text.getText(), "AUTOMATION");

		}

		
		@Test(priority = 2)
		public void groupingDeleteTest(Method method) {

			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.Delete.click();
			SurveyCreateobj.DeleteQuestion.click();
			
			WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
			Assert.assertEquals(register_text.getText(), "AUTOMATION");

		}



		@Test(priority = 3)
		public void rankingTest(Method method) {
			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			
			scrollDown();
			Actions act = new Actions(driver);
			act.dragAndDrop(SurveyCreateobj.rankingFrom, SurveyCreateobj.rankingTo).build().perform();
			driver.switchTo().frame(SurveyCreateobj.iframeranking);
			SurveyCreateobj.rankingttitle.sendKeys("hello");
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
		
		@Test(priority = 4)
		public void rankingDeleteTest(Method method) {

			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.Delete.click();
			SurveyCreateobj.DeleteQuestion.click();
			
			WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
			Assert.assertEquals(register_text.getText(), "AUTOMATION");

		}


		@Test(priority = 5)
		public void matchingTest(Method method) {
			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			scrollDown();
			Actions act = new Actions(driver);
			act.dragAndDrop(SurveyCreateobj.matchingFrom, SurveyCreateobj.matchingTo).build().perform();
			driver.switchTo().frame(SurveyCreateobj.iframematching);
			SurveyCreateobj.rankingttitle.sendKeys("hello");
			driver.switchTo().defaultContent();
			SurveyCreateobj.matchingoptionset1first.sendKeys(Constant.GROUPING_CHOICES);
			SurveyCreateobj.matchingoptionset1second.sendKeys(Constant.GROUPING_CHOICES1);
			// SurveyCreateobj.groupingChoicesImage.click();
			if (explicitElementWait(SurveyCreateobj.matchingoptionset1image1))
				SurveyCreateobj.matchingoptionset1image1.click();
			if (explicitElementWait(SurveyCreateobj.surveygamezGallery))
				SurveyCreateobj.surveygamezGallery.click();
			if (explicitElementWait(SurveyCreateobj.groupingChoicesImage1))
				SurveyCreateobj.groupingChoicesImage1.click();
			// SurveyCreateobj.groupingChoicesImage1.click();
			if (explicitElementWait(SurveyCreateobj.surveygamezGallery1))
				SurveyCreateobj.surveygamezGallery1.click();
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// SurveyCreateobj.surveygamezGallery.click();
			if (explicitElementWait(SurveyCreateobj.groupingChoicesImage1))
				SurveyCreateobj.groupingChoicesImage1.click();
			// SurveyCreateobj.groupingChoicesImage1.click();
			if (explicitElementWait(SurveyCreateobj.surveygamezGallery1))
				SurveyCreateobj.surveygamezGallery1.click();
			SurveyCreateobj.save.click();
		}
		@Test(priority = 6)
		public void matchingDeleteTest(Method method) {

			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.Delete.click();
			SurveyCreateobj.DeleteQuestion.click();
			
			WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
			Assert.assertEquals(register_text.getText(), "AUTOMATION");

		}
		
		@Test(priority = 7)
		public void groupTest(Method method) {
			SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
			login();
			SurveyCreateobj.createsurvey.click();
			SurveyCreateobj.createsurveytitle.sendKeys(Constant.CREATE_TITLE_XPATH);
			SurveyCreateobj.createbutton.click();
			SurveyCreateobj.expand.click();
			scrollDown();
			Actions act = new Actions(driver);
			act.dragAndDrop(SurveyCreateobj.questiongroupFrom, SurveyCreateobj.questiongroupTo).build().perform();
			driver.switchTo().frame(SurveyCreateobj.iframequestiongroupe);
			SurveyCreateobj.questiongrouptitle.sendKeys("hello");
			driver.switchTo().defaultContent();
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (explicitElementWait(SurveyCreateobj.groupingsave))
				SurveyCreateobj.groupingsave.click();
		}
		
		@Test(priority = 8)
		public void questionGroupDeleteTest(Method method) {

			SurveyCreateChoicePage SurveyCreateobj = new SurveyCreateChoicePage(driver);
			movetoElement(SurveyCreateobj.welcomeLogo);
			SurveyCreateobj.Delete.click();
			SurveyCreateobj.DeleteQuestion.click();
			
		}
		



}
