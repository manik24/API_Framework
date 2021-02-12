package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.Propertieshandling;

import com.jayway.restassured.response.Response;

public class TC2 {

public void testcase2() throws IOException
{
	Properties pr=Propertieshandling.loadProperties("../API_Framework/Uri.Properties");
	String idValue=TC1.responseIDvalue;
	
	HTTPMethods http = new HTTPMethods();
	Response res= http.GetRequest(idValue, "uri_key_1", pr);
	
	
	System.out.println("Test Case 2 Started");
	System.out.println("Resoponse of test case 2 started "+res.asString());
	System.out.println("Value extracted from test case 1 sent in test case 2:"+res.jsonPath().get("id"));
	System.out.println("Status code for Test Case 2 is : "+res.statusCode());
	System.out.println("Response time in miliseconds:  "+res.getTime());
	
	
	}
	
}
