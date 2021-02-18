package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
}
