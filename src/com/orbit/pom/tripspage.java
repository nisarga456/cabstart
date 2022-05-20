package com.orbit.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tripspage {

	@FindBy(xpath="//a[@id=\"navigation_btn\"]")
	private WebElement Navigationbtn;
	
	@FindBy(xpath="//li[@id=\"walks\"]")
	private WebElement trips;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/requests-scheduled\"]")
	private WebElement Scheduledtrips;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/requests-completed\"]")
	private WebElement completedtrips;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/requests-cancelled\"]")
	private WebElement cancelledtrips;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/requests-rejected\"]")
	private WebElement rejectedtrips;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/requests-nodrivers\"]")
	private WebElement noresponse;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/requests-skipped\"]")
	private WebElement skipped;

	

public tripspage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);	
}

	public void settripspage() {
		
		Navigationbtn.click();
		trips.click();
		Scheduledtrips.click();
		completedtrips.click();
		cancelledtrips.click();
		rejectedtrips.click();
		noresponse.click();
		skipped.click();
	}







}
