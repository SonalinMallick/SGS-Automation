package com.SGS.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.SGS.page.ProfilePage;
import resourses.Constant;


public class ProfileTest extends BaseTest{
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


	ProfileTest() {
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
	
	public void login(){
		driver.get(property.getProperty("baseURL"));
	ProfilePage hpage = new ProfilePage(driver);
		hpage.signin.click();

		hpage.email.sendKeys(Constant.EMAIL);

		hpage.password.sendKeys(Constant.PASSWORD);

		hpage.login.click();

	}	
	public void logout(){
		//driver.get(property.getProperty("baseURL"));
		ProfilePage hpage = new ProfilePage(driver);
		hpage = new ProfilePage(driver);
		hpage.subhrakantSahoo.click();
		hpage.logout.click();
	}

	
	@Test(priority=1)
	public void PersonalizationTest(Method method) {
		driver.get(property.getProperty("baseURL"));
		ProfilePage hpage = new ProfilePage(driver);
    	hpage.signin.click();
    	login();
		hpage.subhrakantSahoo.click();
		hpage.profile.click();
		hpage.personalization.click();;
		hpage.Subdomainrequired_checkbox.click();
    	hpage.Subdomainrequired.sendKeys(Constant.SUBDOMAIN_REQUIRED_NAME);
		hpage.save.click();
	
	}
	
	@Test(priority=2)
	public void ChangePasswordTest(Method method) {
		ProfilePage hpage = new ProfilePage(driver);
		hpage.changePassword.click();;
		hpage.currentpassword.sendKeys(Constant.CHANGE_CURRENT_PASSWORD);
    	hpage.newpassword.sendKeys(Constant.CHANGE_NEW_PASSWORD);
    	hpage.confirmnewpassword.sendKeys(Constant.CHANGE_CONFIRMED_PASSWORD);
		hpage.cancel.click();
	    WebElement register_text = driver.findElement(By.xpath(Constant.CHANGE_PASSWORD_FINAL_RESULTXPATH));
		Assert.assertEquals(register_text.getText(),"Enterprise");
	}

	
	@Test(priority=3)
	public void TagTest(Method method) {
		ProfilePage hpage = new ProfilePage(driver);
		hpage.subhrakantSahoo.click();
    	hpage.profile.click();
		hpage.tag.click();
		hpage.Createtag.click();;
		hpage.TagName.sendKeys(Constant.TAG_NAME);
    	hpage.Save.click();
	    WebElement register_text = driver.findElement(By.xpath(Constant.CHANGE_PASSWORD_FINAL_RESULTXPATH));
		Assert.assertEquals(register_text.getText(),"Enterprise");
	}
	
	@Test(priority=4)
	public void DevloperOptionTest(Method method) {
		ProfilePage hpage = new ProfilePage(driver);
		hpage.developerOptions.click();
		hpage.copyApiId.click();
		hpage.copyapiSecret.click();
		logout();
    	
		}


}
