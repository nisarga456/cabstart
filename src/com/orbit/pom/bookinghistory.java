package com.orbit.pom;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class bookinghistory {
		
		@FindBy(xpath="((//a[@class=\"color_foter_opt color_foter_opt_normal\"])[9]")
		private WebElement bookingpage;
		
		@FindBy(xpath="id=\"back_page\"")
		private WebElement Escbtn;
			
	 public bookinghistory(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);	
		}
		
	   public void setbookinghistory(String booking) {
			
		
			bookingpage.click();
			
			Escbtn.click();
		}
	}


