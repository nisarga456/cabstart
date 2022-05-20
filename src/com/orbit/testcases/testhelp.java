package com.orbit.testcases;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.orbit.pom.help;
import com.orbit.generics.base;

public class testhelp extends base {
	
@Test

public void help() throws InterruptedException{
	
	help hp = new help(driver);
	hp.sethelp();
	action.sendKeys(Keys.ESCAPE).build().perform();
}

	
}
