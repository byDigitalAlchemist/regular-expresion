package com.dc.engineering.re.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLTags {
	
	public static void main(String[] args) {
		HTMLTags tag = new HTMLTags();
		tag.detect("< >");
	}
	
	public boolean detect(String userText){
		String pattern = "<\\s*>";
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(userText);
		
		if(matcher.find()){
			System.out.println(" SUCCESS ");
			return true;
		}
		else{
			System.out.println(" FAIL");
			return false;
		}
	}

}
