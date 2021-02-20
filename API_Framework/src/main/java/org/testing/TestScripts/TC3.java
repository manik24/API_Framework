package org.testing.TestScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.ResponseValidation.Responsehandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.Propertieshandling;
import org.testing.utilities.ResponseParsingUsingOrgJSON;

import com.jayway.restassured.response.Response;



public class TC3 
{
	

public void testcase3() throws IOException
   {

	Properties pr=Propertieshandling.loadProperties("../API_Framework/Uri.Properties");
	
	HTTPMethods http = new HTTPMethods();
	Response res= http.GetRequestAll( "uri_key_1", pr);
	
	try{
		JSONArray ar= new JSONArray(res.asString());
	
	int a= ar.length();
	for(int i=1;i<=a-1;i++)
	{

	    String data=ar.getJSONObject(i).getString("id").toString();
	    System.out.println("data for record"+i+" is equals to ="+data);
	
	}
	
	  }
	
	finally {
	System.out.println("Test Case 3 Started");
	System.out.println("Resoponse of Test Case 3 started "+res.asString());
	System.out.println("Status code for Test Case 3 is : "+res.statusCode());
	System.out.println("Response time for Test Case 3 in miliseconds :  "+res.getTime());
	
	}
 
   System.out.println("===================================  parsing by org JSON  ========================================");
   
   ResponseParsingUsingOrgJSON.ResponseParsing(res.asString(), "id");
   Responsehandling.Statuscode(res, 200);
   
   
   }
   
}
