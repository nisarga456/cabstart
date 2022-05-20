package com.orbit.generics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.orbit.pom.LogIn;
import com.orbit.pom.LogOut;

import zmq.ZError.IOException;

public class base {

	
	public FirefoxOptions options1;
	public ChromeOptions options;
	public static WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public SoftAssert sa;
	public  Actions action;
	
	 public filelibrary f = new filelibrary();
	 
	static {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Active 25\\eclipse-workspace\\Orbit 2\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "/driver/geckodriver");
		System.getProperty("webdriver.edge.driver", "/driver/msedgedriver");
	}
	@BeforeTest
	
	public void openBrowser() throws Exception {
		
		options = new ChromeOptions();
		options1 = new FirefoxOptions();
		options1.addArguments("--disable-notifications");
		options.addArguments("--disable-notifications");
		String url = f.getPropertyData("url");
		
		String browser = f.getPropertyData("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(options1);
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, 10);
		js = (JavascriptExecutor) driver;
		sa = new SoftAssert();
		driver.get(url);
		action = new Actions(driver);
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(500);
		driver.close();
		sa.assertAll();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException, java.io.IOException {
		
		String un = f.getPropertyData("username");
		
		String pw = f.getPropertyData("password");
		
		LogIn l = new LogIn(driver);
		l.setLogin(un, pw);
		
		Thread.sleep(4000);
	}
	@AfterMethod
	public void Utility(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus())
		{
			utility.captureScreenshot(driver, result.getName());
		}
	}
	
	  
	 @AfterMethod
	  
	 public void logout() throws InterruptedException {
		 LogOut lg=new
	 LogOut(driver); 
	 lg.Setlogout();
	  
	 }
}
