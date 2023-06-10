package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//    	ChromeOptions co1=new ChromeOptions();
//    	co1.addArguments("--remote-allow-origins=*");
//		WebDriver driver1=new ChromeDriver(co1);
//		driver1.get("https://google.com");
//		
//		WebDriverManager.chromedriver().setup();
//    	ChromeOptions co2=new ChromeOptions();
//    	co2.addArguments("--remote-allow-origins=*");
//		WebDriver driver2=new ChromeDriver(co2);
//		driver2.get("https://google.com");
//		
//		WebDriverManager.chromedriver().setup();
//    	ChromeOptions co3=new ChromeOptions();
//    	co3.addArguments("--remote-allow-origins=*");
//		WebDriver driver3=new ChromeDriver(co3);
//		driver3.get("https://google.com");
//		
//		driver1.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple");
//		driver1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).submit();
//		System.out.println(driver1.getWindowHandle());
//		
//		driver2.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
//		driver2.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).submit();
//		System.out.println(driver2.getWindowHandle());
//		
//		driver3.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber");
//		driver3.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).submit();
//		System.out.println(driver3.getWindowHandle());
//		
//		System.out.println(driver1.getCurrentUrl());
//		System.out.println(driver2.getCurrentUrl());
//		System.out.println(driver3.getCurrentUrl());
//		System.out.println(driver1.getTitle());
//		System.out.println(driver2.getTitle());
//		System.out.println(driver3.getTitle());
		
		//Apple
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	
		//driver.switchTo().newWindow(WindowType.TAB);
		//Selenium
		WebDriver driver1=new ChromeDriver(co);
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		driver1.findElement(By.name("q")).sendKeys("Selenium");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getWindowHandle());
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//Cucumber
				WebDriver driver2=new ChromeDriver(co);
				driver2.manage().window().maximize();
				driver2.get("https://www.google.com");
				driver2.findElement(By.name("q")).sendKeys("Cucumber");
				driver2.findElement(By.name("q")).sendKeys(Keys.ENTER);
				System.out.println(driver2.getTitle());
				System.out.println(driver2.getWindowHandle());

		
	}
}
