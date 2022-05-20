package com.orbit.testcases;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orbit.generics.base;
import com.orbit.pom.settings;
public class testsettings extends base {
	
@Test

public void settings() throws InterruptedException{
	
	settings st=new settings(driver);
	st.setsettings();
	action.sendKeys(Keys.ESCAPE).build().perform();
	
}

}
