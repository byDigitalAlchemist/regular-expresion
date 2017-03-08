package com.dc.engineering.re;

import org.junit.Test;

import com.dc.engineering.re.problems.HTMLTags;

public class HTMLTagsTest {

	
	@Test
	public void testAnchor(){
		HTMLTags tag = new HTMLTags();
		
		assert(tag.detect("<a"));
	}
	
}
