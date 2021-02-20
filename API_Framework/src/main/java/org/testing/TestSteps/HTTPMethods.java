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

	
	public Response GetRequest(String pathparameter,String urikey,Properties pr)
	{
		String uri=pr.getProperty(urikey)+"/"+pathparameter;
		Response res=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response GetRequestAll(String urikey,Properties pr)
	{
		String uri=pr.getProperty(urikey);
		Response res=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public Response GetRequestquery(String queryparameter,String urikey,String key_extract,Properties pr)
	{
		String uri=pr.getProperty(urikey)+"?"+key_extract+"="+queryparameter;
		Response res=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return res;
	}
	
	public  Response  PutMethod(String body_data,String Uri_key,String Pathparameter,Properties pr)
	{

		

		String uri=pr.getProperty(Uri_key)+"/"+Pathparameter;
				
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body_data)
		.when()
		.put(uri);
		
		return res;
		
		
	}

	public  Response  deleteMethod(String Pathparameter,String urikey,Properties pr)
	{

		String uri=pr.getProperty(urikey)+"/"+Pathparameter;
				
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		return res;
		
		
	}
	
}
