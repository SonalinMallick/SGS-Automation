package com.SGS.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshort {
	public static String baseURL = "https://stg.surveygamez.com/";
	public static WebDriver driver;

	public static void captureScreenMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile,
					new File("E:\\sonalin_workspace\\SGS\\screenshort\\S1.png"));
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}

		driver.close();
		driver.quit();
	}

}
