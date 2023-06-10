package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo4 {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
	    	ChromeOptions co=new ChromeOptions();
	    	co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
		//open an url
			driver.get("https://j2store.net/free/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,1000)","");
	    	driver.findElement(By.linkText("Clothing (5)")).click();
	    	
	    	List<WebElement> l2=driver.findElements(By.className("product-title"));
	    	for(WebElement e1:l2)
	    	{
	    		System.out.println(e1.getText()+" hai");
	    		
	    	}
	    	
//	    	List<WebElement> l1=driver.findElements(By.xpath("//h2[@class='product-title']"));
//	    	for(WebElement link:l1)
//	    	{
//	    		System.out.println(link.getText());
//	    	}
	}

}
