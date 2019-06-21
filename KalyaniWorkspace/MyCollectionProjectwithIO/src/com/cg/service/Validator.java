package com.cg.service;

public interface Validator {

	String aidpattern="[1-9][0-9][0-9]"; //regular expression \\d means digits and{} means the limit
	String mobilepattern="[1-9]{1}[0-9]{9}";
	//String namepattern="[A-Z]";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
	
}
