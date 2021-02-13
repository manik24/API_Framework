package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Propertieshandling;

import com.jayway.restassured.response.Response;

public class TC4 {
	
	
	public void testcase4() throws IOException
	   {
		Properties pr_data=Propertieshandling.loadProperties("../API_Framework/Uri.Properties");
		String data = LoadJsonFile.loadJson("../API_Framework/src/main/java/org/testing/Resources/SimplejsonforUPdate.json"); 
		data=JsonReplacement.ReplaceValue(data, "id",TC1.responseIDvalue);
		data=JsonReplacement.ReplaceValue(data, "first_name","UpdatedFirstName");
	HTTPMethods http = new HTTPMethods();
	Response res= http.PutMethod(data, "uri_key_1", TC1.responseIDvalue, pr_data);
	
	
	System.out.println("Response json for Test Case 4 : "+res.asString());
	System.out.println("Response  code  for Test Case 4 : "+res.statusCode());
	System.out.println("Response  time   for Test Case 4 : "+res.time());
	
}
	
}
