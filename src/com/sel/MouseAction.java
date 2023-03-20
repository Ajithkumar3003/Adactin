package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"))).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN); 
		r.keyPress(KeyEvent.VK_ENTER);;
		
	    //int win =driver.getWindowHandles().size();
	    //System.out.println(win);

	}

}
