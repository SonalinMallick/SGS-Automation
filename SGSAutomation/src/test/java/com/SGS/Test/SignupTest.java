package com.SGS.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SGS.page.SignupPage;

import resourses.Constant;


public class SignupTest extends BaseTest{
	FileWriter writer;
	Properties property;

	public SignupTest() {
		try {
			writer = new FileWriter(
					"E:\\sonalin_workspace\\SGS\\src\\test\\java\\resourses\\login.properties");
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
	
	
	
	@BeforeClass
	public void setupClass(ITestContext method)
	{
		System.out.println("beforeClass");
		super.setup(method);
	}
	
	@AfterClass
	public void closeClass()
	{
		System.out.println("AfterClass");
		super.tearDown();
	}

	@Test(priority = 1)
	public void SignupPageTest(Method method) {
		driver.get(property.getProperty("baseURL"));
		SignupPage spage = new SignupPage(driver);
		spage.signUp.click();
		spage.name.sendKeys(Constant.NAME);
		spage.email.sendKeys(Constant.EMAIL);

		spage.password.sendKeys(Constant.PASSWORD);
		spage.confirmPassword.sendKeys(Constant.CONFIRM_PASSWORD);

		spage.signUpSubmit.click();
		
	}
	//Negative Test cases without Name
	@Test(priority = 2)
	public void SignupPageWithoutNameTest(Method method) {
		driver.get(property.getProperty("baseURL"));
		SignupPage spage = new SignupPage(driver);
		spage.signUp.click();
		spage.email.sendKeys(Constant.EMAIL);
        spage.password.sendKeys(Constant.PASSWORD);
		spage.confirmPassword.sendKeys(Constant.CONFIRM_PASSWORD);
		spage.signUpSubmit.click();
		//spage.survey.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.NAME_IS_REQUIRED_XPATH));
        Assert.assertEquals(register_text.getText(),"Name is required.");

	}
	//Negative Test cases withoutSignUp
		@Test(priority = 3)
		public void SignupPageWithoutsignUpTest(Method method) {
			driver.get(property.getProperty("baseURL"));

			SignupPage spage = new SignupPage(driver);
			spage.signUp.click();
			spage.email.sendKeys(Constant.EMAIL);
	        spage.password.sendKeys(Constant.PASSWORD);
			spage.password.sendKeys(Constant.CONFIRM_PASSWORD);
			spage.signUpSubmit.click();
			//spage.survey.click();
			
			WebElement register_text = driver.findElement(By.xpath(Constant.NAME_IS_REQUIRED_XPATH));
	        Assert.assertEquals(register_text.getText(),"Name is required.");

	       

		}

		//Negative Test cases withoutPassword
		@Test(priority =4 )
		public void SignupPagewithoutPasswordTest(Method method) {
			driver.get(property.getProperty("baseURL"));

			SignupPage spage = new SignupPage(driver);
			spage.signUp.click();
			spage.name.sendKeys(Constant.NAME);
			spage.email.sendKeys(Constant.EMAIL);
            spage.password.sendKeys(Constant.CONFIRM_PASSWORD);
           
            spage.signUpSubmit.click();
          // spage.survey.click();
    		WebElement register_text = driver.findElement(By.xpath(Constant.CONFIRM_PASSWORD_REQUIRED_XPATH));
       	Assert.assertEquals(register_text.getText(),"Confirm password is required.");

		}
		//Negative Test cases withoutConfirmPassword
		@Test(priority = 5)
		public void SignupPagewithoutConfirmPasswordTest(Method method) {
			driver.get(property.getProperty("baseURL"));

			SignupPage spage = new SignupPage(driver);
			spage.signUp.click();
			spage.name.sendKeys(Constant.NAME);
			spage.email.sendKeys(Constant.EMAIL);

			spage.password.sendKeys(Constant.PASSWORD);
			
			spage.signUpSubmit.click();
			WebElement register_text = driver.findElement(By.xpath(Constant.CONFIRM_PASSWORD_REQUIRED_XPATH));
	       	Assert.assertEquals(register_text.getText(),"Confirm password is required.");

		}
		//Negative Test cases withonly_name_signup
				@Test(priority = 6)
				public void SignupPagewith_name_signupTest(Method method) {
					driver.get(property.getProperty("baseURL"));

					SignupPage spage = new SignupPage(driver);
					spage.signUp.click();
					spage.name.sendKeys(Constant.NAME);
					spage.signUpSubmit.click();
					WebElement register_text = driver.findElement(By.xpath(Constant.CONFIRM_PASSWORD_REQUIRED_XPATH));
			       	Assert.assertEquals(register_text.getText(),"Confirm password is required.");

				}
				
				//Negative Test cases withoutEmail
				@Test(priority=7)
				public void SignupPagewithoutEmailTest(Method method) {
					driver.get(property.getProperty("baseURL"));

					SignupPage spage = new SignupPage(driver);
					spage.signUp.click();
					spage.name.sendKeys(Constant.NAME);
			        spage.password.sendKeys(Constant.PASSWORD);
					spage.password.sendKeys(Constant.CONFIRM_PASSWORD);
					spage.signUpSubmit.click();
           		WebElement register_text = driver.findElement(By.xpath(Constant.EMAIL_IS_REQUIRED_XPATH));
               	Assert.assertEquals(register_text.getText(),"Email is required.");

				}
				

}
