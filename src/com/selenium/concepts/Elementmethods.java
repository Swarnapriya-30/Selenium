package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementmethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abctech123@gmail.com");
		email.clear();
		Thread.sleep(3000);
		email.sendKeys("cbatech321@gmail.com");
		
		System.out.println("email is displayed ="+email.isDisplayed());
		System.out.println("email is enabled ="+email.isEnabled());
		Thread.sleep(3000);
		
		WebElement create_btn = driver.findElement(By.xpath("(//a[contains(@id,'u_')])[3]"));
		create_btn.click();
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("(//input[contains(@id,'u_')])[6]"));
		gender.click();
		System.out.println("Gender is Selected ="+gender.isSelected());
		Thread.sleep(3000);

		driver.quit();
		
	}
}
