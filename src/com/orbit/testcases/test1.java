package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.orbit.generics.base;
import com.orbit.pom.createtrip;

public class test1 extends base {
@Test(groups={"Smoke"})
	public void createtrip() throws InterruptedException {
	
	createtrip cr = new createtrip(driver);
	cr.setcreatetrip();
	 action.sendKeys("techa",Keys.ENTER).build().perform();
	 Thread.sleep(200);
	action.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(500);
	 action.sendKeys("maja",Keys.ENTER).build().perform();
	 Thread.sleep(500);

	 action.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(500);

	 action.sendKeys(Keys.HOME).build().perform();
	 Thread.sleep(500);
	 action.sendKeys(Keys.ESCAPE).build().perform(); 
	 
	//cr.bookbutton();
}
	

}

