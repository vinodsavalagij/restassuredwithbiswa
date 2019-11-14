package restAssured.RestAsssuredAutomationLearning;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class validateBodyUsingPathParameter {
	
	@Test
	public void validateBodyUsingPathParameter()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api";
	
		Response res = given().
				pathParam("id", "6577"). //   	http://dummy.restapiexample.com/api/v1/employee/1
				
		when().
		get("/v1/employee/{id}"). // 	http://dummy.restapiexample.com/api/v1/employee/1  -- here id replace the id value
		then().
		assertThat().
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