package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandle {
	
	
	public static String readJsonData(String filepath) throws FileNotFoundException 
	{
		
		File f=new File(filepath);
		FileInputStream fi=new FileInputStream(f);
		
		JSONTokener js=new JSONTokener(fi);
		JSONObject j=new JSONObject(js);
		return j.toString();
		
	}

}
