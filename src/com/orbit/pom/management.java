package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class management {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/company\"]")
	private WebElement management;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/corporate\"]")
	private WebElement account;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/corporate_settings\"]")
	private WebElement accountsettings;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/messages\"]")
	private WebElement messages;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/blacklist\"]")
	private WebElement blacklist;
	
	public management(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void setmanagement() {
		
		navigationbtn.click();
		management.click();
		account.click();
		accountsettings.click();
		messages.click();
		blacklist.click();
		
	}
}
