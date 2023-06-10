package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	//open an url
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title2="Register Account";
		if(title.equals(title2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		WebElement ln=driver.findElement(By.id("input-lastname"));
		ln.sendKeys("kumar");
		
		WebElement fn=driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		fn.sendKeys("rrrr");
	}
}
