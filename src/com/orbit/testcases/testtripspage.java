package com.orbit.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.orbit.generics.base;
import com.orbit.pom.tripspage;

public class testtripspage extends base{
@Test

public void tripspage() throws InterruptedException{
	
	tripspage tp = new tripspage(driver);
	tp.settripspage();
	action.sendKeys(Keys.ESCAPE).build().perform(); 
	
}

}
