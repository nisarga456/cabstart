package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	
	
	@FindBy(id="confirm_logout_popup")
	private WebElement logOut;
	
	@FindBy(xpath="//button[@id=\"confirm_logout\"]")
	private WebElement Yesbutton;
	
	public LogOut(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Setlogout() throws InterruptedException
	{
		Thread.sleep(2000);
		
		logOut.click();
		Yesbutton.click();
	}











}
