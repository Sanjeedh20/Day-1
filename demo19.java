package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo19 {
	 WebDriver driver;
		@Test
	  public void f() throws Exception {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  }
	  
		@BeforeMethod
	  public void beforeMethod() {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
	  }

	  
		@AfterTest
	  public void afterTest() {
	  }
}
