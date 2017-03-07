package com.dc.engineering.re.solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A Social Security number CANNOT : 
 * 
 * Contain all zeroes in any specific group (ie 000-##-####, ###-00-####, or ###-##-0000)
 * Begin with ’666′.
 * Begin with any value from ’900-999′
 * Be ’078-05-1120′  (due to the Woolworth’s Wallet Fiasco)
 * Be ’219-09-9999′ (appeared in an advertisement for the Social Security Administration)
 * 
 * @author Digital Alchemist
 */
public class SSN {
	
	public static final String first_pattern = "\\d{3}-\\d{3}-\\d{4}";
	
	public static final String second_pattern = "^\\d{3}-\\d{3}-\\d{4}$";
	
	public static final String third_pattern = "^\\d{3}-\\d{3}-\\d{4}$";
	
	
	public static boolean isValidSSN(String userText){
		Pattern p = Pattern.compile(second_pattern);
		Matcher matcher = p.matcher(userText);
		
		if(matcher.find())
			return true;
		return false;
	}

}
