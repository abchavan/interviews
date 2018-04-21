package com.interview.company.amazon;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

        buySell.maxProfit();
    }
}