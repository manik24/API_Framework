package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.response.Response;

public class ResponseParsingUsingOrgJSON {

	
	public static void ResponseParsing(String res, String searchkey)
	{
		JSONArray jsonarr= new JSONArray(res);
		int a = jsonarr.length();
		
		for(int i=1;i<=a-1;i++)
		{
			JSONObject jsonobj = jsonarr.getJSONObject(i);
			System.out.println("The data fetched from the records for "+ i +"  "+jsonobj.get(searchkey));
		}
	}
}
