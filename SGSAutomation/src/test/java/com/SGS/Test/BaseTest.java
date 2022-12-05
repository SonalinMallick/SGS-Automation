package com.SGS.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	FileReader reader;
	Properties property;
	public static WebDriver driver;

	public void setup(ITestContext method) {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\sonalin_workspace\\SGS\\Drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try {
			reader = new FileReader("E:\\sonalin_workspace\\SGS\\src\\test\\java\\resourses\\login.properties");
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.get(property.getProperty("baseURL"));
		driver.manage().window().maximize();
	}

	public void tearDown() {
		System.out.println("AfterClass");	
//		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getScreenShotPath(String testMethodName, WebDriver driver) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\screenshort\\" + testMethodName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
	
	boolean explicitElementWait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if (element.isDisplayed() || element.isEnabled())
			return true;
		else
			return false;		
	}
	public void movetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element);
		a.perform();
		// move to an element
	}
}