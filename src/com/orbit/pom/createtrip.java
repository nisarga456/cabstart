package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createtrip {

	@FindBy(xpath="//span[@style=\"color:blue\"]")
	private WebElement space;
	
	@FindBy(xpath="//input[@id=\"my_address\"]")
	private WebElement pickuplocation;
	
	@FindBy(xpath="//input[@id=\"my-dest\"]")
	private WebElement dest;
	
	@FindBy(xpath="//button[@id=\"request_trip_saveHold\"]")
	private WebElement bookbtn;
	
	
	public createtrip(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
   public void setcreatetrip() {
		
	   space.click();
	   
	  //pickuplocation.sendKeys("techa");
		
}
	   

   
   public void bookbutton() {
	   bookbtn.click();
	   
   }
}


