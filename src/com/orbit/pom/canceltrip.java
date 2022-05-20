package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class canceltrip {

	@FindBy(xpath="(//a[@class=\"color_foter_opt color_foter_opt_normal\"])[4]")
	private WebElement canceltrip;
	
	@FindBy(xpath="//button[@id=\"confrim_cancel_request\"]")
	private WebElement Yesbtn;
	
	@FindBy(xpath="//button[@id=\"confrim_cancel_modal\"]")
	private WebElement Nobtn;
	
	
	public canceltrip(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
   public void setcanceltrip(String cancel) {
		
	
		canceltrip.sendKeys(cancel);
		
		Yesbtn.click();
		
		Nobtn.click();
	
}
   
}




