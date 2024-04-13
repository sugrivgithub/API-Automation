// Package and imports
package org.testing.testScripts;
import java.io.IOException;
import java.util.Properties;
import org.testing.Utilities.PropertiesHandle;
import org.testing.testSteps.HTTPMethods;

// Class declaration
public class TC02_GetAllMethod {

	// Method to execute the test
	public void executeTest() throws IOException {
		
		// Load URI properties
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIfw/URI.properties");
		
		// Initialize HTTPMethods object
		HTTPMethods http = new HTTPMethods(pr);
		
		// Call getAllMethod to perform GET request
		http.getAllMethod("QA_URI03");
	}
}



