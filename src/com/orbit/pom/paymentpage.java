package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentpage {

	
	@FindBy(xpath="//a[@class=\"navbar-btn sidebar-toggle\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-money\"]")
	private WebElement paymentpage;
	
	@FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/details-payment-pending?start_date=23-03-2022&end_date=23-03-2022\"]")
	private WebElement pendingpayment;
	
	
public paymentpage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

public void setpaymentpage() {
	
	navigationbtn.click();
	paymentpage.click();
	pendingpayment.click();
}

}
