package restAssured.RestAsssuredAutomationLearning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

class A
{
	 
String name;
public String getName() {
	return name;
}

public String getAge() {
	return age;
}
public String getSalary() {
	return salary;
}
String age;
String salary;

A(String age,String name,String salary)
{
this.age=age;
this.name=name;
this.salary=salary;
}

}

public class ValidateGetwithPOJO {
	
	A a = new A("test1","sdf","45");

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
