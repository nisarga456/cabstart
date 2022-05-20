package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dispatchers {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/dispatchers\"]")
	private WebElement dispatchers;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/dispatcher-extensions\"]")
	private WebElement dispatcherextensions;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/dispatcher-permissions\"]")
	private WebElement dispatcherpermissions;

	public dispatchers(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setdispatchers(){
		
		navigationbtn.click();
		dispatchers.click();
		dispatcherextensions.click();
		dispatcherpermissions.click();
	}
}


