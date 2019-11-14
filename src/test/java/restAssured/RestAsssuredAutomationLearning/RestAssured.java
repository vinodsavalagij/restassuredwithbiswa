package restAssured.RestAsssuredAutomationLearning;

import static io.restassured.RestAssured.*; import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class RestAssured {

	
	@Test
	public void validateResponse()
	{
		
		
		        
		 Response response= (Response) given().
		    pathParam("country","us").
		    pathParam("zipcode","90210").
		  when().
		    get("http://api.zippopotam.us/{country}/{zipcode}").then().assertThat().body("places.state", equalTo("sdf")). extract();
		  
		 String res = response.asString();
		 
		 
		 
		 System.out.println(res);
		 
		 JsonPath json = new JsonPath(res);
		 
		 System.out.println(json.get("places.state"));
		 
		 if(json.get("places.state").toString().contains("California"))
		 {
			 
			 System.out.println("=========================== perfect");
		 }
		 
		 else
		 {
			 System.out.println(json.get("places.state").toString());
			 
		 }
		 
		 //String usernames = response.jsonPath().getString("count");
		}
	
	
	
	
		
	
}