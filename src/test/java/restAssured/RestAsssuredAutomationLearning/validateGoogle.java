package restAssured.RestAsssuredAutomationLearning;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;

public class validateGoogle
{
@Test
public void GetWeatherDetails()
{
	// Specify the base URL to the RESTful web service
	//RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

	// Get the RequestSpecification of the request that you want to sent
	// to the server. The server is specified by the BaseURI that we have
	// specified in the above step.
	//RequestSpecification httpRequest = RestAssured.given();
Response response =(Response) given().
	
	// Make a GET request call directly by using RequestSpecification.get() method.
	// Make sure you specify the resource name.
	//Response response = httpRequest.get("/Hyderabad");

get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").then().extract();

	// Response.asString method will directly return the content of the body
	// as String.
	System.out.println("Response Body is =>  " + response.asString());
	
	int responseCode = response.getStatusCode();
	
	System.out.println(response.getStatusLine());
	
	Assert.assertEquals(responseCode, 200);
}
}