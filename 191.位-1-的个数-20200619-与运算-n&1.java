/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;

        for(int i=1;i<=32;i++){
            //与运算，如果不为0，说明n对应位置的二进制位1
            if( (n&mask)!=0 ){
                bits++;
            }

            //每次循环，mask二进制中的1左移一位
            mask <<= 1;
        }

        return bits;
    }
}
// @lc code=end

