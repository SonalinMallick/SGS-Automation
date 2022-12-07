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
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	SurveyCreateobj.shortTexttitle.sendKeys("hello");
	driver.switchTo().defaultContent();
	if (explicitElementWait(SurveyCreateobj.shortTextSave))
		SurveyCreateobj.shortTextSave.click();
	
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
	SurveyCreateobj.Delete.click();
	SurveyCreateobj.DeleteQuestion.click();
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}
@Test(priority = 6)
public void longTextTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	driver.get("https://stg.surveygamez.com/");
	SurveyCreateobj.createsurvey.click();
	SurveyCreateobj.createsurveytitle.sendKeys(Constant.CREATE_TITLE_XPATH);
	SurveyCreateobj.createbutton.click();
	SurveyCreateobj.expand.click();
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.longTextFrom, SurveyCreateobj.longTextTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iframelongText);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	SurveyCreateobj.longTexttitle.sendKeys("hello");
	driver.switchTo().defaultContent();
	if (explicitElementWait(SurveyCreateobj.longTextSave))
		SurveyCreateobj.longTextSave.click();

}

@Test(priority = 7)
public void longTextTagTest(Method method) {
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
public void longtextLogicTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationLogic.click();
	SurveyCreateobj.chooseNextLogicJump.click();
	SurveyCreateobj.chooseNextLogicJumpClose.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 9)
public void longTextCopyTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationCopy.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 10)
public void longTextDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.longTextDelete.click();
	SurveyCreateobj.longTextDeleteQuestion.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}
@Test(priority = 11)
public void numberTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.numberFrom, SurveyCreateobj.numberTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iFrameWelcome);
	SurveyCreateobj.numberttitle.sendKeys("hello");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.switchTo().defaultContent();
	SurveyCreateobj.numberMinValue.click();
	SurveyCreateobj.numberMinValue.sendKeys(Constant.DATAENTRY_NUMBERT_MINIMUM_VALUE);
	SurveyCreateobj.numberMaxValue.click();
	SurveyCreateobj.numberMaxValue.sendKeys(Constant.DATAENTRY_NUMBER_MAXIMUM_VALUE);
	if (explicitElementWait(SurveyCreateobj.numberSave))
		SurveyCreateobj.numberSave.click();

}

@Test(priority = 12)
public void numberTagTest(Method method) {
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

@Test(priority = 13)
public void numberLogicTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationLogic.click();
	SurveyCreateobj.chooseNextLogicJump.click();
	SurveyCreateobj.chooseNextLogicJumpClose.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 14)
public void numberCopyTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationCopy.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}


@Test(priority = 15)
public void numberDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.Delete.click();
	SurveyCreateobj.DeleteQuestion.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}


@Test(priority = 16)
public void dateTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.dateFrom, SurveyCreateobj.dateTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iFrameWelcome);
	SurveyCreateobj.datettitle.sendKeys("hello");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.switchTo().defaultContent();
	if (explicitElementWait(SurveyCreateobj.dateSave))
		SurveyCreateobj.dateSave.click();

}

@Test(priority = 17)
public void dateDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.Delete.click();
	SurveyCreateobj.DeleteQuestion.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}
@Test(priority = 18)
public void uploadTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.uploadFrom, SurveyCreateobj.uploadTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iframeupload);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	SurveyCreateobj.uploadttitle.sendKeys("hello");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if (explicitElementWait(SurveyCreateobj.uploadSave))
		SurveyCreateobj.uploadSave.click();


}
@Test(priority = 19)
public void uploadDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	SurveyCreateobj.Delete.click();
	SurveyCreateobj.DeleteQuestion.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 20)
public void PasswordTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.passwordFrom, SurveyCreateobj.passwordTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iframepassword);
	SurveyCreateobj.passwordttitle.sendKeys("hello");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	SurveyCreateobj.dataentryPassword.sendKeys(Constant.DATAENTRY_PASSWORD_ENTER);
	
	driver.switchTo().defaultContent();
	if (explicitElementWait(SurveyCreateobj.dataentryPasswordSave))
		SurveyCreateobj.dataentryPasswordSave.click();
}


@Test(priority =21)
public void passwordTagTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.passwordTag.click();
	if (explicitElementWait(SurveyCreateobj.passwordAddTag))
		SurveyCreateobj.passwordAddTag.click();
	SurveyCreateobj.passwordAddTagNonSelected.click();
	SurveyCreateobj.passwordAddTagNonSelectedAutomation.click();
	SurveyCreateobj.passwordAddTagNonSelectedApply.click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if (explicitElementWait(SurveyCreateobj.passwordAddTagNonSelectedClose))
		SurveyCreateobj.passwordAddTagNonSelectedClose.click();
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}


@Test(priority = 22)
public void passwordCopyTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.informationCopy.click();

	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}

@Test(priority = 23)
public void PasswordDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.Delete.click();
	SurveyCreateobj.DeleteQuestion.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}





@Test(priority = 24)
public void locationTest(Method method) {
	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	Actions act = new Actions(driver);
	act.dragAndDrop(SurveyCreateobj.locationFrom, SurveyCreateobj.locationTo).build().perform();
	driver.switchTo().frame(SurveyCreateobj.iframelocation);
	SurveyCreateobj.locationttitle.sendKeys("hello");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.switchTo().defaultContent();
	if (explicitElementWait(SurveyCreateobj.locationSave))
		SurveyCreateobj.locationSave.click();
	

}
@Test(priority = 25)
public void locationDeleteTest(Method method) {

	SurveyCreatePage SurveyCreateobj = new SurveyCreatePage(driver);
	movetoElement(SurveyCreateobj.welcomeLogo);
	SurveyCreateobj.Delete.click();
	SurveyCreateobj.DeleteQuestion.click();
	
	WebElement register_text = driver.findElement(By.xpath(Constant.AUTOMATION_FINAL_RESULT_XPATH));
	Assert.assertEquals(register_text.getText(), "AUTOMATION");

}





}