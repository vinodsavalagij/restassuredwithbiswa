package restAssured.RestAsssuredAutomationLearning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


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
		
		
		Response res =given().
		body("{\"name\":\"vinod\",\"salary\":\"123\",\"age\":\"23\"}").
		
		when().
		
		post("/v1/create").then().extract().response();
		
		
		
		String response=res.asString();
		
		
		System.out.println(response);
		//get("http://dummy.restapiexample.com/api/v1/employee
		
		get();
		
	}
		
		
		
	}


