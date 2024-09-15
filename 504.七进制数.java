/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        int temp=0;
        while (num>=0) {
            temp=num%7;
            System.out.print(temp);
            num/=7;
        }
    }
}
// @lc code=end

