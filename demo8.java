package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo8 {
	WebDriver driver;
	
	@BeforeTest
		 public void bt() throws Exception{
			  WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  driver.manage().window().maximize();
			  Thread.sleep(3000); 
		  }
	
  @Test
  public void f() throws Exception{
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(3000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  @AfterTest
  public void at() {
	  driver.quit();
  }
}
