package com.dc.engineering.re.solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressRegex {
	
	private String pattern;
	
	public EmailAddressRegex(){
		this.pattern = "";
	}
	
	public EmailAddressRegex(String pattern){
		this.pattern = pattern;
	}
	
	public boolean isValidEmailAddress(String email){
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(email);
		
		if(matcher.find())
			return true;
		return false;
	}
}
