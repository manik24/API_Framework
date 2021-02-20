package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.Responsehandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Propertieshandling;

import com.jayway.restassured.response.Response;

public class TC5 {
	
	public void testcase5() throws IOException 
	{

	
	Properties pr=Propertieshandling.loadProperties("../API_Framework/Uri.Properties");
	String idValue=TC1.responseIDvalue;
	
	HTTPMethods http = new HTTPMethods();
	Response res= http.deleteMethod(idValue,"uri_key_1",pr);
	
	System.out.println("Test Case 5 Started");
	System.out.println("Resoponse of test case 5 started "+res.asString());
	System.out.println("Status code for Test Case 5 is : "+res.statusCode());
	System.out.println("Response time in miliseconds:  "+res.getTime());
	Responsehandling.Statuscode(res, 200);
	
 }


}