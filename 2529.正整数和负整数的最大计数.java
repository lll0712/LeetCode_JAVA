/*
 * @lc app=leetcode.cn id=2529 lang=java
 *
 * [2529] 正整数和负整数的最大计数
 */

// @lc code=start
class Solution {
    public int maximumCount(int[] nums) {
        int maxNum=0,minNum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0) {
                minNum++;
            }else if (nums[i]>0) {
                maxNum++;
                
            }
        }
        return Math.max(maxNum, minNum);
    }
}
// @lc code=end
