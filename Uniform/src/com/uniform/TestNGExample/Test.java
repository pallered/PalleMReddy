package com.uniform.TestNGExample;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;




public class Test {
	
	
	WebDriver driver = new FirefoxDriver();

		
		
	
	@org.testng.annotations.BeforeTest
	public void f1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.141.59 (1)\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver.get("http://uniformm1.upskills.in/admin/");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-tags fa-fw']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='catalog']/ul/li[1]/a")).click();
		
		/*Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='parent']"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Categories')]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Products')]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Recurring Profiles')]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Filters')]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Attributes')]"))).perform();*/
		
		
	}
	
	
}
