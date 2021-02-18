package com.selenium.concepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		WebElement textbox = driver. findElement(By.name("q"));
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		Thread.sleep(3000);

		ac.contextClick(textbox).click().build().perform();
		Thread.sleep(3000);
		
}
}