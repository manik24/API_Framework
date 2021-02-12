package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {

	public static String ReplaceValue(String bodydata,String var,String replace_var_by)
	{
		 return bodydata.replaceAll(Pattern.quote("{{"+var+"}}"),replace_var_by);
		
	}
}
