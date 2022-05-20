package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drivers {
	
	
	@FindBy(xpath = "//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/providers\"]")
	private WebElement drivers;

	@FindBy(xpath="//input[@class=\"btn-custom btn-blue\"]")
	private WebElement adddriver;
	
public Drivers(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

public void setDrivers() {
	
	navigationbtn.click();
	drivers.click();
	adddriver.click();
}
}
