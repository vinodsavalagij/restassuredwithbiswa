package restAssured.RestAsssuredAutomationLearning;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class validateBody {
	
	@Test
	public void validateBody()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api";
	
		Response res = given().
				
		when().
		get("/v1/employees").
		then().
		assertThat().statusCode(200).
		extract().response();
		
		String response = res.asString();
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		JsonPath js = new JsonPath(response);
		
		System.out.println(response);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(js.get("id[1]"));
		System.out.println(js.get("employee_name[1]"));
		
		
	}
	
		
	
}