package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement simple_alert = driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",simple_alert );

		simple_alert.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
