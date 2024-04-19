/*
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean isDividingNumber(int n) {
        int m = n;
        while (m > 0) {
            int temp = m % 10;
            m /= 10;
            if (temp == 0 || n % temp != 0) {
                return false;
            }
        }
        return true;

    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
// @lc code=end
