package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.orbit.generics.base;
import com.orbit.pom.edittrip;

public class test2edit extends base {
@Test
	public void editrip() throws InterruptedException {
	
	edittrip ed = new edittrip(driver);
	ed.setedittrip();
	
	 //action.sendKeys(Keys.HOME).build().perform();	
	// action.sendKeys(Keys.values()).build().perform();
}
}