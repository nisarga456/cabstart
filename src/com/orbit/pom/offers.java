package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class offers {
	
	
	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//I[@class=\"fa fa-gift\"]")
	private WebElement offers;
	
	@FindBy(xpath="//button[@class=\"btn-custom btn-blue btn-right\"]")
	private WebElement addoffers;
	
	/*
	 * @FindBy(xpath="")
	 *  private WebElement confirm;
	 */
	
	public offers (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setoffers() {
		
		navigationbtn.click();
		offers.click();
	}

}
