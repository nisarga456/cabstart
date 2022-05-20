package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	

	
	@FindBy(xpath="//input[@name='username']")
	private WebElement untbx;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwtxb;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement lgbtn;
	
	@FindBy(xpath="(//div[@class=\"col-md-12 reg-header\"])[2]")
	private WebElement testingbnglr;
	
	public LogIn(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	

	public void setLogin(String un, String pw) {
		
		
		untbx.sendKeys(un);
		
		pwtxb.sendKeys(pw);
		
		lgbtn.click();
		
		testingbnglr.click();
		
		
		
		
		}
}
