package com.dc.engineering.re;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dc.engineering.re.solutions.SSN;

public class SSNValidatorTest {

	@Test
	public void validate(){
		
		assertFalse(SSN.isValidSSN("123456789"));
		assertFalse(SSN.isValidSSN("123-456-789"));
		
		assertTrue(SSN.isValidSSN("1234567890"));
		assertTrue(SSN.isValidSSN("123-456-7890"));
		
		assertFalse(SSN.isValidSSN("6664567890"));
		assertFalse(SSN.isValidSSN("666-456-7890"));
		
		assertTrue(SSN.isValidSSN("166-456-7890"));
	
	}

}
