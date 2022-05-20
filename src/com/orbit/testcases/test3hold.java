package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.orbit.generics.base;
import com.orbit.pom.hold;

public class test3hold extends base {
@Test
	public void hold() throws InterruptedException {
	
	hold ed = new hold(driver);
	ed.sethold();
	

}
}

