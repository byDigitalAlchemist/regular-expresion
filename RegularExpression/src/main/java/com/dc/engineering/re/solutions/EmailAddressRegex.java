package com.dc.engineering.re.solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressRegex {
	
	
	int extensionMaxLength = 3;
	
	/**
	 * @  is requried
	 * 
	 * 
	 * Group 3
	 * 	Match 2-4 letters a-z or Caps	
	 */
	
	private String extensionPattern="^\\.([a-zA-Z]){2,3}$";
	private String domainPattern ="^@(\\w)+((-)*(\\w)*)*$";
	private String pattern;
	
	public EmailAddressRegex(){
		//this("^\\w*@\\w*.\\w(?!_){1,3}$");
		this.pattern = extensionPattern;
	}
	
	public EmailAddressRegex(String pattern){
		this.pattern = pattern;
	}
	
	public boolean isValidEmailExtension(String email){
		Pattern p = Pattern.compile(extensionPattern);
		Matcher matcher = p.matcher(email);
		
		if(matcher.find()){
			System.out.println("Matched : " + email);
			return true;
		}
		
		
		System.out.println("Not Matched : "+ email);
		return false;

	}
	
	public boolean isValidEmailDomain(String email){
		Pattern p = Pattern.compile(domainPattern);
		Matcher matcher = p.matcher(email);
		
		if(matcher.find()){
			System.out.println("Matched : " + email);
			return true;
		}
		
		
		System.out.println("Not Matched : "+ email);
		return false;

	}
}
