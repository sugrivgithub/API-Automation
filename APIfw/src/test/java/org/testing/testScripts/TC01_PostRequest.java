// Package and imports
package org.testing.testScripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.Utilities.JsonHandle;
import org.testing.Utilities.PropertiesHandle;
import org.testing.testSteps.HTTPMethods;

// Class declaration
public class TC01_PostRequest {

	// Method to execute the test
	public void executeTest() throws IOException {
		
		// Load URI properties
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIfw/URI.properties");
		
		// Read JSON request body
		String jsonRequestBody = JsonHandle.readJsonData("../APIfw/src/test/java/org/testing/Resources/inputRequest.json");
		
		// Initialize HTTPMethods object
		HTTPMethods http = new HTTPMethods(pr);
		
		// Call PostMethod to perform POST request
		http.PostMethod(jsonRequestBody, "QA_URI03");
	}
}

