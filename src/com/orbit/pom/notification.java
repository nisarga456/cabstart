package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notification {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-bell\"]")
	private WebElement notification;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/list-notification?tab=2\"]")
	private WebElement sms;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/list-notification?tab=3\"]")
	private WebElement contacts;
	
	public  notification(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void setnotification() {
		
		navigationbtn.click();
		notification.click();
		sms.click();
		contacts.click();
	}
}
