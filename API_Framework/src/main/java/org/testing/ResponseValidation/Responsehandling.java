package org.testing.ResponseValidation;

import org.testing.utilities.ResoponseParseusingJSonPath;
import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class Responsehandling 
{
	
	public static void Statuscode(Response res,int expectedstatuscode)
	{
	 
		
		int actualStatuscode=res.statusCode();
		//Assert.assertEquals(actualStatuscode, expectedstatuscode);
		
		 
		 if(actualStatuscode==expectedstatuscode)
		  {
		    System.out.println("Assertion passed ");
		  }
		  else{
		     System.out.println("Assertion failed"); }
		 
	}
	
	public static void Responsedatavalidate(Response res,String expectedData,String JsonPath)
	 
			{
	
		String actualdata=ResoponseParseusingJSonPath.ResponseObject(res, JsonPath);
		Assert.assertEquals(actualdata, expectedData);
		 
	}
	
	

}
