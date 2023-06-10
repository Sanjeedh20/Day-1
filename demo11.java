package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement c=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		a.clickAndHold(b).release(c).build().perform();
	}

}
