package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Utilities.JsonHandle;
import org.testing.Utilities.PropertiesHandle;
import org.testing.testSteps.HTTPMethods;

public class TC01_PostRequest {
	public static void main(String[] args) throws IOException 
	{
		Properties pr=PropertiesHandle.loadPropertiesFile("../APIfw/URI.properties");
		String jsonRequestBody=JsonHandle.readJsonData("../APIfw/src/test/java/org/testing/Resources/inputRequest.json");
		
		HTTPMethods http=new HTTPMethods(pr);
		http.PostMethod(jsonRequestBody, "QA_URI03");
		
	}
}
