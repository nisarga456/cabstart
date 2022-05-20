package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.offers;

public class testoffers extends base {
	
@Test

public void offers() throws InterruptedException{

	offers of=new offers(driver);
	of.setoffers();
	action.sendKeys(Keys.ESCAPE).build().perform();
}

	
}
