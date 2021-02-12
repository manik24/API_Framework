package org.testing.TestScripts;


import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Propertieshandling;
import org.testing.utilities.ResoponseParseusingJSonPath;

import com.jayway.restassured.response.Response;

//Post request
//load properties file
//load json data
//

public class TC1 {

    static String responseIDvalue;
	public  void testcase1() throws IOException {
		
		
		Random r = new Random();
		Integer replace_data = r.nextInt();
		
		//getting the properties object 
		Properties pr_data=Propertieshandling.loadProperties("../API_Framework/Uri.Properties");
		String data = LoadJsonFile.loadJson("../API_Framework/src/main/java/org/testing/Resources/Simplejson.json"); 
		data=JsonReplacement.ReplaceValue(data, "id", replace_data.toString());
		
		HTTPMethods http = new HTTPMethods();
		Response res = http.PostMethod(data, "uri_key_1", pr_data);
		System.out.println("Reponse is :"+res.asString());
		System.out.println("Status code is :"+res.statusCode());

		
		responseIDvalue = ResoponseParseusingJSonPath.ResponseObject(res,"id");
		
		System.out.println("Value extracted from response of test case 1 :" +responseIDvalue);
	}
}
