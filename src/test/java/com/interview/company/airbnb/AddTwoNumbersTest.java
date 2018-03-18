package com.interview.company.airbnb;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AddTwoNumbersTest {

	private static Logger LOG = LoggerFactory.getLogger(AddTwoNumbers.class);

	static AddTwoNumbers addTwoNumbers;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(10);

	@BeforeClass
	public static void setup() {
		addTwoNumbers = new AddTwoNumbers();
	}

	long start, end, diff;

	@Before
	public void start() {
		start = System.currentTimeMillis();
	}

	@After
	public void end() {
		end = System.currentTimeMillis();
		diff = end - start;
		LOG.info("diff-->" + diff);
	}

	@Test
	public void addTwoNumbersTest() {

	}
}
