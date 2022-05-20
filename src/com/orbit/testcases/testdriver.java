package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.Drivers;

public class testdriver extends base {
	
@Test

public void Drivers() throws InterruptedException{
	
	Drivers dr= new Drivers(driver);
	dr.setDrivers();
	action.sendKeys(Keys.ESCAPE).build().perform();

}

}
