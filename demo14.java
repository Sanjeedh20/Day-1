package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Chennai");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','04/10/2023')", date);
		
	}

}
