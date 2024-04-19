/*
 * @lc app=leetcode.cn id=2974 lang=java
 *
 * [2974] 最小数字游戏
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[i + 1];
            res[i + 1] = nums[i];
        }
        return res;
    }
}
// @lc code=end
