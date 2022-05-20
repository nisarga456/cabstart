import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StretPickUp {

	@Test
	void getUserDetails()
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
}
