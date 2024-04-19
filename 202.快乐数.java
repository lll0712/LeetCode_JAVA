/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int getNext(int n) {
        int next = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            next += temp * temp;
        }
        return next;
    }

    public boolean isHappy(int n) {
        Set<Integer> res=new HashSet<>();
        while (n!=1&&!res.contains(n)) {
            res.add(n);
            n=getNext(n);
        }
        return n==1;
    }
}
// @lc code=end
