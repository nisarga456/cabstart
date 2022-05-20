package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.orbit.pom.Reviews;
import com.orbit.generics.base;

public class testreviews extends base {

@Test

public void Reviews() throws InterruptedException{
	
	Reviews rr=new Reviews(driver);
	rr.setreviews();
	action.sendKeys(Keys.ESCAPE).build().perform();
}
}
