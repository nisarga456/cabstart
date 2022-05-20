import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class locationupdate1 {

	@Test
	void getUserDetails()
	{
	 //Specify base URI
		
	 RestAssured.baseURI="https://service.cabstart.co.uk";
	
	
	 //Request object
	 RequestSpecification httpRequest=RestAssured.given();
	
	 //Response object

	 Response response=httpRequest.request(Method.GET,"/zn_req_nw?token=2y106klx7xsNlzTSmQTp1szpOeBwbj5P3WuTRie6QgltT2LPEXgSTC&longitude=77.6151126&status=1&latitude=12.9169332&tenent_id=1&lymo_device_id=1832&id=160");

	
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
