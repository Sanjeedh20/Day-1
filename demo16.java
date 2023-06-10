package com.selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class demo16 {
  @Test
  public void add(Integer n, Integer s) {
	  int a=5,b=2,c;
	  System.out.println(a+b);
  }
  @Test(dataProvider = "dp")
  public void sub(Integer n, Integer s) {
	  System.out.println(n-s);
  }
  @Test(dataProvider = "dp")
  public void mul(Integer n, Integer s) {
	  System.out.println(n*s);
  }
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  System.out.println(n/s);
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 5,2},
      new Object[] { 10,5 },
    };
  }
}
