package com.interview.company.airbnb;

import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

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
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);
        node1.next = node2;

        ListNode node3 = new ListNode(0);
        node2.next = node3;

        ListNode node21 = new ListNode(4);
        ListNode node22 = new ListNode(6);
        node21.next = node22;

        ListNode node23 = new ListNode(0);
        node21.next = node23;
        ListNode result = addTwoNumbers.addTwoNumbers(node1, node21);

        ListNode res1 = new ListNode(8);
        ListNode res2 = new ListNode(6);
        res1.next = res2;

        ListNode res3 = new ListNode(0);
        res2.next = res3;

        assertEquals(res1, result);

	}
}
