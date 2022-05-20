import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI1 {

	@Test
	void getUserDetails()
	{
	 //Specify base URI
		
	 RestAssured.baseURI="https://service.cabstart.co.uk";
	
	
	 //Request object
	 RequestSpecification httpRequest=RestAssured.given();
	
	 //Response object

	 Response response=httpRequest.request(Method.GET,"/provider/togglestate?token=2y10cDJOJz9EXyJAUSeJC3xshe8Ko9QAPvaEAS7XNe4Oe8fzfaPG8yIG, device_token=exJ-YGnDQ4WY-SzTetwGW6:APA91bF6Qiy7YLgk18uxiYFyFeINKKFYmm3Q4jlfS-880rtUdXop3AMSqp1CbetfSuCkPnox5Ek8D2sCamYbBSgzWFi_F_TlSL6_K8DpaGnFo-dmWJ1Ks87DEVH_6fY3PlWCWK7J6Oj0&manufacture_type=Google&operating_system=Android&lymo_device_id=1832&id=160&screen_detail=5.22&devic_type=mobile&public_ip=2405:204:5602:92aa:ed7c:8e43:a74f:3169&device_id=430965744d42833b&app_version=2.3.5.1&manufacture_model=Google Pixel 3&os_version=12&tenent_id=1&time_zone=Asia/Kolkata&resolution=1080x2160\r\n");

	
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
	
	
	
	
}
