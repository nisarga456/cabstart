package com.orbit.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.orbit.generics.base;
import com.orbit.pom.Viewtrip;

public class viewtest extends base {
@Test	
	public void Viewtrip() throws InterruptedException{
		
		Viewtrip ve=new Viewtrip(driver);
		ve.setViewtrip(" ");
	}

}
