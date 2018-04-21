package com.interview.company.airbnb;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/articles/two-sum/
public class TwoSum {


    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }


    /**
     * Approach #1 (Brute Force): The brute force approach is simple. Loop through each element xx and find if there is another value that equals to target - x.
     * <p>
     * Complexity Analysis:
     * Time complexity : O(n^2). For each element, we try to find its complement by looping through the rest of array which takes O(n) time. Therefore, the time complexity is O(n^2).
     * Space complexity : O(1).
     */
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Approach #2 (Two-pass Hash Table):Simple implementation uses two iterations. In the first iteration, we add each element's value and its index to the table. Then, in the second iteration we check if each element's complement (target - nums[i]) exists in the table. Beware that the complement must not be nums[i] itself!
     * <p>
     * Complexity Analysis:
     * Time complexity :  Time complexity : O(n). We traverse the list containing nn elements exactly twice. Since the hash table reduces the look up time to O(1), the time complexity is O(n).
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly nn elements.
     */
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Approach #3 (One-pass Hash Table):It turns out we can do it in one-pass. While we iterate and inserting elements into the table, we also look back to check if current element's complement already exists in the table. If it exists, we have found a solution and return immediately.
     * <p>
     * Complexity Analysis:
     * Time complexity :  O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements.
     */
    public int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
