package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo6 {
	WebDriver driver;
	@BeforeTest
	public void a() {
		WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://www.google.com");
		
	}
	@AfterTest
	   public void after() {
		  driver.quit();
		  
	   }
  @Test
  public void f() {
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://demo.wpeverest.com/user-registration/guest-registration-form/");
  }
}
