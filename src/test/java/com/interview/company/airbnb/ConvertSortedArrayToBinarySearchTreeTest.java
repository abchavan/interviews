package com.interview.company.airbnb;

import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
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

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node3.right = node4;

        assertEquals(node1, treeNode);

    }
}
