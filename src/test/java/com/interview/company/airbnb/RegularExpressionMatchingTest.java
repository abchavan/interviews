package com.interview.company.airbnb;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class RegularExpressionMatchingTest {

    static RegularExpressionMatching regularExpressionMatching;
    private static Logger LOG = LoggerFactory.getLogger(RegularExpressionMatchingTest.class);
    // @Rule
    // public Timeout globalTimeout = Timeout.seconds(10);
    long start, end, diff;

    @BeforeClass
    public static void setup() {
        regularExpressionMatching = new RegularExpressionMatching();
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
    public void isMatch1Test() {
        assertFalse(regularExpressionMatching.isMatch1("aa", "a"));
        assertTrue(regularExpressionMatching.isMatch1("aa", "aa"));
        assertFalse(regularExpressionMatching.isMatch1("aaa", "aa"));
        assertTrue(regularExpressionMatching.isMatch1("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch1("aa", ".*"));
        assertTrue(regularExpressionMatching.isMatch1("ab", ".*"));
        assertTrue(regularExpressionMatching.isMatch1("aab", "c*a*b"));

    }

    @Test
    public void isMatch2Test() {
        assertFalse(regularExpressionMatching.isMatch2("aa", "a"));
        assertTrue(regularExpressionMatching.isMatch2("aa", "aa"));
        assertFalse(regularExpressionMatching.isMatch2("aaa", "aa"));
        assertTrue(regularExpressionMatching.isMatch2("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch2("aa", ".*"));
        assertTrue(regularExpressionMatching.isMatch2("ab", ".*"));
        assertTrue(regularExpressionMatching.isMatch2("aab", "c*a*b"));

    }

    @Test
    public void isMatch3Test() {
        assertFalse(regularExpressionMatching.isMatch3("aa", "a"));
        assertTrue(regularExpressionMatching.isMatch3("aa", "aa"));
        assertFalse(regularExpressionMatching.isMatch3("aaa", "aa"));
        assertTrue(regularExpressionMatching.isMatch3("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch3("aa", ".*"));
        assertTrue(regularExpressionMatching.isMatch3("ab", ".*"));
        assertTrue(regularExpressionMatching.isMatch3("aab", "c*a*b"));

    }
}
