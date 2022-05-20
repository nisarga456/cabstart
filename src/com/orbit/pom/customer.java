package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customer {

	@FindBy(xpath = "//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;

	@FindBy(xpath = "//i[@class=\"fa fa-users\"]")
	private WebElement customer;

	@FindBy(xpath="//button[@id=\"add_btn\"]")
	private WebElement Addcustomer;
	
	@FindBy(xpath="//button[@id=\"cancel_provider_add\"]")
	private WebElement canclebtn;
	
	
	public customer(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void setcustomer() {

		navigationbtn.click();
		customer.click(); 
		Addcustomer.click();
		canclebtn.click();
	
	}

}
