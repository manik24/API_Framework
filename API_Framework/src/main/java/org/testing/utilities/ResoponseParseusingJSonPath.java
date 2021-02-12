package org.testing.utilities;

import com.jayway.restassured.response.Response;

//this method will return the corresponding value to the node that will be taken as input

public class ResoponseParseusingJSonPath {
	
	
	public static String ResponseObject(Response res,String JsonPath)
	{
		return res.jsonPath().get(JsonPath);
	}

}
