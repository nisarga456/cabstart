package com.orbit.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartype {

	@FindBy(xpath="//i[@class=\"fa fa-bars fa-bars-normal\"]")
	private WebElement navigationbtn;
	
	@FindBy(xpath="//i[@class=\"fa fa-car\"]")
	private WebElement cartype;
	
	
	  @FindBy(xpath="//input[@class=\"form-control\"]") 
	  private WebElement keyword;
	 
	
	
	/*
	 * @FindBy(xpath="//input[@class=\"btn-custom btn-green\"]") 
	 * private WebElement  addnewcartype;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/std-pricing\"]") 
	 * private WebElement stdpricing;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=5\"]")
	 * private WebElement zones;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/neighbour-zones\"]")
	 * private WebElement neighbouringzones;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=10\"]")
	 * private WebElement zonegroup;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=4\"]")
	 * private WebElement types;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=2\"]")
	 * private WebElement categories;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=11\"]")
	 * private WebElement capabilities;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=3\"]")
	 * private WebElement city;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=7\"]")
	 * private WebElement countries;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/addaddress\"]")
	 * private WebElement address;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/warning_time/0\"]")
	 * private WebElement warningtime;
	 * 
	 * @FindBy(xpath="//a[@href=\"https://service.cabstart.co.uk/admin/provider-types?tab=1\"]")
	 * private WebElement pricing;
	 */
	  
	public cartype(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setcartype() {
		
		navigationbtn.click();
		cartype.click();
		keyword.click();
		/*
		 * stdpricing.click(); zones.click(); neighbouringzones.click();
		 * zonegroup.click(); types.click(); categories.click(); capabilities.click();
		 * city.click(); countries.click(); address.click(); warningtime.click();
		 * pricing.click();
		 */
		 		
	}
}

