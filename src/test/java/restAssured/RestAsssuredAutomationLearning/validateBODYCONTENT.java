package restAssured.RestAsssuredAutomationLearning;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class validateBODYCONTENT {
	
	@Test
	public void testBody(){
		get("https://postman-echo.com/GET").then().assertThat()
               .body("headers.host", equalTo("postman-echo.com"));
		
		Response res= given().get("https://postman-echo.com/GET").then().extract().response();
		
		System.out.println(res.asString());

		
		JsonPath js = new JsonPath(res.asString());
		
		System.out.println(js.get("url"));
		
		
	}

}
