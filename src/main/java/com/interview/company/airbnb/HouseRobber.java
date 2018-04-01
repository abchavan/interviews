package com.interview.company.airbnb;

//@see https://www.programcreek.com/2014/03/leetcode-house-robber-java/
public class HouseRobber {

    public int rob1(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        return dp[dp.length - 1];
    }

    public int rob11(int[] num) {
        if (num == null || num.length == 0)
            return 0;

        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                even += num[i];
                even = even > odd ? even : odd;
            } else {
                odd += num[i];
                odd = even > odd ? even : odd;
            }
        }

        return even > odd ? even : odd;
    }

    //Solution for problem statement 2
    public int rob2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int max1 = robHelper(nums, 0, nums.length - 2);
        int max2 = robHelper(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    public int robHelper(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i];
        }

        int[] dp = new int[nums.length];
        dp[i] = nums[i];
        dp[i + 1] = Math.max(nums[i + 1], dp[i]);

        for (int k = i + 2; k <= j; k++) {
            dp[k] = Math.max(dp[k - 1], dp[k - 2] + nums[k]);
        }

        return dp[j];
    }

    //Solution for problem statement 3
    public int rob3(TreeNode root) {
        if (root == null)
            return 0;

        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }

    public int[] helper(TreeNode root) {
        if (root == null) {
            int[] result = {0, 0};
            return result;
        }

        int[] result = new int[2];
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        // result[0] is when root is selected, result[1] is when not.
        result[0] = root.val + left[1] + right[1];
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return result;
    }
}
