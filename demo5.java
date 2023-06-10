package com.selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo5 {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//    	ChromeOptions co=new ChromeOptions();
//    	co.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(co);
//		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
//		driver.manage().window().maximize();
//
//try {
//	driver.findElement(By.className("form-check-inp")).click();
//} 
//catch (NoSuchElementException   e) {
//	// TODO Auto-generated catch block
//	System.out.print("Element Not found sorry");
//	//throw e;
//}
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		//open url
		driver.get("https://google.com");
		
		//wait till google search button is enabled
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		WebElement re=wait.until(ExpectedConditions.elementToBeClickable(By.className("NO89b")));
		driver.findElement(By.className("gNO89b")).submit();
		//driver.quit();
	
	}

}
