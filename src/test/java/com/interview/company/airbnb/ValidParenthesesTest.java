package com.interview.company.airbnb;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    static ValidParentheses validParentheses;
    private static Logger LOG = LoggerFactory.getLogger(ValidParentheses.class);
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    long start, end, diff;

    @BeforeClass
    public static void setup() {
        validParentheses = new ValidParentheses();
    }

    @Before
    public void start() {
        start = System.currentTimeMillis();
    }

    @After
    public void end() {
        end = System.currentTimeMillis();
        diff = end - start;
        LOG.info("Total Time Taken in millis: {}", diff);
    }

    @Test
    public void isValid1Test() {
        String s = "{[()]}";

        assertTrue(validParentheses.isValid1(s));


        s = "{[(]}";

        assertFalse(validParentheses.isValid1(s));
    }

    @Test
    public void isValid2Test() {
        String s = "{valid[parentheses(valid)]}";

        assertTrue(ValidParentheses.isValid2(s));


        s = "{valid[parentheses(valid]}";

        assertFalse(ValidParentheses.isValid2(s));
    }
}