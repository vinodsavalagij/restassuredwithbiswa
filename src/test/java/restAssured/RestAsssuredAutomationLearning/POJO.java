package restAssured.RestAsssuredAutomationLearning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class POJO
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

public POJO(String age,String name,String salary)
{
	
	this.name=name;
	this.salary=salary;
this.age=age;

}

}
