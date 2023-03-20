package com.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputUsername")).sendKeys("Ajith");
		driver.findElement(By.name("inputPassword")).sendKeys("Ajith");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ajith");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ajith@rsa.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ajith@1234");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8489051702");
		
	
	}

}
