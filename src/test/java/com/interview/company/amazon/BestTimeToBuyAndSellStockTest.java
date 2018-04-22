package com.interview.company.amazon;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;


public class BestTimeToBuyAndSellStockTest {
    static BestTimeToBuyAndSellStock buySell;
    private static Logger LOG = LoggerFactory.getLogger(BestTimeToBuyAndSellStockTest.class);
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    long start, end, diff;

    @BeforeClass
    public static void setup() {
        buySell = new BestTimeToBuyAndSellStock();
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
    public void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int actual = buySell.maxProfit(prices);

        assertEquals(5, actual);

        int[] prices1 = {7, 6, 4, 3, 1};
        actual = buySell.maxProfit(prices1);
        assertEquals(0, actual);

    }
}