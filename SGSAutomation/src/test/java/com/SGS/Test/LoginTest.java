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

import com.SGS.page.LoginPage;

import resourses.Constant;

public class LoginTest extends BaseTest{
	FileWriter writer;
    Properties property;
	LoginTest() {
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
	public void Loginpage(Method method) {
		driver.get("https://stg.surveygamez.com/");
		System.out.println("BaseUSRL:" + property.getProperty("baseURL"));

		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.EMAIL);
		lpage.password.sendKeys(Constant.PASSWORD);
		lpage.login.click();
		

		 WebElement register_text = driver.findElement(By.xpath(Constant.CHANGE_PASSWORD_FINAL_RESULTXPATH));
			Assert.assertEquals(register_text.getText(),"Enterprise");
			lpage.subhrakantSahoo.click();
			lpage.signout.click();
	}

//Negative Test cases without Password
	
	@Test(priority = 2)
	public void LoginWithoutPassword(Method method) {
		
		driver.get("https://stg.surveygamez.com/");
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.EMAIL);

		lpage.login.click();
		//lpage.survey.click();
		

		WebElement register_text = driver.findElement(By.xpath(Constant.PASSWORD_IS_REQUIRES_XPATH));
    	Assert.assertEquals(register_text.getText(),"Password is required.");
		
	}

	// Negative Test cases without ID
	@Test(priority = 3)
	public void LoginWithoutId(Method method) {
		driver.get("https://stg.surveygamez.com/");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.password.sendKeys(Constant.PASSWORD);
		lpage.login.click();
		//lpage.survey.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.EMAIL_IS_REQUIRED_XPATH));
    	Assert.assertEquals(register_text.getText(),"Email is required.");
	}

	// Negative Test cases without clicking on SignIn Button
	
	@Test(priority = 4)
	public void LoginWithoutSignIn(Method method) {
		driver.get("https://stg.surveygamez.com/");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.EMAIL);

		lpage.password.sendKeys(Constant.PASSWORD);
		//lpage.survey.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.WITHOUT_SIGNIN_XPATH));
    	Assert.assertEquals(register_text.getText(),"or sign in with your social account");

	}

	// Negative Test cases with wrong Email Id(Alphanumeric)
	
	@Test(priority = 4)
	public void LoginWithWrongAlphaNumericEmailTest(Method method) {
		driver.get("https://stg.surveygamez.com/");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.WRONG_ALPHANUMERIC_EMAIL);

		lpage.password.sendKeys(Constant.PASSWORD);

		lpage.login.click();
		//lpage.survey.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.ENTER_VALID_EMAIL_ADRESS_XPATH));
    	Assert.assertEquals(register_text.getText(),"Please enter a valid email address");

		
	}

	// Negative Test cases with wrong Password(Alphanumeric)
	
	@Test(priority = 5)
	public void LoginWithWrongAlphaNumericPassword(Method method) {
		driver.get("https://stg.surveygamez.com/");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.EMAIL);

		lpage.password.sendKeys(Constant.WRONG_ALPHANUMERIC_PASSWORD);

		lpage.login.click();
		
	}

	// Negative Test cases with wrong Email Id(Numeric)
	
	@Test(priority = 6)
	public void LoginWithWrongNumericEmail(Method method) {
		driver.get("https://stg.surveygamez.com/");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.WRONG_NUMERIC_EMAIL);

		lpage.password.sendKeys(Constant.PASSWORD);

		lpage.login.click();
		//lpage.survey.click();
		WebElement register_text = driver.findElement(By.xpath(Constant.ENTER_VALID_EMAIL_ADRESS_XPATH));
    	Assert.assertEquals(register_text.getText(),"Please enter a valid email address");


	}

	// Negative Test cases with wrong Password(Numeric)
	
	@Test(priority = 7)
	public void LoginWithWrongNumericPassword(Method method) {
		driver.get("https://stg.surveygamez.com/");
		
		LoginPage lpage = new LoginPage(driver);
		lpage.signin.click();
		lpage.email.sendKeys(Constant.EMAIL);

		lpage.password.sendKeys(Constant.WRONG_NUMERIC_PASSWORD);

		lpage.login.click();
	
		
	}

}
