/*
 * @lc app=leetcode.cn id=2928 lang=java
 *
 * [2928] 给小朋友们分糖果 I
 */

// @lc code=start
class Solution {
    public int distributeCandies(int n, int limit) {
        return cal(n + 2) - 3 * cal(n - limit + 1) + 3 * cal(n - (limit + 1) * 2 + 2) - cal(n - 3 * (limit + 1) + 2);
    }

    public int cal(int x) {
        if (x < 0) {
            return 0;
        }
        return x * (x - 1) / 2;
    }
}

// @lc code=end

