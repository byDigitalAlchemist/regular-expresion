package com.dc.engineering.re;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.dc.engineering.re.solutions.SSN;

public class SSNValidatorTest {

	@Ignore
	@Test
	public void validateDashSSN(){
		assertFalse(SSN.isValidSSN("123-456-789"));
		assertTrue(SSN.isValidSSN("1234567890"));
		assertTrue(SSN.isValidSSN("123-456-7890"));

		/*
		assertFalse(SSN.isValidSSN("6664567890"));
		assertFalse(SSN.isValidSSN("666-456-7890"));
		assertTrue(SSN.isValidSSN("166-456-7890"));
		assertTrue(SSN.isValidSSN("616-456-7890"));
		assertTrue(SSN.isValidSSN("166-456-7890"));
	*/
	
	assertFalse(SSN.isValidSSN("000-000-7890"));
	assertFalse(SSN.isValidSSN("000-456-7890"));
	assertFalse(SSN.isValidSSN("123-000-7890"));
	assertFalse(SSN.isValidSSN("123-456-0000"));

	assertTrue(SSN.isValidSSN("120-003-7890"));
	assertTrue(SSN.isValidSSN("123-300-0890"));
	assertTrue(SSN.isValidSSN("123-345-0006"));
	assertTrue(SSN.isValidSSN("123-345-6000"));

	}
		
	
	@Test
	public void validateSSNWithoutDash(){
		
		assertFalse(SSN.isValidSSN("123456789"));
		assertFalse(SSN.isValidSSN("0004567890"));
		assertFalse(SSN.isValidSSN("0000007890"));
		assertTrue(SSN.isValidSSN("1000107890"));
/*
  		assertFalse(SSN.isValidSSN("1234560000"));
		assertFalse(SSN.isValidSSN("1234567000"));
		assertFalse(SSN.isValidSSN("1230007890"));
*/			
		
		
		
	}

}
