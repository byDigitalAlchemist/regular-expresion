package com.dc.engineering.re;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dc.engineering.re.solutions.SSN;

public class SSNValidatorTest {

	@Test
	public void validate(){
		
		assertFalse(SSN.isValidSSN("123456789"));
		
		
		assertTrue(SSN.isValidSSN("1234567890"));
	}

}
