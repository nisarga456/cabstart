package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class help {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/help\"]")
	private WebElement help;
	
	public help(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void sethelp() {
		
		navigationbtn.click();
		help.click();
	}
}
