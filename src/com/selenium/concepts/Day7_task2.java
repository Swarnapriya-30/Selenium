package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_task2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		//WebElement logo_img = driver.findElement(By.id("Nzg2OjM3NA==-1"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);

		TakesScreenshot ts =(TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\Task2.png");
		FileUtils.copyFile(srcFile, desFile);
		Thread.sleep(2000);
	
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);

		driver.quit();
		
		
		
}
}
