package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.orbit.pom.releasetrip;
import com.orbit.generics.base;

public class testrelease extends base{

	@Test
	
	public void  releasetrip() throws InterruptedException{
		
		releasetrip rr=new releasetrip(driver);
		rr.setreleasetrip();
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		
	}
}
