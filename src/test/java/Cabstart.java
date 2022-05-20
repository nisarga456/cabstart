import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import okhttp3.Request;


public class Cabstart {

//STREET PICKUP
	@Test
	void getStreetpickup()
	{
	 //Specify base URI
		
	 RestAssured.baseURI="https://service.cabstart.co.uk";
	
	
	 //Request object
	 RequestSpecification httpRequest=RestAssured.given();
	
	 //Response object URL

	 Response response=httpRequest.request(Method.GET,"/provider/streetpickup?tenent_id=1&lymo_device_id=1832&id=160&token=2y10cDJOJz9EXyJAUSeJC3xshe8Ko9QAPvaEAS7XNe4Oe8fzfaPG8yIG");

	
	 //print response in console window
	 String responseBody=response.getBody().asString();
	 System.out.println("Response Body is:" +responseBody);
	
	 //status code validation
	
	 int statusCode=response.getStatusCode();
	 System.out.println("Status code is: "+statusCode);
	 
	 Assert.assertEquals(statusCode, 200);
	
	 //status line verification
	
	 String statusLine=response.getStatusLine();
	 System.out.println("Status line is:"+statusLine);
	 Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	
	}
	
	  static { 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Active 25\\Downloads\\chromedriver.exe");
		  }
	  String TripId;
	  @Test(priority=0)
	 
	  public void walkcompleted() throws Throwable
	  
	  {
	  
	  //Create a instance of ChromeOptions class 
		  ChromeOptions options = new ChromeOptions();
	  
	 options.addArguments("--disable-notifications");
	  
	  
	  //Pass ChromeOptions instance to ChromeDriver Constructor
	 //Webdriver is Interface,driver is reference variable,new is keyword,Chromedriver isConstructor
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  
	  long start = System.currentTimeMillis(); 
	  
	  //Base url
	  
	  driver.get("https://service.cabstart.co.uk/");
	  
	 
	  long finish = System.currentTimeMillis(); 
	  long totalTime = finish - start;
	  System.out.println("Total Time for entering URL - "+totalTime);
	  long start2 = System.currentTimeMillis();
	  
	  
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys("nisarga@active.agency");
	  
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("111111");
	  //password.sendKeys("111111");
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  long finish2 = System.currentTimeMillis();
	  long totalTime2 = finish2 - start2;
	  System.out.println("Total Time for login page- "+totalTime2); 
	  long start3 = System.currentTimeMillis();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  js.executeScript("window.scrollBy(0,500)");
	  
	  driver.findElement(By.xpath("(//div[@class=\"col-md-12 reg-header\"])[2]")).
	  click();
	  
	  long finish3 = System.currentTimeMillis(); 
	  long totalTime3 = finish3 -  start3;
	  System.out.println("Total Time for Live tracking page- "+totalTime3);
	  
	  
	  Actions action1 = new Actions(driver);
	  action1.sendKeys("160").build().perform(); 
	  
	  Thread.sleep(500);
	  
	  Robot rb = new Robot();
	  
	  rb.keyPress(KeyEvent.VK_J);
	  
	  Thread.sleep(2000);
	  
	 TripId = driver.findElement(By.xpath("(//a[contains(@href,\"https://service.cabstart.co.uk/admin/request/map\")])[1]")).getText();
	
	 
	 System.out.println(TripId.substring(5,11));
	 
	  
	  
	  
	  }
	  @Test(priority=1)
		  public void getwalkcomplete() { 
		  
		  //Specify base URI
		  
		  RestAssured.baseURI="https://service.cabstart.co.uk";
		  
		  
		  // Request object
		  
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  //WALKCOMPLETED API
		  
		  String url ="/provider/requestwalkcompleted?token=2y10cDJOJz9EXyJAUSeJC3xshe8Ko9QAPvaEAS7XNe4Oe8fzfaPG8yIG&longitude=77.6134057&wait_time=00:00:00&distance=0.0&latitude=12.9217572&tenent_id=1&lymo_device_id=1832&c_clear=0&id=160&ride_time_from_app=00:01:28&request_id=";
		 
		  Response response=httpRequest.request(Method.GET,url+TripId.substring(5,11));
		  
		 
		  System.out.println(httpRequest);
		  
		  //print response in console window
		  
		  String responseBody = response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  
		  Assert.assertEquals(statusCode, 200);
		  
		  //status line verification
		  
		  String statusLine=response.getStatusLine();
		  System.out.println("Status line is:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		  
		  }
	  @Test(priority=1)
	  public void getFinalstatusupdate() { 
	  
	  //Specify base URI
	  
	  RestAssured.baseURI="https://service.cabstart.co.uk";
	  
	  
	  // Request object
	  
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //WALKCOMPLETED API
	  
	  String url ="/provider/f_status_change?latitude=12.9217963&tenent_id=1&lymo_device_id=1832&end=1&id=160&request_id=&token=2y10cDJOJz9EXyJAUSeJC3xshe8Ko9QAPvaEAS7XNe4Oe8fzfaPG8yIG&longitude=77.6134243";
	 
	  Response response=httpRequest.request(Method.GET,url+TripId.substring(5,11));
	  
	 
	  System.out.println(httpRequest);
	  
	  //print response in console window
	  
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  //status code validation
	  
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  
	  Assert.assertEquals(statusCode, 200);
	  
	  //status line verification
	  
	  String statusLine=response.getStatusLine();
	  System.out.println("Status line is:"+statusLine);
	  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	  
	  }
}

