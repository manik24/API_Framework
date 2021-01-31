package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;



public class LoadJsonFile {

 public static  String loadJson(String path) throws IOException 
 {
	   
	 File f = new File(path);
	 FileInputStream fi=  new FileInputStream(f);
	 JSONTokener jt = new JSONTokener(fi);
	 JSONObject data = new JSONObject(jt);
	 return data.toString();
	
	 
	 
    
  }
}
