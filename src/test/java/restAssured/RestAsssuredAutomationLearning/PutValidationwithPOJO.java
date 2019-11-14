package restAssured.RestAsssuredAutomationLearning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
public class PutValidationwithPOJO {
	
	POJO a = new POJO("test1","sdf","45");

	@Test
	public void putValidation() {

		
		RestAssured.baseURI="http://dummy.restapiexample.com/";
		Response res = given().
				
				pathParam("id","21").
				
			body(a).	
		put("api/v1/update/{id}").then().extract().response();

		String response = res.asString();

		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		
		String name = js.get("name.");
		
System.out.println(name.isEmpty());
	}

}
