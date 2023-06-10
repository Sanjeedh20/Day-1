package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		//open url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//enter custid
		WebElement custid=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		custid.sendKeys("401");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		//switch to alertbox
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
		custid.clear();
		custid.sendKeys("402");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		a1.accept();
		
		//new alert box ok only type
		Alert a2=driver.switchTo().alert();
		String tString=a2.getText();
		System.out.println(tString);
		a2.accept();
		
		
	}

}
