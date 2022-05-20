package com.orbit.pom;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class releasetrip {
		
		@FindBy(xpath="(//a[@class=\"color_foter_opt color_foter_opt_normal\"])[6]")
		private WebElement releasetrip;
		
		/*
		 * @FindBy(
		 * xpath="(//a[@class=\\\"color_foter_opt color_foter_opt_normal\\\"])[5]")
		 * private WebElement holdtrip;
		 */
		
		public releasetrip(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);	
		}
		
	   public void setreleasetrip() {
			
		
		   releasetrip.click();
		   //holdtrip.click();
 }
}
	
