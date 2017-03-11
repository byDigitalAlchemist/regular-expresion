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
	
	/**
	 * avoid garbage start and ending characters like aaa333-338-2983449dss
	 */
	public static final String second_pattern = "^\\d{3}-\\d{3}-\\d{4}$";
	
	/**
	 * 333-333-3333 or 3333333333 both Valid
	 * 333-3333333 invalid - but its allowed here
	 */
	public static final String third_pattern = "^\\d{3}-?\\d{3}-?\\d{4}$";
	
	/**
	 * only and only 333-333-3333 or 3333333333 valid
	 */
	public static final String fourth_pattern = "^(\\d{3}-\\d{3}-\\d{4})|(\\d{10})$";
	
	/**
	 * should not start with 666 but it is valid 166,616,661
	 */
	public static final String fifth_pattern = "^[01235789][01235789][01235789]((-\\d{3}-\\d{4})|(\\d{7}))$";
	
	/**
	 * http://www.regextester.com/1926
	 * Contain all zeroes in any specific group (ie 000-##-####, ###-00-####, or ###-##-0000)
	 */
	//public static final String sixth_pattern = "^((?!0{3})\\d{3}-(?!0{3})\\d{3}-(?!0{4})\\d{4})|((\\d{6}(?!0{4})\\d{4})|(\\d{7}(?!0{3})\\d{3}))$";
	
	//public static final String sixth_pattern_f = "^((?!0{3})\\d{10})$";
	//public static final String sixth_pattern_m = "^(\\d{3}(?!0{3})\\d{7})$";
	//public static final String sixth_pattern_l = "^(\\d{6}(?!0{4})\\d{4})$";
	
	
	public static final String sixth_pattern = "^(?!219-09-9999|078-05-1120)(?!666|000|9\\d{2})\\d{3}[- ]?(?!00)\\d{2}[- ]?(?!0{4})\\d{4}$";
	
	public static boolean isValidSSN(String userText){
		Pattern p = Pattern.compile(sixth_pattern);
		Matcher matcher = p.matcher(userText);

		

		
		if(matcher.find())
			return true;
		return false;
	}

}
