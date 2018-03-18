package com.interview.company.airbnb;

import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ConvertSortedArrayToBinarySearchTreeTest {
    static ConvertSortedArrayToBinarySearchTree obj;
    private static Logger LOG = LoggerFactory.getLogger(ConvertSortedArrayToBinarySearchTreeTest.class);
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);
    long start, end, diff;

    @BeforeClass
    public static void setup() {
        obj = new ConvertSortedArrayToBinarySearchTree();
    }

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
    public void sortedArrayToBSTTest() {

    }
}
