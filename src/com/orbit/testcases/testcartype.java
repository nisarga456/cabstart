package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.cartype;

public class testcartype extends base {
	
@Test

public void cartype() throws InterruptedException{
	
	cartype ct= new cartype(driver);
	ct.setcartype();
	action.sendKeys("hummer").build().perform();
	//action.sendKeys(Keys.ENTER).build().perform();
	//action.sendKeys(Keys.ESCAPE).build().perform();
	
}

}
