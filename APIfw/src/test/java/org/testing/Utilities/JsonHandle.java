// Package and imports
package org.testing.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Class declaration
public class JsonHandle {
	
	// Method to read JSON data from file
	public static String readJsonData(String filepath) throws FileNotFoundException {
		// Create File object
		File file = new File(filepath);
		
		// Create FileInputStream object
		FileInputStream fis = new FileInputStream(file);
		
		// Create JSONTokener object
		JSONTokener jsonTokener = new JSONTokener(fis);
		
		// Create JSONObject object
		JSONObject jsonObject = new JSONObject(jsonTokener);
		
		// Return JSON data as string
		return jsonObject.toString();
	}
}

