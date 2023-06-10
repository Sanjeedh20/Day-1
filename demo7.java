package com.selenium.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo7 {
	int a=5,b=2,c;
  @Test(priority=1)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 7);
  }
  @Test(priority=2)
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c, 3);
  }
  @Test(priority=3)
  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 10);
  }
  @Test(priority=4)
  public void div() {
	  c=a/b;
	  Assert.assertEquals(c, 2);
  }
}
