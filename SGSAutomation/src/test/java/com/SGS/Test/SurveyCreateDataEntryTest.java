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

public class SurveyCreateDataEntryTest extends BaseTest{
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

SurveyCreateDataEntryTest() {
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
public void ShortTextTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	login();
	SurveyCreateobj.createsurvey.click();
	SurveyCreateobj.createsurveytitle.sendKeys(Constant.CREATE_TITLE_XPATH);
	SurveyCreateobj.createbutton.click();
	SurveyCreateobj.expand.click();
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

@Test(priority = 2)
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

@Test(priority = 3)
public void ShortTextLogicTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationLogic.click();
	SurveyCreateobj.chooseNextLogicJump.click();
	SurveyCreateobj.chooseNextLogicJumpClose.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 4)
public void ShortTextCopyTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationCopy.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 5)
public void ShortTextDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationDelete.click();
	SurveyCreateobj.informationDeleteQuestions.click();
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

}