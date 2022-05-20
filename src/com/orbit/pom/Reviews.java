package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reviews {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-thumbs-o-up\"]")
	private WebElement reviews;
	
	public Reviews (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setreviews() {
		
		navigationbtn.click();
		reviews.click();
	}
}
