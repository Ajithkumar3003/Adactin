package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		//Thread.sleep(5000);
		/*driver.findElement(By.id("username")).sendKeys("Ajithkumar");
		driver.findElement(By.name("password")).sendKeys("Yacoob is a kolaru");
		driver.findElement(By.name("re_password")).sendKeys("Yacoob is a kolaru");
		driver.findElement(By.name("full_name")).sendKeys("Ajithkumar K");
		driver.findElement(By.name("email_add")).sendKeys("ajith@abc.com");
		driver.findElement(By.name("tnc_box")).click();*/
		
		driver.findElement(By.id("username")).sendKeys("Ambrosesusi");
		driver.findElement(By.id("password")).sendKeys("Adactin@3003");
		driver.findElement(By.className("login_button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"location\"])"));
		
		Select s = new Select(driver.findElement(By.id("location")));
		s.selectByIndex(1);
		
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id='hotels']")));
		s1.selectByValue("Hotel Sunshine");
		
		Select s2 = new Select(driver.findElement(By.xpath("//*[@id=\"room_type\"]")));
		s2.selectByVisibleText("Standard");
		
		Select s3 = new Select(driver.findElement(By.xpath("//*[@id=\"room_nos\"]")));
		s3.selectByValue("2");
	
        driver.findElement((By.xpath("//*[@id=\"datepick_in\"]"))).sendKeys("25/03/2023");
		driver.findElement((By.xpath("//*[@id=\"datepick_out\"]"))).sendKeys("26/03/2023");
		
		Select s4 =new Select(driver.findElement(By.xpath("//*[@id=\"adult_room\"]")));
		s4.selectByValue("1");
		
		Select s5=new Select(driver.findElement(By.xpath("//*[@id=\"child_room\"]")));
		s5.selectByIndex(0);
		
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Ajithkumar");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Ajithkumar");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Velachery-600042");
		driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567891234567");
		
		Select s6= new Select(driver.findElement(By.xpath("//*[@id=\"cc_type\"]")));
		s6.selectByValue("AMEX");
		
		Select s7= new Select(driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]")));
		s7.selectByValue("3");
		
		Select s8= new Select(driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]")));
		s8.selectByValue("2012");
		
		driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"book_now\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"my_itinerary\"]")).click();
		
		
		
		
	}

}
