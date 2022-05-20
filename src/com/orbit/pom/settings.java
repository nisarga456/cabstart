package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class settings {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-cogs\"]")
	private WebElement settings;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=1\"]")
	private WebElement customerapp;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=5\"]")
	private WebElement sms;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=6\"]")
	private WebElement email;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=8\"]")
	private WebElement pushnotification;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=7\"]")
	private WebElement general;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/trips-settings\"]")
	private WebElement trips;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=3\"]")
	private WebElement installation;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings?tab=9\"]")
	private WebElement vehicle;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/settings/sms_gateway\"]")
	private WebElement smsgateway;
	
	public settings(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setsettings() {
		
		navigationbtn.click();
		settings.click();
		customerapp.click();
		sms.click();
		email.click();
		pushnotification.click();
		general.click();
		trips.click();
		installation.click();
		vehicle.click();
		smsgateway.click();
	}
}
