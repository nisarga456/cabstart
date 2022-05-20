package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.notification;

public class testnotification extends base{
	
@Test

public void notification() throws InterruptedException{
	
	notification nn=new notification(driver);
	nn.setnotification();
	action.sendKeys(Keys.ESCAPE).build().perform();
}

}
