package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class edittrip {

	
	@FindBy(xpath="(//a[@class=\"color_foter_opt color_foter_opt_normal\"])[5]")
	private WebElement Hold;
	
	@FindBy(xpath="(//a[@class=\"color_foter_opt color_foter_opt_normal\"])[2]")
	private WebElement edit;
	
	@FindBy(xpath="//button[@class=\"btn-custom btn-blue bk_btn\"]")
	private WebElement bookbtn;
	
	//@FindBy(xpath="//input[@name=\"my_address\"]")
	//private WebElement editpickuplocation;
	
	
	public edittrip(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
   public void setedittrip() {
	
	   //editpickuplocation.sendKeys(pick);
	   Hold.click();
	   edit.click();
	   bookbtn.click();
}


	


}
