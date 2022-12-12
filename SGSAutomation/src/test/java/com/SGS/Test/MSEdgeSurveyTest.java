package com.SGS.Test;

import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class MSEdgeSurveyTest {


	@Test(priority = 1)
	public void msEdgetest(Method method) {
		
		System.setProperty("webdriver.edge.driver", "E:\\PROJECTS\\SGS-Automation\\SGSAutomation\\Drivers\\msedgedriver.exe");

		
		WebDriver driver = new EdgeDriver();

		driver.get("https://stg.surveygamez.com/");

		//driver.quit();
	

}

	
}
