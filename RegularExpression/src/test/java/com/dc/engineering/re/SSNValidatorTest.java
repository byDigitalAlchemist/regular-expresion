package com.dc.engineering.re;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.dc.engineering.re.solutions.SSN;

public class SSNValidatorTest {

	@Ignore
	@Test
	public void validateDashSSN() {
		assertFalse(SSN.isValidSSN("123-456-789"));
		assertTrue(SSN.isValidSSN("123456789"));
		assertTrue(SSN.isValidSSN("123-45-6789"));

		assertFalse(SSN.isValidSSN("666456789"));
		assertFalse(SSN.isValidSSN("666-45-7890"));
		assertTrue(SSN.isValidSSN("166-45-7890"));
		assertTrue(SSN.isValidSSN("616-45-7890"));
		assertTrue(SSN.isValidSSN("166-46-7890"));

		assertFalse(SSN.isValidSSN("000-00-7890"));
		assertFalse(SSN.isValidSSN("000-45-7890"));
		assertFalse(SSN.isValidSSN("123-00-7890"));
		assertFalse(SSN.isValidSSN("123-45-0000"));

		assertTrue(SSN.isValidSSN("120-03-7890"));
		assertTrue(SSN.isValidSSN("123-30-0890"));
		assertTrue(SSN.isValidSSN("123-34-0006"));
		assertTrue(SSN.isValidSSN("123-34-6000"));

	}

	@Ignore
	@Test
	public void validateSSNWithoutDash() {

		/** Middle **/
		assertFalse(SSN.isValidSSN("111000789"));
		assertFalse(SSN.isValidSSN("111000089"));
		assertFalse(SSN.isValidSSN("110000089"));
		assertTrue(SSN.isValidSSN("111100089"));

		/** First **/
		assertTrue(SSN.isValidSSN("123456789"));
		assertFalse(SSN.isValidSSN("000456789"));
		assertFalse(SSN.isValidSSN("000000789"));
		assertTrue(SSN.isValidSSN("100010789"));
		assertFalse(SSN.isValidSSN("110001789"));
		assertTrue(SSN.isValidSSN("111100789"));
		assertFalse(SSN.isValidSSN("111010000"));
		assertFalse(SSN.isValidSSN("111100000"));
		assertFalse(SSN.isValidSSN("000056789"));
		/** Last **/
		assertFalse(SSN.isValidSSN("123450000"));
		assertFalse(SSN.isValidSSN("123400000"));
		assertTrue(SSN.isValidSSN("123400001"));
		assertFalse(SSN.isValidSSN("000000000"));
		assertFalse(SSN.isValidSSN("123004576"));
		assertFalse(SSN.isValidSSN("023004576"));

		assertFalse(SSN.isValidSSN("000345678"));
		assertFalse(SSN.isValidSSN("06-648-1234"));
		assertFalse(SSN.isValidSSN("666786543"));
		assertTrue(SSN.isValidSSN("735115678"));
		assertTrue(SSN.isValidSSN("800445678"));
		
	}
	

}
