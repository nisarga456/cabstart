package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewtrip {
	
	@FindBy(xpath="(//a[@class=\"color_foter_opt color_foter_opt_normal\"])[3]")
	private WebElement Viewtrip;
	
	@FindBy(xpath="//button[@class=\"btn-custom btn-light-red\"]")
	private WebElement cancelbtn;

	/*
	 * public Object setViewtrip;
	 * 
	 * public Object setView;
	 */

	public Viewtrip(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
   public void setViewtrip(String view) {
		
	
		Viewtrip.sendKeys(view);
		
		cancelbtn.click();
	
}

 

	
}
