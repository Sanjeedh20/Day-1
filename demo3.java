package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeOptions co=new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       WebDriver driver=new ChromeDriver(co);
       
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       Thread.sleep(3000);
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000)", "");
       
       WebElement em=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
       em.sendKeys("Admin");
       
       WebElement p=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
       p.sendKeys("admin123");
       
       WebElement bt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
       bt.click();
       
       String a="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
       String b=driver.getCurrentUrl();
       if(a.equals(b)) {
    	   System.out.println("Sucess");
       }
       else {
    	   System.out.println("Failure");
       }
       Thread.sleep(3000);
       WebElement prof=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
       prof.click();
       Thread.sleep(3000);
       WebElement log=driver.findElement(By.linkText("Logout"));
       log.click();
	}

}
