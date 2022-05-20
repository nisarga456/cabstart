package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class information {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-info-circle\"]")
	private WebElement information;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/informations?tab=2\"]")
	private WebElement customerFAQ;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/informations?tab=3\"]")
	private WebElement DriverFAQ;
	
	
	public information(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void setinformation() {
		
		navigationbtn.click();
		information.click();
		customerFAQ.click();
		DriverFAQ.click();
		
	
	}
}
