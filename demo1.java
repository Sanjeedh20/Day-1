package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		WebElement ln=driver.findElement(By.id("input-lastname"));
		ln.sendKeys("sssss");
		WebElement fn=driver.findElement(By.id("input-firstname"));
		fn.sendKeys("sssss");
		WebElement e=driver.findElement(By.id("input-email"));
		e.sendKeys("san20@gmail.com");
		WebElement p=driver.findElement(By.id("input-password"));
		p.sendKeys("sssss");
		WebElement y=driver.findElement(By.id("input-newsletter-yes"));
		y.click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.quit();
	}

}
