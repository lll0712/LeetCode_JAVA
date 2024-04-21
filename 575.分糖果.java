/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            res.add(candyType[i]);
        }
        return Math.min(res.size(), candyType.length / 2);
    }
}
// @lc code=end
