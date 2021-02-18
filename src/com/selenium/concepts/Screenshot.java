package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile =new File("C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\facebook.png");
		FileUtils.copyFile(srcFile, desFile);
		
	}

}
