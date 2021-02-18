package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement contact_tab = driver.findElement(By.xpath("//a[contains(text(),'CONTACT')]"));
		contact_tab.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='InputName']"));
		name.sendKeys("Swarnapriya");
	
		WebElement email = driver.findElement(By.xpath("//input[@id='InputEmail1']"));
		email.sendKeys("swarnapriya@gmail.com");
	
		WebElement mob = driver.findElement(By.xpath("//input[@id='InputSubject']"));
		mob.sendKeys("9876543210");
	
		WebElement course = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		course.sendKeys("Selenium");
		
		WebElement branch = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		branch.sendKeys("Adayar");
	
		WebElement date = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
		date.sendKeys("02/02/2021");
	
		WebElement msg = driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
		msg.sendKeys("Hello");

		WebElement submit_btn = driver.findElement(By.xpath("//button[@id='submit']"));
		submit_btn.click();
	
	
	}
	
}
