package com.interview.company.airbnb;

import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

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
        LOG.info("Total Time Taken in milliseconds-->" + diff);
    }

    @Test
    public void sortedArrayToBSTTest() {
        int[] nums = {1, 2, 3, 4};

        TreeNode treeNode = obj.sortedArrayToBST(nums);
        LOG.info("treeNode-->" + treeNode);
        assertNotNull(treeNode);

    }
}
