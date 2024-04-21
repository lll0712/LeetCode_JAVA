/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] ans = new int[length];
        for (int i = 0, index = -length; i < ans.length; i++) {
            if (s.charAt(i) == c) {
                index = i;
            }
            ans[i] = i - index;
        }
        for (int i = length - 1, index = 2 * length; i >= 0; i--) {
            if (s.charAt(i) == c) {
                index = i;
            }
            ans[i] = Math.min(ans[i], index - i);
        }
        return ans;
    }
}
// @lc code=end
