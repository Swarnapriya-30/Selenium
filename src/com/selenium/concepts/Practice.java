package com.selenium.concepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("qwertyasdf@gmail.com");
		
		WebElement create_acc = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		create_acc.click();
		Thread.sleep(6000);
		
		WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
		gender.click();
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("hfuhkhg");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname.sendKeys("igjkljjg");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("9876543210");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day);
		s.selectByValue("10");
		Thread.sleep(3000);
			
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1= new Select(month);
		s1.selectByValue("5");
		Thread.sleep(3000);
	
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2=new Select(year);
		s2.selectByValue("1998");
		Thread.sleep(3000);
		
		
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='checkbox']"));
		checkbox1.click();
		Thread.sleep(3000);
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='optin']"));
		checkbox2.click();
		Thread.sleep(3000);
		
		WebElement firstname1 = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname1.sendKeys("whnvkass");
		Thread.sleep(3000);
		
		WebElement lastname1 = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastname1.sendKeys("kdgklub");
		Thread.sleep(3000);
		
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("jhkkkkkyqqfv");
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("fnjhg");
		Thread.sleep(6000);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3=new Select(state);
		s3.selectByValue("32");
		Thread.sleep(3000);
		
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postcode']"));
		zipcode.sendKeys("6543210");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select s4=new Select(country);
		s4.selectByValue("21");
		Thread.sleep(3000);
		
		WebElement mob_num = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mob_num.sendKeys("9876543210");
		
		WebElement alias_add = driver.findElement(By.xpath("//input[@id='alias']"));
		alias_add.sendKeys("nothing");
		Thread.sleep(3000);
		
		WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		register.click();
	
	}
}
