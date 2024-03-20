package org.testing.testSteps;

import java.util.Properties;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods {
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}

	public void PostMethod(String requestBody, String uriKeyname)
	{
	
		String uriValue=pr.getProperty(uriKeyname);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.post(uriValue);
		System.out.println("Status Code is  "+ res.statusCode());
	}
}
