package org.testing.Utilities;


//input parameter----We have to give the file path 
//purpose of this method-----It can load any properties file
//output parameter----it will return object of the properties class

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {
	
		
		
		
		public static Properties  loadPropertiesFile(String Filepath) throws IOException  
		{
			File f=new File("../APIfw/src/test/java/URI.properties");
			FileReader fr= new FileReader(f);
			Properties pr=new Properties();
			pr.load(fr);
			return pr;
			
		}

}
