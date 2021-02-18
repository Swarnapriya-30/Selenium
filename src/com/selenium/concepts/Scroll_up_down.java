package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",amazon_logo );
	//	Thread.sleep(3000);
		//js.executeScript("arguments[0].scrollIntoView(false);",amazon_logo );
		
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-4000)");
		
	
	
	
	
	
	}

}
