package com.dc.engineering.re;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dc.engineering.re.solutions.EmailAddressRegex;

@RunWith(value = Parameterized.class)
public class EmailDomainTest {

	private String domain;
	private boolean expected;

	public EmailDomainTest(String domain, boolean expected) {
		this.domain = domain;
		this.expected = expected;
	}

	@Parameters(name = "{index}: isValid({0})={1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ "@googlem", true },
				{ "@mkyong123", true },
				{ "@mkyong-info", true },
				{ "@sub.mkyong", true },
				{ "@sub.mkyong-info", true },
				{ "@mkyong", true },
				{ "@sub.mkyong", true },
				{ "@sub.sub.mkyong", true },
				{ "@g", true },
				{ "@mkyong.t.t", true },
				{ "@mkyong.t.t", false }, // Tld
																														// must
																														// at
																														// between
																														// 2
																														// and
																														// 6
																														// long
				{ "mkyong,", false }, // comma not allowed
				{ "mkyong", false }, // no tld
				{ "mkyong.123", false }, // digit not allowed in tld
				{ ".com", false }, // must start with [A-Za-z0-9]
				{ "mkyong.a", false }, // last tld need at least two characters
				{ "mkyong.com/users", false }, // no tld
				{ "-mkyong.com", false }, // Cannot begin with a hyphen -
				{ "mkyong-.com", false }, // Cannot end with a hyphen -
				{ "sub.-mkyong.com", false }, // Cannot begin with a hyphen -
				{ "sub.mkyong-.com", false } // Cannot end with a hyphen -
		});
	}

	@Test
	public void test_validDomains() {
		EmailAddressRegex regex = new EmailAddressRegex();
		assertEquals(expected, regex.isValidEmailDomain(domain));
	}

}