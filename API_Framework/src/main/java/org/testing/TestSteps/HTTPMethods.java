package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.given;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;




public class HTTPMethods {
	
	public  Response  PostMethod(String body_data,String Uri_key,Properties pr)
	{

		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body_data)
		.when()
		.post(pr.getProperty(Uri_key));
		return res;
		
		
	}

}
