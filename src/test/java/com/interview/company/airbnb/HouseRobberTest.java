package com.interview.company.airbnb;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class HouseRobberTest {
    static HouseRobber houseRobber;
    private static Logger LOG = LoggerFactory.getLogger(HouseRobberTest.class);
    // @Rule
    // public Timeout globalTimeout = Timeout.seconds(10);
    long start, end, diff;

    @BeforeClass
    public static void setup() {
        houseRobber = new HouseRobber();
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
    public void rob1Test() {
        int[] nums = {6, 2, 7, 4};
        int actual = houseRobber.rob1(nums);

        LOG.info("actual1 {}", actual);
        assertEquals(13, actual);
    }

    @Test
    public void rob2Test() {
        int[] nums = {6, 2, 7, 4};
        int actual = houseRobber.rob11(nums);

        LOG.info("actual1 {}", actual);
        assertEquals(13, actual);
    }
}
