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
public class MergeKSortedListsTest {
    static MergeKSortedLists mergeKSortedLists;
    private static Logger LOG = LoggerFactory.getLogger(HouseRobberTest.class);
    // @Rule
    // public Timeout globalTimeout = Timeout.seconds(10);
    long start, end, diff;

    @BeforeClass
    public static void setup() {
        mergeKSortedLists = new MergeKSortedLists();
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
    public void mergeKListsTest() {
        ListNode1 node1 = new ListNode1(1);
        ListNode1 node2 = new ListNode1(2);

        ListNode1[] lists = {node1, node2};
        ListNode1 actual = mergeKSortedLists.mergeKLists(lists);

        LOG.info("actual {}", actual);
        LOG.info("node1 {}", node1);
        assertEquals(node1, actual);
    }
}
