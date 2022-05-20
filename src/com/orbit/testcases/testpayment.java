package com.orbit.testcases;


import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.orbit.generics.base;
import com.orbit.pom.paymentpage;

public class testpayment extends base {

@Test
	public void paymentpage() throws InterruptedException{
		
		paymentpage pp= new paymentpage(driver);
		pp.setpaymentpage();
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
}
