package com.interview.company.airbnb;

import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertArrayEquals;

@RunWith(SpringRunner.class)
@Slf4j
public class TwoSumTest {
    static TwoSum twoSum;
    private static Logger LOG = LoggerFactory.getLogger(TwoSumTest.class);
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    // @Rule
    int[] nums = {2, 7, 11, 15};
    long start, end, diff;

    @BeforeClass
    public static void setup() {
        twoSum = new TwoSum();
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
    public void twoSum1Test() {
        int target = 9;
        int[] actual = twoSum.twoSum1(nums, target);

        int[] expected = {0, 1};

        assertArrayEquals(actual, expected);


    }

    @Test
    public void twoSum2Test() {
        int target = 9;
        int[] actual = twoSum.twoSum2(nums, target);

        int[] expected = {0, 1};

        assertArrayEquals(actual, expected);

    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum2ExceptionTest() {
        int target = 10;
        twoSum.twoSum2(nums, target);


    }

    @Test
    public void twoSum2ExceptionTest2() {

        int target = 10;

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("No two sum solution");
        twoSum.twoSum2(nums, target);


    }

    @Test
    public void twoSum3Test() {

        int target = 9;
        int[] actual = twoSum.twoSum3(nums, target);

        int[] expected = {0, 1};

        assertArrayEquals(actual, expected);


    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum3ExceptionTest() {

        int target = 10;
        twoSum.twoSum3(nums, target);


    }

    @Test
    public void twoSum3ExceptionTest2() {

        int target = 10;

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("No two sum solution");
        twoSum.twoSum4(nums, target);


    }

    @Test
    public void twoSum4Test() {

        int target = 9;
        int[] actual = twoSum.twoSum4(nums, target);

        int[] expected = {0, 1};

        assertArrayEquals(actual, expected);


    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum4ExceptionTest() {

        int target = 10;
        twoSum.twoSum4(nums, target);


    }

    @Test
    public void twoSum4ExceptionTest2() {

        int target = 10;

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("No two sum solution");
        twoSum.twoSum4(nums, target);


    }
}
