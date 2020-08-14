/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        if(x>=-9 && x<=9){
            return x;
        }

        int ans=0;
        int max=Integer.MAX_VALUE/10;
        int min=Integer.MIN_VALUE/10;

        while(x!=0){
            if(ans>max || ans<min){
                return 0;
            }

            ans=ans*10 + x%10;
            x=x/10;
        }

        return ans;
        
    }
}
// @lc code=end

