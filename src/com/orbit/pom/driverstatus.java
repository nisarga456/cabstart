package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class driverstatus {

	@FindBy(xpath="(//a[@class=\"color_foter_opt color_foter_opt_normal\"])[11]")
	private WebElement driverstatus;
	
	@FindBy(xpath="//a[@id=\"query_btn\"]")
	private WebElement query;
	
	@FindBy(xpath="//a[@onclick=\"locate_vehicle()\"]")
	private WebElement vehiclelocate;
	
	@FindBy(xpath="//a[@id=\"back_page\"]")
	private WebElement Escbtn1;
	
	@FindBy(xpath="//a[@onclick=\"car_type_filter()\"]")
	private WebElement filter;
	
	@FindBy(xpath="//a[@onclick=\"car_type_hide()\"]")
	private WebElement Escbtn2;
	
	@FindBy(xpath="//a[@id=\"back_page\"]")
	private WebElement Escbtn3;
	
	public driverstatus(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
   public void set(String driver) {
		
	
	   driverstatus.sendKeys(driver);
	   
		Escbtn1.click();
		Escbtn2.click();
		Escbtn3.click();
	}
}




