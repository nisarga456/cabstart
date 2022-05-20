package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.customer;

public class testcustomer extends base {
@Test

public void customer() throws InterruptedException{
	
	customer tp = new customer(driver);
	tp.setcustomer();
	action.sendKeys(Keys.ESCAPE).build().perform();
}
}

