package com.SGS.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SGS.page.SurveyCreatePage;

import resourses.Constant;

public class SurveyCreateCourtesyTest extends BaseTest{
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

SurveyCreateCourtesyTest() {
	try {
		writer = new FileWriter("E:\\sonalin_workspace\\SGS\\src\\test\\java\\resourses\\login.properties");
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
public void logout() {
	// driver.get(property.getProperty("baseURL"));
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	SurveyCreateobj.subhrakantSahoo.click();
	SurveyCreateobj.logout.click();
}

@Test(priority = 1)
public void createsurvey(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	login();
	SurveyCreateobj.createsurvey.click();
	SurveyCreateobj.createsurveytitle.sendKeys(Constant.CREATE_TITLE_XPATH);
	SurveyCreateobj.createbutton.click();

	// logout();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 2)
public void welcomeTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
//	//login();
	SurveyCreateobj.expand.click();
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.welcomeFrom, SurveyCreateobj.welcomeTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iFrameWelcome);

	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	SurveyCreateobj.iFrameWelcomeTitle.sendKeys("hello");
	// SurveyCreateobj.iFrameWelcomeTitle.click();
	driver.switchTo().defaultContent();
	if (explicitElementWait(SurveyCreateobj.save))
		SurveyCreateobj.save.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

	// logout();

}

@Test(priority = 3)
public void WelcomeTagTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.WelcomeTag.click();
	if (explicitElementWait(SurveyCreateobj.WelcomeAddTag))
		SurveyCreateobj.WelcomeAddTag.click();
	SurveyCreateobj.WelcomeAddTagNonSelected.click();
	SurveyCreateobj.WelcomeAddTagNonSelectedAutomation.click();
	SurveyCreateobj.WelcomeAddTagNonSelectedAutomationApply.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if (explicitElementWait(SurveyCreateobj.AddNonselectedAutomationApplyClose))
		SurveyCreateobj.AddNonselectedAutomationApplyClose.click();
	

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 4)
public void WelcomeDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.welcomeDelete.click();
	//SurveyCreateobj.welcomeDeleteQuestion.click();
	if (explicitElementWait(SurveyCreateobj.welcomeDeleteQuestion))
		SurveyCreateobj.welcomeDeleteQuestion.click();
	

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}
@Test(priority = 5)
public void informationTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.informationFrom, SurveyCreateobj.informationTo).build().perform();
	
	driver.switchTo().frame(SurveyCreateobj.informationhellopage);
	if (explicitElementWait(SurveyCreateobj.informatiocontinuepage))
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(SurveyCreateobj.iframeinformation);
		SurveyCreateobj.informationtitle.sendKeys("hello");
	}
	
	
	driver.switchTo().defaultContent();
	SurveyCreateobj.informationhellopage.click();
	
	if (explicitElementWait(SurveyCreateobj.informationSave))
		SurveyCreateobj.informationSave.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 6)
public void informationTagTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	//SurveyCreateobj.informationTag.click();
	if (explicitElementWait(SurveyCreateobj.informationTag))
		SurveyCreateobj.informationTag.click();
	if (explicitElementWait(SurveyCreateobj.informationAddTag))
		SurveyCreateobj.informationAddTag.click();
	SurveyCreateobj.informationAddTagNonSelected.click();
	SurveyCreateobj.informationAddTagNonSelectedAutomation.click();
	SurveyCreateobj.informationAddTagNonSelectedApply.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if (explicitElementWait(SurveyCreateobj.informationAddTagNonSelectedClose))
		SurveyCreateobj.informationAddTagNonSelectedClose.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}
@Test(priority = 7)
public void informationLogicTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationLogic.click();
	SurveyCreateobj.chooseNextLogicJump.click();
	SurveyCreateobj.chooseNextLogicJumpClose.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}


@Test(priority = 8)
public void informationDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationDelete.click();
	SurveyCreateobj.informationDeleteQuestions.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 9)
public void thankyouTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);

	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.thankyouFrom, SurveyCreateobj.thankyouTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.informationhellopage);
	
		driver.switchTo().defaultContent();
	 driver.switchTo().frame(SurveyCreateobj.iframethankyou);
	 SurveyCreateobj.thankyoutitle.sendKeys("hello");
	
	driver.switchTo().defaultContent();
	 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	if (explicitElementWait(SurveyCreateobj.thankyouSave))
		SurveyCreateobj.thankyouSave.click();
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

	}
	

@Test(priority = 10)
public void thankyouTagTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
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

@Test(priority = 11)
public void thankyouDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.thankyouDelete.click();
	SurveyCreateobj.thankyouDeleteQuestions.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}



}