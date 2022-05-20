package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.management;

public class testmanagement extends base {

	@Test
	
	public void management() throws InterruptedException{
		
		management mn=new management(driver);
		mn.setmanagement();
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
}
