package com.dc.engineering.re;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dc.engineering.re.solutions.EmailAddressRegex;

public class EmailRegexTest {

	//@Test
	public void basicEmailTest(){
		EmailAddressRegex regex = new EmailAddressRegex();
		assertTrue(regex.isValidEmailExtension("am@gmail.com"));
		assertFalse(regex.isValidEmailExtension("am@gmail.comd"));
	}
	
	
	//@Test
	public void userNameTest(){
		EmailAddressRegex regex = new EmailAddressRegex();
		assertTrue(regex.isValidEmailExtension("am@gmail.com"));
		assertFalse(regex.isValidEmailExtension("am@gmail.comd"));
	}
	//@Test
	public void extensionTest(){
		EmailAddressRegex regex = new EmailAddressRegex();
		assertTrue(regex.isValidEmailExtension("am@gmail.com"));
		assertTrue(regex.isValidEmailExtension("am@gmail.c"));
		assertTrue(regex.isValidEmailExtension("am@gmail.co"));
		assertTrue(regex.isValidEmailExtension("am@gmail.com"));
		
		assertFalse(regex.isValidEmailExtension("am@gmail.comd"));
		assertFalse(regex.isValidEmailExtension("am@gmail."));
		assertFalse(regex.isValidEmailExtension("am@gmail.c_m"));
		assertFalse(regex.isValidEmailExtension("am@gmail"));
		
	}
	
	@Test
	public void emailExtensionTest(){
		EmailAddressRegex regex = new EmailAddressRegex();
		assertFalse(regex.isValidEmailExtension(".c"));
		assertTrue(regex.isValidEmailExtension(".co"));
		assertTrue(regex.isValidEmailExtension(".com"));
		assertFalse(regex.isValidEmailExtension(".comd"));
		assertFalse(regex.isValidEmailExtension(".com_"));
		assertFalse(regex.isValidEmailExtension(".333"));
		assertFalse(regex.isValidEmailExtension(".c_m"));
		assertFalse(regex.isValidEmailExtension("._"));
		assertFalse(regex.isValidEmailExtension("._"));
		assertFalse(regex.isValidEmailExtension("_"));
		assertFalse(regex.isValidEmailExtension(""));
		assertFalse(regex.isValidEmailExtension("ccc"));
		assertFalse(regex.isValidEmailExtension("1d"));
		assertFalse(regex.isValidEmailExtension(".c_m"));
		assertFalse(regex.isValidEmailExtension("c_m"));
		assertFalse(regex.isValidEmailExtension("."));
		assertFalse(regex.isValidEmailExtension(""));
	}
	
	
	@Test
	public void emailExtensionExtendedTest(){
		/**
		 * 
		 	.com.uk
			.co.in
			.uk.edu.in
		 */
		EmailAddressRegex regex = new EmailAddressRegex();
		//assertTrue(regex.isValidEmailExtension(".com.pk"));
	}
	
	
	@Test
	public void currentTest(){
		
		EmailAddressRegex regex = new EmailAddressRegex();
		assertTrue(regex.isValidEmailDomain("@gmail"));
		assertFalse(regex.isValidEmailDomain("@"));
		assertFalse(regex.isValidEmailDomain("gmail"));
		assertFalse(regex.isValidEmailDomain(""));
		assertFalse(regex.isValidEmailDomain("g"));
		assertTrue(regex.isValidEmailDomain("@g"));
		assertTrue(regex.isValidEmailDomain("@gms"));
		assertTrue(regex.isValidEmailDomain("@gm-sss"));
		assertTrue(regex.isValidEmailDomain("@xn--masekowski-d0b"));
		assertTrue(regex.isValidEmailDomain("@stack"));
		assertTrue(regex.isValidEmailDomain("@sta-ck"));
		assertTrue(regex.isValidEmailDomain("@sta---ck"));
		assertTrue(regex.isValidEmailDomain("@9sta--ck"));
		assertTrue(regex.isValidEmailDomain("@sta--ck9"));
		assertTrue(regex.isValidEmailDomain("@stack99"));
		assertTrue(regex.isValidEmailDomain("@99stack"));
		assertTrue(regex.isValidEmailDomain("@sta99ck"));
	
	}



}
