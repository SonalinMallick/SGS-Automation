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
import com.SGS.page.SurveyCreatePage;

import resourses.Constant;

public class SurveyCreateTest extends BaseTest {
	FileWriter writer;
	Properties property;
	// SurveyCreatePage SurveyCreateobj;

	@BeforeClass
	public void setupClass(ITestContext method) {
		super.setup(method);
	}

	@AfterClass
	public void closeClass(ITestContext method) {
		super.tearDown();
	}

	SurveyCreateTest() {
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
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
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
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		SurveyCreateobj.subhrakantSahoo.click();
		SurveyCreateobj.logout.click();
	}
//	@Test(priority = 1)
//	public void newtabtest(Method method) {
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://stg.surveygamez.com/");
//
//		// logout();
//
//	}

	
	
	
	@Test(priority = 11)
	public void thankyouTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);

		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.thankyouFrom, SurveyCreateobj.thankyouTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframethankyou);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SurveyCreateobj.thankyoutitle.sendKeys("hello");
		driver.switchTo().defaultContent();
		if (explicitElementWait(SurveyCreateobj.save))
			SurveyCreateobj.save.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 12)
	public void thankyouTagTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.thankyouFrom, SurveyCreateobj.thankyouTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframethankyou);
		SurveyCreateobj.iFrameWelcomeTitle.sendKeys("Hello");
		driver.switchTo().defaultContent();

		if (explicitElementWait(SurveyCreateobj.save))
			SurveyCreateobj.save.click();
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.thankyouTag.click();
		if (explicitElementWait(SurveyCreateobj.thankyouAddTag))
			SurveyCreateobj.thankyouAddTag.click();
		// spage.DuplicateanexistingWelcomeAddTag.click();
		SurveyCreateobj.thankyouAddTagNonSelected.click();
		SurveyCreateobj.thankyouAddTagNonSelectedAutomation.click();
		SurveyCreateobj.thankyouAddTagNonSelectedApply.click();
		SurveyCreateobj.thankyouAddTagNonSelectedClose.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 13)
	public void thankyouDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.thankyouDelete.click();
		SurveyCreateobj.thankyouDeleteQuestions.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 14)
	public void ShortTextTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.shortTextFrom, SurveyCreateobj.shortTextTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframeshortText);
		SurveyCreateobj.shortTexttitle.sendKeys("hello");
		driver.switchTo().defaultContent();
		if (explicitElementWait(SurveyCreateobj.save))
			SurveyCreateobj.save.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 15)
	public void ShortTextTagTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationTag.click();
		if (explicitElementWait(SurveyCreateobj.informationAddTag))
			SurveyCreateobj.informationAddTag.click();
		SurveyCreateobj.informationAddTagNonSelected.click();
		SurveyCreateobj.informationAddTagNonSelectedAutomation.click();
		SurveyCreateobj.informationAddTagNonSelectedApply.click();
		if (explicitElementWait(SurveyCreateobj.informationAddTagNonSelectedClose))
			SurveyCreateobj.informationAddTagNonSelectedClose.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 16)
	public void ShortTextLogicTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationLogic.click();
		SurveyCreateobj.chooseNextLogicJump.click();
		SurveyCreateobj.chooseNextLogicJumpClose.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 17)
	public void ShortTextCopyTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationCopy.click();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 18)
	public void ShortTextDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.informationDelete.click();
		SurveyCreateobj.informationDeleteQuestions.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 19)
	public void longTextTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.longTextFrom, SurveyCreateobj.longTextTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframelongText);
		SurveyCreateobj.longTexttitle.sendKeys("hello");
		driver.switchTo().defaultContent();
		if (explicitElementWait(SurveyCreateobj.save))
			SurveyCreateobj.save.click();

	}
	@Test(priority = 20)
	public void longTextDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.longTextDelete.click();
		SurveyCreateobj.longTextDeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}


	@Test(priority = 21)
	public void numberTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.numberFrom, SurveyCreateobj.numberTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iFrameWelcome);
		SurveyCreateobj.numberttitle.sendKeys("india");
		SurveyCreateobj.numberMinValue.click();
		SurveyCreateobj.numberMinValue.sendKeys(Constant.DATAENTRY_NUMBERT_MINIMUM_VALUE);
		SurveyCreateobj.numberMaxValue.click();
		SurveyCreateobj.numberMaxValue.sendKeys(Constant.DATAENTRY_NUMBER_MAXIMUM_VALUE);
		SurveyCreateobj.save.click();

	}
	
	@Test(priority = 22)
	public void numberDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 23)
	public void dateTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.dateFrom, SurveyCreateobj.dateTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iFrameWelcome);
		SurveyCreateobj.datettitle.sendKeys("capital");
		SurveyCreateobj.save.click();

	}
	
	@Test(priority = 24)
	public void dateDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}


	@Test(priority = 25)
	public void uploadTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.uploadFrom, SurveyCreateobj.uploadTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframeupload);
		SurveyCreateobj.uploadttitle.sendKeys("district");
		SurveyCreateobj.save.click();

	}
	@Test(priority = 26)
	public void uploadDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 27)
	public void PasswordTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.passwordFrom, SurveyCreateobj.passwordTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframepassword);
		SurveyCreateobj.passwordttitle.sendKeys("district");
		SurveyCreateobj.dataentryPassword.sendKeys(Constant.DATAENTRY_PASSWORD_ENTER);
		SurveyCreateobj.save.click();
	}
	
	@Test(priority = 28)
	public void PasswordDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}


	@Test(priority = 29)
	public void locationTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		Actions act = new Actions(driver);
		act.dragAndDrop(SurveyCreateobj.locationFrom, SurveyCreateobj.locationTo).build().perform();
		driver.switchTo().frame(SurveyCreateobj.iframelocation);
		SurveyCreateobj.locationttitle.sendKeys("Hello");
		SurveyCreateobj.save.click();

	}
	@Test(priority = 30)
	public void locationDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	
	@Test(priority = 31)
	public void multipleChoiceTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
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
		
		if (explicitElementWait(SurveyCreateobj.groupingsave))
			SurveyCreateobj.groupingsave.click();
	}
	
	@Test(priority = 32)
	public void multipleChoiceDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	@Test(priority = 33)
	public void imageChoiceTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
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

		if (explicitElementWait(SurveyCreateobj.groupingsave))
			SurveyCreateobj.groupingsave.click();
	}
	
	@Test(priority = 34)
	public void imageChoiceDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}

	
	@Test(priority = 35)
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
	@Test(priority = 36)
	public void dropDownDeleteTest(Method method) {

		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		movetoElement(SurveyCreateobj.welcomeLogo);
		SurveyCreateobj.Delete.click();
		SurveyCreateobj.DeleteQuestion.click();
		
		WebElement register_text = driver.findElement(By.xpath(Constant.LOGIN_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}


	
	
	@Test(priority = 43)
	public void createDuplicateAnexistingsurvey(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		//login();
		driver.get("https://stg.surveygamez.com/");
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

	@Test(priority = 44)
	public void cancelDuplicateAnexistingsurvey(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		login();
		SurveyCreateobj.createsurvey.click();
		SurveyCreateobj.Duplicateanexistingsurvey.click();
		SurveyCreateobj.DuplicateanexistingsurveyTitle.clear();
		SurveyCreateobj.DuplicateanexistingsurveyTitle.sendKeys(Constant.DUPLICATE_OF_AN_EXITING_SURVEY_TITLE);
		SurveyCreateobj.DuplicateanexistingSelectsurvey.click();
		SelectAutomation();
		SurveyCreateobj.DuplicateanexistingSelectsurvey.click();
		scrollDown();
		SurveyCreateobj.DuplicateanexistingCancelButton.click();
		logout();

		WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
		Assert.assertEquals(register_text.getText(), "Gamify Your Surveys");
	}

	@Test(priority = 45)
	public void previewTest(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
		login();
		SurveyCreateobj.preview.click();
		SurveyCreateobj.previewClose.click();
		logout();
	}

	@Test(priority = 46)
	public void DuplicateAnexistingsurveyWelcome(Method method) {
		SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
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
		SurveyCreateobj.iFrameWelcomeTitle.sendKeys("Hello");

		driver.switchTo().defaultContent();

		if (explicitElementWait(SurveyCreateobj.save))
			SurveyCreateobj.save.click();
		logout();

		
	}

	
}