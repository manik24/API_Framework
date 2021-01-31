package org.testing.TestScripts;


import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Propertieshandling;

import com.jayway.restassured.response.Response;

//Post request
//load properties file
//load json data
//
public class TC1 {

	public static void main(String[] args) throws IOException {
		
		//getting the properties object 
		Properties pr_data=Propertieshandling.loadProperties("../API_Framework/Uri.Properties");
		String data = LoadJsonFile.loadJson("../API_Framework/src/main/java/org/testing/Resources/Simplejson.json");
		HTTPMethods http = new HTTPMethods();
		Response res = http.PostMethod(data, "uri_key_1", pr_data);
		System.out.println("Reponse is :"+res.asString());
		System.out.println("Status code is :"+res.statusCode());
	}
}
