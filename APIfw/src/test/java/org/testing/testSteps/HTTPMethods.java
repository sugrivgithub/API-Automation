// Package and imports
package org.testing.testSteps;
import java.util.Properties;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

// Class declaration
public class HTTPMethods {
	Properties pr;
	
	// Constructor to initialize Properties object
	public HTTPMethods(Properties pr) {
		this.pr = pr;
	}

	// Method to perform POST request
	public void PostMethod(String requestBody, String uriKeyname)
	{
	
		String uriValue = pr.getProperty(uriKeyname);
		Response res = given()
		                .contentType(ContentType.JSON)
		                .body(requestBody)
		                .when()
		                .post(uriValue);
		System.out.println("Status Code is " + res.statusCode());
	}
	
	
	// Method to perform GET request
	public void getAllMethod(String uriKeyname) 
	{
	
		String uriValue = pr.getProperty(uriKeyname);
		Response res = given()
		                .when()
		                .contentType(ContentType.JSON)
		                .get(uriValue);
		System.out.println("Status Code is " + res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}
}
