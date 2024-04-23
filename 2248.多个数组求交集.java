/*
 * @lc app=leetcode.cn id=2248 lang=java
 *
 * [2248] 多个数组求交集
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> as=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (!set.add(nums[i][j])) {
                    as.add(nums[i][j]);
                }
            }

        }
        return as;
    }
}
// @lc code=end

