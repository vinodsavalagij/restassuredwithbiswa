package restAssured.RestAsssuredAutomationLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class ValidateUpdate 
{
	
	@Test
	public void validateUpdate()
	{
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api";
		
		
		Response res =
				
				given().
				
				
		body("{\"name\":\"vinod9\",\"salary\":\"123\",\"age\":\"23\"}").
		
				when().
		
		post("/v1/create").
				then().
				
				
		assertThat().statusCode(200).
				extract().
				
				
				response();
		
		
		
		String response=res.asString();
		
		
		System.out.println(response);
		//get("http://dummy.restapiexample.com/api/v1/employee
		
		JsonPath js = new JsonPath(response);
		
		System.out.println(">>>>>>>>>>>>>>>>"+js.get("name"));
		
		String name=js.get("name");
		
		Assert.assertEquals(name, "vinod9");
		
		
		
	}
		
		
		
	}


