
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.json.simple.JSONObject;
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
import io.socket.engineio.client.transports.PollingXHR.Request;

public class call_service {

	// NEW CALL

	@Test()
	public void new_call() { // Specify base URI

		RestAssured.baseURI = "https://service.cabstart.co.uk:8070";
		// RestAssured.baseURI="https://callservice.cabstart.co.uk";

		// Request object
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();

		requestParams.put("tenent_id", 1);
		requestParams.put("authentication", "eyJpZCI6MSwiaWF0IjoxNTQ2NTE5NDY4LCJleHAiOjE1NTUxNTk0Njh9");
		requestParams.put("caller_id", "445");
		requestParams.put("calling_num", "9008988972");
		requestParams.put("dialled_num", "108");
		requestParams.put("datetime", "2022-05-16 14:25:00");

		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString()); // attach above data to the request

		// Response object
		Response response = httpRequest.request(Method.POST, "/source/new_call");

		// print response in console window

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);

		// status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		// success code validation
		String successCode = response.jsonPath().get("message");
		Assert.assertEquals(successCode, "success");

	}

	// CAII_ANSWERED

	@Test(priority = 1)
	public void call_answered() {
		// Base URL
		// RestAssured.baseURI="https://service.cabstart.co.uk:8070";

		// Request object
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();

		// Params
		requestParams.put("tenent_id", 1);
		requestParams.put("authentication", "eyJpZCI6MSwiaWF0IjoxNTQ2NTE5NDY4LCJleHAiOjE1NTUxNTk0Njh9");
		requestParams.put("caller_id", "445");
		requestParams.put("extension", "108");
		requestParams.put("datetime", "2022-05-16 20:25:00");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString()); // attach above data to therequest

		// Response object
		Response response = httpRequest.request(Method.POST, "/source/call_answered");

		// print response in console window

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);

		// status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		// success code validation
		String successCode = response.jsonPath().get("message");
		Assert.assertEquals(successCode, "success");

	}

	// CALL_COMPLETED

	@Test(priority = 2)
	public void call_completed() {

		// Specify base URI

		RestAssured.baseURI = "https://service.cabstart.co.uk:8070";

		// Request object
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();

		requestParams.put("tenent_id", 1);
		requestParams.put("authentication", "eyJpZCI6MSwiaWF0IjoxNTQ2NTE5NDY4LCJleHAiOjE1NTUxNTk0Njh9");
		requestParams.put("caller_id", "445");
		requestParams.put("datetime", "2022-05-16 20:25:00");

		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString()); // attach above data to the request

		// Response object
		Response response = httpRequest.request(Method.POST, "/source/call_completed");

		// print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);

		// status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		// success code validation
		String successCode = response.jsonPath().get("message");
		Assert.assertEquals(successCode, "success");

	}

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Active 25\\Downloads\\chromedriver.exe");
	}

	@Test(priority = 3)

	public void taycan_connect() throws Throwable

	{

		// Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		// Pass ChromeOptions instance to ChromeDriver Constructor
		// Webdriver is Interface,driver is reference variable,new is
		// keyword,Chromedriver isConstructor

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		long start = System.currentTimeMillis();

		// Base url

		driver.get("https://service.cabstart.co.uk/dispatcher/login");

		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for entering URL - " + totalTime);
		long start2 = System.currentTimeMillis();

		WebElement username = driver.findElement(By.xpath("//input[@id=\"disp_email\"]"));
		username.sendKeys("sudeep");

		driver.findElement(By.xpath("//input[@class=\"form-control m-wrap placeholder-no-fix password\"]"))
				.sendKeys("123456");
		// password.sendKeys("111111");
		driver.findElement(By.xpath("//input[@id=\"ext_id\"]")).sendKeys("108");
		driver.findElement(By.xpath("//button[@class=\"btn btn-theme btn-block\"]")).click();

		long finish2 = System.currentTimeMillis();
		long totalTime2 = finish2 - start2;
		System.out.println("Total Time for login page- " + totalTime2);
		long start3 = System.currentTimeMillis();

		// JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("//div[@class=\"col-md-12 reg-header\"]")).click();

		long finish3 = System.currentTimeMillis();
		long totalTime3 = finish3 - start3;
		System.out.println("Total Time for Live tracking page- " + totalTime3);

		Thread.sleep(500);


		driver.findElement(By.xpath("//i[@class=\"fa fa-bars fa-bars-normal\"]")).click();
		driver.findElement(By.xpath("//i[@class=\"fa fa-phone-square\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]")).sendKeys("445");
		Thread.sleep(100);
		Actions action2=new Actions(driver);
		action2.sendKeys(Keys.ENTER).build().perform();
		

		
		Thread.sleep(1000);
		 driver.navigate().back();

		
		 Actions action1 = new Actions(driver);
		 action1.sendKeys(Keys.F2).build().perform();
		 driver.findElement(By.xpath("//button[@class=\"btn-custom btn-grey btn-right hover2\"]")).click();
		 
		
	}
}
