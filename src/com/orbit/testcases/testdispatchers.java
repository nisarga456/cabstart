package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.dispatchers;

public class testdispatchers extends base{
	
@Test

public void dispatchers() throws InterruptedException{
	
	dispatchers dp= new dispatchers(driver);
	dp.setdispatchers();
	action.sendKeys(Keys.ESCAPE).build().perform();
}

	
}
